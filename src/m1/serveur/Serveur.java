package m1.serveur;

import java.util.ArrayList;

import M2.Composant.Composant;
import M2.Composant.InterfaceCpt;

public class Serveur  extends Composant{
	private ArrayList<ReceiveRequest> prtReceiveRequest;
	private ArrayList<SendResponse> prtSendResponse;
	public Serveur(String nom, String nom1, ArrayList<InterfaceCpt> interfaceCpt) {
		super(nom, nom1, interfaceCpt);
		// TODO Auto-generated constructor stub
	}

}
