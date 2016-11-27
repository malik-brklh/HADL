package m2;

public class Message {

	private String userName;
	private String passwd;
	private boolean auth = false;
	private String value;
	private String trace="";
	private String log="";
	
	
	
	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public boolean isAuth() {
		return auth;
	}

	public void setAuth(boolean auth) {
		this.auth = auth;
	}

	public Message() {
		super();
	}

	public Message(String userName, String passwd) {
		super();
		this.userName = userName;
		setPasswd(passwd);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String getTrace() {
		return trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}

	public void addTrace(String trace){
		this.trace+=trace+"\n";
	}
	public void addLog(String log){
		this.log+=log+"\n";
	}
}
