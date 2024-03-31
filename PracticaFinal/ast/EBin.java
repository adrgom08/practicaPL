package ast;

public abstract class EBin extends Exp {
   protected Exp opnd1;
   protected Exp opnd2;

   public ExpBin(int fila,int columna,KindE expTipo, Exp opnd1, Exp opnd2) {
      this.expTipo = expTipo;
      this.opnd1 = opnd1;
      this.opnd2 = opnd2;
      this.fila = fila;
      this.columna = columna;
   }
   public Exp opnd1() {return opnd1;}
   public Exp opnd2() {return opnd2;}    
   public String toString() {
		  return expTipo.toString() + '(' + opnd1.toString() + ',' + opnd2.toString() + ')';
	 }
}
