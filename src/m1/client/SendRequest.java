package m1.client;

import java.util.ArrayList;

import M2.Composant.PortCpt;
import M2.Composant.PortCptFourni;
import M2.Composant.ServiceCpt;
import M2.Lien.Attachement;
import M2.Lien.Binding;

public class SendRequest extends PortCptFourni {

	public SendRequest(String nom, ArrayList<ServiceCpt> serviceCS, ArrayList<PortCpt> portCpt, String nom1,
			Attachement attachement) {
		super(nom, serviceCS, portCpt, nom1, attachement);
		// TODO Auto-generated constructor stub
	}

	
}
