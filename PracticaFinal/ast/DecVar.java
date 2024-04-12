package ast;

public class DecVar extends Dec {
	public DecVar(int fila,int columna, String id, Type tipo) {
        this.fila = fila;
		this.columna = columna;
		this.id = id;
		this.tipo = tipo;
		this.decTipo = KindDec.VARIABLE;
	}
	
	public String toString() {
		return "var " + tipo.toString() + id.toString() + ";";
	}
}