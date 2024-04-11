package ast;

public class InsAsign extends Ins {
	private Exp e1,e2;
	
	public InsAsign(int fila,int columna,Exp e1, Exp e2) {
        this.fila = fila;
		this.columna = columna;
        this.consIns = KindIns.ASIG;
		this.e1 = e1;
		this.e2 = e2;
	}
	
	public String toString() {
		return e1.toString() + " := " + e2.toString() +";"; 
	}
}