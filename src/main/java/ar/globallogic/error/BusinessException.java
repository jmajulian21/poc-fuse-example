package ar.globallogic.error;

public class BusinessException extends Exception {
	private static final long serialVersionUID = 1L;
	private String errorCodigo;
	private String errorTipo;

	public BusinessException() {}
	
	public BusinessException(String message) {
		super(message);
		this.setErrorTipo("Negocio");
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
