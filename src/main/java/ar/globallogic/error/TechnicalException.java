package ar.globallogic.error;

public class TechnicalException extends Exception {
	private static final long serialVersionUID = 1L;
	private String errorCodigo;
	private String errorTipo;
	
	public TechnicalException(String message) {
		super(message);
		this.setErrorCodigo("PROV-002");
		this.setErrorTipo("Tecnico");
	}
	
	public String getErrorCodigo() {
		return errorCodigo;
	}
	public void setErrorCodigo(String errorCodigo) {
		this.errorCodigo = errorCodigo;
	}
	public String getErrorTipo() {
		return errorTipo;
	}
	public void setErrorTipo(String errorTipo) {
		this.errorTipo = errorTipo;
	}
}
