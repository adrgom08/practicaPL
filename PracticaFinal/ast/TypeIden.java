package ast;

public class TypeIden extends Type {
	private String id;
	private int fila;
	private int columna;
	
	public TypeIden (int fila, int columna, String id) {
        this.fila = fila;
		this.columna = columna;
		this.tipoType = KindType.IDEN;
		this.id = id;
	}
	
	public String toString() {return id;}
}
	