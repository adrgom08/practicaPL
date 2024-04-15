package ast;

public class ExpMenor extends EBin {

   public ExpMenor(int fila, int columna, Exp op1, Exp op2) {
      super(fila, columna, KindExp.MENOR, op1, op2);
   }

   public String toString() {
      return '(' + opnd1.toString() + " < " + opnd2.toString() + ')';
   }

}
