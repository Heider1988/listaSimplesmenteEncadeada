package simplesmente;

import dados.Item;

public class ListaSimpes {

	private No prim;
	private No ult;
	private int quantNos;

	public ListaSimpes() {
		this.prim = null;
		this.ult = null;
		this.quantNos = 0;
	}

	public No getPrim() {
		return prim;
	}

	public void setPrim(No novoNo) {
		this.prim = novoNo;
	}

	public No getUlt() {
		return ult;
	}

	public void setUlt(No novoNo) {
		this.ult = novoNo;
	}

	public int getQuantNos() {
		return quantNos;
	}

	public void setQuantNos(int novoValor) {
		this.quantNos = novoValor;
	}

	public boolean eVazia() {
		return (this.quantNos == 0);
	}

}
