package m1;

import m2.Message;
import m2.configuration.Configuration;

public class ClientServeur extends Configuration{


	public ClientServeur(String name) {
		super(name, null);
	}

	@Override
	public void sendMessage(Object sender, Message m) {
		System.out.println("*** Reception de la réponse ***\nLa valeur du message = " + m.getValue()
		+ "\n-------------------trace du message----------------------" + "\n" + m.getTrace()
		+"\n-------------------log------------------"+ "\n" + m.getLog());
	}

}
