package mx.unam.sii.pojo;

public class Login {
	private String usr;
	private String password;
	
	/**
	 * @return the mail
	 */
	public String getUsr() {
		return usr;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setUsr(String mail) {
		this.usr = mail;
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
		stringBuilder.append("Login [usr=");
		stringBuilder.append(usr);
		stringBuilder.append(", password=");
		stringBuilder.append(password);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
}
