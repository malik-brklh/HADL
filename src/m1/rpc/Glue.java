package m1.rpc;

import java.util.ArrayList;

import M2.Connecteur.RoleCntFourni;
import M2.Connecteur.RoleCntRequis;

public class Glue  extends M2.Connecteur.Glue {

	public Glue(String name, ArrayList<RoleCntFourni> roleCntFournis, ArrayList<RoleCntRequis> roleCntRequises) {
		super(name, roleCntFournis, roleCntRequises);
		// TODO Auto-generated constructor stub
	}

}