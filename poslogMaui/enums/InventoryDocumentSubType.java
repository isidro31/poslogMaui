package cl.maui.poslogMaui.enums;

public enum InventoryDocumentSubType {

    REPLENISHMENT("REPLENISHMENT"),

    ADJUSTMENT("ADJUSTMENT"),

    STORE_TRANSFER("STORE_TRANSFER");

    private final String value;

    InventoryDocumentSubType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
