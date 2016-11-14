package m1.securitymanager;

import java.util.ArrayList;

import M2.Composant.Composant;
import M2.Composant.InterfaceCpt;

public class SecurityManager  extends Composant{
 ArrayList< CQueryF> LCQueryF = new ArrayList<>();
 ArrayList< CQueryR> LCQueryR = new ArrayList<>();
 ArrayList<  SecurityAuthF> LSecurityAuthF = new ArrayList<>();
 ArrayList<  SecurityAuthR> LSecurityAuthR = new ArrayList<>();
	public SecurityManager(String nom, String nom1, ArrayList<InterfaceCpt> interfaceCpt) {
		super(nom, nom1, interfaceCpt);
		// TODO Auto-generated constructor stub
	}

}
