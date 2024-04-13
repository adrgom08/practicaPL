package ast;

public class DecType extends Dec {
	public DecType(int fila, int columna, String id, Type tipo) {
		super(fila, columna, tipo, id);
		this.tipoDec = KindDec.TIPO;
	}

	public String toString() {
		return "type " + id + " := " + tipo.toString() + ';';
	}
}