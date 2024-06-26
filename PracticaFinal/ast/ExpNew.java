package ast;

public class ExpNew extends Exp {
	private Type tipoRes;

	public ExpNew(int fila, int columna, Type tipoRes) {
		this.fila = fila;
		this.columna = columna;
		this.tipoRes = tipoRes;
		this.tipoExp = KindExp.NEW;
	}

	public String toString() {
		return "new" + tipoRes.toString();
	}
}