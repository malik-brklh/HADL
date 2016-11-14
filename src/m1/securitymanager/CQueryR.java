package m1.securitymanager;

import java.util.ArrayList;

import M2.Composant.PortCpt;
import M2.Composant.PortCptRequis;
import M2.Composant.ServiceCpt;
import M2.Lien.Attachement;
import M2.Lien.BindingRequis;

public class CQueryR extends PortCptRequis {

	public CQueryR(String nom, ArrayList<ServiceCpt> serviceCS, ArrayList<PortCpt> portCpt, String nom1,
			Attachement attachement, BindingRequis bindingRequis) {
		super(nom, serviceCS, portCpt, nom1, attachement, bindingRequis);
		// TODO Auto-generated constructor stub
	}

}
