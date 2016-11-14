package m1.client;

import java.util.ArrayList;

import M2.Composant.Composant;
import M2.Composant.InterfaceCpt;

public class Client extends Composant {
	private ArrayList<ReceiveResponse> prtReceiveRes;
	private ArrayList<SendRequest> prtSendReq;
	
	public Client(String nom, String nom2, ArrayList<InterfaceCpt> interfaceCpt) {
		super(nom, nom2, interfaceCpt);
		// TODO Auto-generated constructor stub
		
	}

}
