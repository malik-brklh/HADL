package m2.connecteur;

public class Glue {

    private String name;
    private RoleCntFourni roleCntFournis;
    private RoleCntRequis roleCntRequis;

    public Glue(String name, RoleCntFourni roleCntFournis, RoleCntRequis roleCntRequises) {
        this.name = name;
        this.setRoleCntFournis(roleCntFournis);
        this.setRoleCntRequis(roleCntRequises);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

  
}
