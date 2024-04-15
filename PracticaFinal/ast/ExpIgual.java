package ast;

public class ExpIgual extends EBin {

   public ExpIgual(int fila, int columna, Exp op1, Exp op2) {
      super(fila, columna, KindExp.IGUAL, op1, op2);
   }

   public String toString() {
      return '(' + opnd1.toString() + " == " + opnd2.toString() + ')';
   }

}
