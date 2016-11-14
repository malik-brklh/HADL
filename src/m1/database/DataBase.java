package m1.database;

import java.util.ArrayList;

import M2.Composant.Composant;
import M2.Composant.InterfaceCpt;

public class DataBase extends Composant {
 ArrayList< QueryManF> LQueryManF = new ArrayList<>();
 ArrayList< QueryManR> LQueryManR = new ArrayList<>();
 ArrayList<  SecurityManF> LSecurityManF = new ArrayList<>();
 ArrayList<  SecurityManR> LSecurityManR = new ArrayList<>();

 public DataBase(String nom, String nom1, ArrayList<InterfaceCpt> interfaceCpt) {
		super(nom, nom1, interfaceCpt);
		// TODO Auto-generated constructor stub
	}

}
