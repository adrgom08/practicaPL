package ast;

public abstract class ExpUnit extends Exp {
	protected Exp opnd;
	
	public ExpUnit(int fila,int columna,KindE expTipo, Exp op) {
	    this.expTipo = expTipo;
	    this.opnd = op;
	    this.fila = fila;
	    this.columna = columna;
	}
	
	public Exp getOpnd() {return opnd;}
	
	public String toString() {
		return expTipo.toString() + '(' + opnd.toString() + ')';
	}
	public void type() throws TypeException {
		opnd.type();
	}
}
