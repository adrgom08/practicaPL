package ast;

public class DecVarConst extends DecVar {
	private Ins asig;

	public DecVarConst(int fila,int columna,String iden, Type tipo, Ins asig) {
		super(fila,columna,id,tipo);
		this.decTipo = KindDec.CONSTANTE;
		this.asig = asig;
	}
	
	public String toString() { // var const lenInt N := 20
		return "var const " + tipo.toString() + asig.toString();
	}
}
