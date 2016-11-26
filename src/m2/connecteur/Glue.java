package m2.connecteur;

import m2.ElementArchitecturale;

public class Glue {

    private RoleCntFourni roleCntFournis;
    private RoleCntRequis roleCntRequis;
    private ElementArchitecturale parent;
    
    public Glue(ElementArchitecturale parent, InterfaceCnt called, InterfaceCnt caller) {
        this.setRoleCntFournis((RoleCntFourni) called);
        this.setRoleCntRequis((RoleCntRequis) caller);
        this.setParent(parent);
    }

	public RoleCntRequis getRoleCntRequis() {
		return roleCntRequis;
	}

	public void setRoleCntRequis(RoleCntRequis roleCntRequis) {
		this.roleCntRequis = roleCntRequis;
	}

	public RoleCntFourni getRoleCntFournis() {
		return roleCntFournis;
	}

	public void setRoleCntFournis(RoleCntFourni roleCntFournis) {
		this.roleCntFournis = roleCntFournis;
	}

//	public void sendMessage(Object sender, Message m){
//		
//	}

	public ElementArchitecturale getParent() {
		return parent;
	}

	public void setParent(ElementArchitecturale parent) {
		this.parent = parent;
	}
  
	
}
