package m1.serveur.detail.securitymanager;

import m2.Message;
import m2.composant.Composant;
import m2.composant.PortCpt;

public class SecurityManager extends Composant {

	private String validUserName = "alma2016", validPasswd = "hadl";

	public SecurityManager(String name) {
		super(name, null);
	}

	@Override
	public void sendMessage(Object sender, Message m) {
		m.addTrace("Passage par " + this.getName());
		m.addLog("en cours de test d'authentification");
		testAuth(m);
		((PortCpt) sender).sendMessage(this, m);
	}

	private void testAuth(Message m) {
		if (m.getPasswd() == validPasswd && m.getUserName() == validUserName){
			m.setAuth(true);
			m.addLog("Login valide");
		}
		else{
			m.setAuth(false);
			m.addLog("Login invalide");
		}
	}
}
