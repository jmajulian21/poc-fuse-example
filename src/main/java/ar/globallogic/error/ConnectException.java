package ar.globallogic.error;

public class ConnectException extends TechnicalException{
	private static final long serialVersionUID = 1L;

	public ConnectException(String message) {
		super(message);
		this.setErrorCodigo("PROV-003");
	}
	
}
