package beans;

import java.io.Serializable;

public class Utente implements Serializable {
	private static final long serialVersionUTD = 1L;
	
	private String username;
	private String password;
	
	// Costruttore vuoto
	
	public Utente() {
		
	}

	// Costruttore con username e password
	public Utente(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
