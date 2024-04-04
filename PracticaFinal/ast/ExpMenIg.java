package ast;

public abstract class ExpMenIg extends EBin {

   public ExpMenIg(int fila,int columna,Exp op1, Exp op2) {
      super(fila, columna, KindExp.MENORIGUAL, op1, op2);
   }

   public String toString() {
    return '(' + opnd1.toString() + " <= " + opnd2.toString() + ')';
    }

}
