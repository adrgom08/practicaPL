
package ast;

public class ExpPunto extends EBin {
    private Exp id;
	private String campo;
	
	public ExpPunto(int fila,int columna,Exp id, String campo) {
        this.fila = fila;
	    this.columna = columna;
	    this.id = id;
	    this.campo = campo;
	    this.expTipo = KindExp.PUNTO;
	}
	
	public String toString() {
		return desig.toString() + '.' + campo;
	}
	
 }