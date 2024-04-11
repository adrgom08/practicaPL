package ast;

public class InsIf extends Ins {
    private Exp e;
	private Ins bloque;

	public InsIf_Simple(int fila,int columna,Exp e, Ins bloque) {
        this.fila = fila;
		this.columna = columna;
		this.consIns = KindIns.IF;
		this.bloque = bloque;
		this.e = e;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder("trotskIf (");
		str.append(e.toString());
		str.append(") ");
		str.append(bloque.toString());
		return str.toString();
	}
}