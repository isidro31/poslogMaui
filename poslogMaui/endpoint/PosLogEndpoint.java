package cl.maui.poslogMaui.endpoint;


import com.google.gson.Gson;

import cl.maui.poslogMaui.enums.InventoryDocumentSubType;
import cl.maui.poslogMaui.enums.InventoryDocumentType;
import cl.maui.poslogMaui.exception.OracleCustomException;
import cl.maui.poslogMaui.service.OCIService;
import dtv.xcenter.poslog.ws.v21.PostTransaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.HashMap;
import java.util.Map;

@Endpoint
@Slf4j
public class PosLogEndpoint {
    private static final String NAMESPACE = "http://v21.ws.poslog.xcenter.dtv/";
    private final OCIService ociService;

    @Value("${app.oic.inventoryAdjustment.url}")
    private String invAdjustUrl;

    @Value("${app.oic.receiving.url}")
    private String receivingUrl;

    @Value("${app.oic.asnout.url}")
    private String asnoutUrl;



    @PayloadRoot(namespace = NAMESPACE, localPart = "postTransaction")
    @ResponsePayload
    public void postTransaction(@RequestPayload PostTransaction postTransaction) throws OracleCustomException {

        try {
            if (postTransaction.getTransaction().getInventoryDocumentType().equals(InventoryDocumentType.ADJUSTMENT.getValue()) ||
                    postTransaction.getTransaction().getInventoryDocumentSubType().equals(InventoryDocumentSubType.ADJUSTMENT.getValue())) {
                handleOCIIntegration(postTransaction, invAdjustUrl);
            } else if (postTransaction.getTransaction().getInventoryDocumentType().equals(InventoryDocumentType.RECEIVING.getValue()) ||
                    postTransaction.getTransaction().getInventoryDocumentSubType().equals(InventoryDocumentSubType.REPLENISHMENT.getValue())) {
                handleOCIIntegration(postTransaction, receivingUrl);
            } else if (postTransaction.getTransaction().getInventoryDocumentType().equals(InventoryDocumentType.SHIPPING.getValue()) &&
                    postTransaction.getTransaction().getInventoryDocumentSubType().equals(InventoryDocumentSubType.STORE_TRANSFER.getValue())) {
                handleOCIIntegration(postTransaction, asnoutUrl);

            }else {
                //log.error("This is not a valid XML.");
                throw new OracleCustomException("This is not a valid XML for this service", HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            throw new OracleCustomException("Failed to call ociIntegrationHandler : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public void handleOCIIntegration(PostTransaction postTransaction, String url) throws OracleCustomException {
        try {
            Map<String, Object> posLogWrapper = new HashMap<>();
            posLogWrapper.put("POSLog", postTransaction);

            Gson jsonPosLog = new Gson();
            String json = jsonPosLog.toJson(posLogWrapper);

            ociService.ociIntegrationHandler(json, url);

        } catch (OracleCustomException e) {
            throw new OracleCustomException("Failed to call ociIntegrationHandler : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    public PosLogEndpoint(OCIService ociService) {
        this.ociService = ociService;
    }
}
