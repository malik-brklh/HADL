package m1.rpc;

import java.util.ArrayList;

import M2.Composant.InterfaceCpt;
import M2.Connecteur.Connecteur;

public class RPC  extends Connecteur{
	ArrayList<Caller> LCallres=new ArrayList<>();
	  ArrayList<Called> LCallred=new ArrayList<>();
	  ArrayList<M1.RPC.Glue> Glue=new ArrayList<>();
		
  public RPC(String name, ArrayList<M1.RPC.Glue> glue, ArrayList<InterfaceCpt> interfaceCpts) {
		super(name, glue, interfaceCpts);
		// TODO Auto-generated constructor stub
	}


}
