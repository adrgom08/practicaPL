package ast;

public class InsDelete extends Ins {
	private Exp e;
	
	public InsDelete(int fila,int columna,Exp e) {
        this.fila = fila;
		this.columna = columna;
		this.e = e;
		this.consIns = KindIns.DELETE;
	}

	
	public String toString() {
		return " delete " + e.toString() + ";";
	}
}