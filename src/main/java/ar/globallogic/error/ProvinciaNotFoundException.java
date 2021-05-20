package ar.globallogic.error;

public class ProvinciaNotFoundException extends BusinessException {
	private static final long serialVersionUID = 1L;

	public ProvinciaNotFoundException() {
		super("Error no se ha encontrado provincias");
		this.setErrorCodigo("PROV-001");
	}

}
