package ast;

public class DecVarIni extends DecVar {
	private Ins asig;

	public DecVarIni(int fila, int columna, String id, Type tipo, Ins asig) {
		super(fila, columna, id, tipo);
		this.asig = asig;
	}

	public String toString() { // var lenInt x := 3
		return "var " + tipo.toString() + " " + asig.toString();
	}
}