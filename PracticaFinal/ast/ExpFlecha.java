package ast;

public class ExpFlecha extends EBin {
    private Exp id;
	private String campo;
	
	public ExpFlecha(int fila, int columna, Exp id, String campo) {
        this.fila = fila;
	    this.columna = columna;
        this.id = id;
	    this.campo = campo;
	    this.expTipo = KindExp.FLECHA;
	}
	
	public String toString() {
		return id.toString() + '->' + campo;
	}
 }