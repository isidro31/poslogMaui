package cl.maui.poslogMaui.enums;

public enum InventoryDocumentType {
	ADJUSTMENT("ADJUSTMENT"),
	RECEIVING("RECEIVING"),

	SHIPPING("SHIPPING")
	;

	private final String value;

	InventoryDocumentType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}

