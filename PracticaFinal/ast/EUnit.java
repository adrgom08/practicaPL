package ast;

public abstract class EUnit extends Exp {
	protected Exp opnd;
	
	public EUnit(int fila, int columna, KindExp expTipo, Exp op) {
	    this.tipoExp = expTipo;
	    this.opnd = op;
	    this.fila = fila;
	    this.columna = columna;
	}
	
	public Exp getOpnd() {return opnd;}
	
	public String toString() {
		return tipoExp.toString() + '(' + opnd.toString() + ')';
	}
}
