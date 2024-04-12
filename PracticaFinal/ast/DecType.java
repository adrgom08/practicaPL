package ast;

public class DecType extends Dec {
	public DecType(int fila, int columna, String id, Type tipo) {
		this.fila = fila;
		this.columna = columna;
		this.tipoDec = KindDec.TIPO;
		this.id = id;
		this.tipo = tipo;
	}

	public String toString() {
		return "type " + id + " := " + tipo.toString() + ';';
	}
}