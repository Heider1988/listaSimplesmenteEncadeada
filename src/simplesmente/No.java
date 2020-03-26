package simplesmente;

import dados.Item;

public class No {

	private Item info;
	private No prox;

	public No(Item elem) {
		this.prox = null;
		this.info = elem;
	}

	public Item getInfo() {
		return info;
	}

	public void setInfo(Item elem) {
		this.info = elem;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No novoNo) {
		this.prox = novoNo;
	}

	

}
