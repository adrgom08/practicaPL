package ast;

public abstract class ExpUnit extends Exp {
	protected Exp opnd;
	
	public ExpUnit(int fila,int columna,KindE expTipo, Exp op) {
	    this.tipoExp = expTipo;
	    this.opnd = op;
	    this.fila = fila;
	    this.columna = columna;
	}
	
	public Exp getOpnd() {return opnd;}
	
	public String toString() {
		return tipoExp.toString() + '(' + opnd.toString() + ')';
	}
	public void type() throws TypeException {
		opnd.type();
	}
}
