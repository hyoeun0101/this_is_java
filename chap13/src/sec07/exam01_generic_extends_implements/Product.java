package sec07.exam01_generic_extends_implements;

public class Product <T,M>{
	private T kind;
	private M model;
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
	

}

class Tv{}