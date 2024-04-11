package ast;

public class InsIf_Else extends Ins {
	private Exp e;
	private Ins bloqueIf;
	private Ins bloqueElse;
	
	
	public InsIf_Else(int fila, int columna, Exp e, Ins bloqueIf, Ins bloqueElse) {
        this.fila = fila;
		this.columna = columna;
		this.consIns = KindIns.IF_ELSE;
		this.bloqueIf = bloqueIf;
		this.bloqueElse = bloqueElse;
		this.e = e;
	}
	
	
	public String toString() {
		StringBuilder str = new StringBuilder("trotskif (");
		str.append(e.toString());
		str.append(") ");
		str.append(bloqueIf.toString());
		str.append("\n fidElseCastro ");
		str.append(bloqueElse.toString());
		return str.toString();
	}
}