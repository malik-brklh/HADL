package m1.serveur;

import java.util.ArrayList;

import M2.Composant.PortCpt;
import M2.Composant.PortCptFourni;
import M2.Composant.ServiceCpt;
import M2.Lien.Attachement;

public class SendResponse  extends PortCptFourni {

	public SendResponse(String nom, ArrayList<ServiceCpt> serviceCS, ArrayList<PortCpt> portCpt, String nom1,
			Attachement attachement) {
		super(nom, serviceCS, portCpt, nom1, attachement);
		// TODO Auto-generated constructor stub
	}

}
