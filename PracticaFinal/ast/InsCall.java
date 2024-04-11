package ast;

public class InsCall extends Ins {
	private Exp fun;
	
	public InsCall(int fila, int columna, Exp fun) {
        this.fila = fila;
		this.columna = columna;
		this.fun = fun;
		this.consIns = KindIns.CALL;
	}
	
	public String toString() {
		return "call " + fun.toString() + ';';
	}
}