package m2;

public abstract class ElementArchitecturale {

    private String name;
    private ElementArchitecturale parent;

    public ElementArchitecturale(String name, ElementArchitecturale parent) {
		super();
		this.name = name;
		this.parent = parent;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public ElementArchitecturale getParent() {
		return parent;
	}

	public void setParent(ElementArchitecturale parent) {
		this.parent = parent;
	}
	
	public abstract void sendMessage(Object sender, Message m);
}
