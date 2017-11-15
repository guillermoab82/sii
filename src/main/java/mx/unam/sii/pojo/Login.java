package mx.unam.sii.pojo;

public class Login {
	private String mail;
	private String password;
	
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Login [mail=");
		stringBuilder.append(mail);
		stringBuilder.append(", password=");
		stringBuilder.append(password);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
}
