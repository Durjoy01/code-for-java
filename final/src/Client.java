public class Client extends User{
	private int clientId;
	private int clientType;
	
	public Client(String name,String email,int clientId,int clientType) {
		super(name,email);
		this.clientId = clientId;
		this.clientType = clientType;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getClientType() {
		return clientType;
	}

	public void setClientType(int clientType) {
		this.clientType = clientType;
	}

	@Override
	public String toString() {
		return "Client [name=" + this.getName()+", email=" +this.getEmail()+",clientId=" + clientId + ", clientType=" + clientType + "]";
	}
	
	

}