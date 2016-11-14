package m1.connectionmanager;

import java.util.ArrayList;

import M2.Composant.Composant;
import M2.Composant.InterfaceCpt;

public class ConnectionManager extends Composant {
 ArrayList<DbQueryF> LDbQueryF= new ArrayList<>();
 ArrayList<DbQueryR> LDbQueryR= new ArrayList<>();
 ArrayList<ExternalSocketF> LExternalSocketF= new ArrayList<>();
 ArrayList<ExternalSocketR> LExternalSocketR= new ArrayList<>();
 ArrayList<SecurityCheckF> LSecurityCheckF= new ArrayList<>();
 ArrayList<SecurityCheckR> LSecurityCheckR= new ArrayList<>();
 public ConnectionManager(String nom, String nom1, ArrayList<InterfaceCpt> interfaceCpt) {
		super(nom, nom1, interfaceCpt);
		// TODO Auto-generated constructor stub
	}

}
