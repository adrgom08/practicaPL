package ast;

public class ExpNew extends Exp {
	private Type tipoReserva;
	
	public ExpNew(int fila, int columna, Type tipoReserva) {
        this.fila= fila;
		this.columna = columna;
		this.tipoReserva = tipoReserva;
		this.expTipo = KindExp.NEW;
	}
	
	public String toString() {
		return "new" + tipoReserva.toString();  
	}
}