package m1.sqlrequest;

import java.util.ArrayList;

import M1.RPC.Called;
import M1.RPC.Caller;
import M1.RPC.Glue;
import M2.Composant.InterfaceCpt;
import M2.Connecteur.Connecteur;

public class SqlRequest  extends Connecteur{
 ArrayList<M1.RPC.Glue> Glue= new ArrayList<>();
 ArrayList<Caller> LCaller=new ArrayList<>();
 ArrayList<Called> LCalled=new ArrayList<>();

	
	public SqlRequest(String name, ArrayList<Glue> glue, ArrayList<InterfaceCpt> interfaceCpts) {
		super(name, glue, interfaceCpts);
		// TODO Auto-generated constructor stub
	}

}
