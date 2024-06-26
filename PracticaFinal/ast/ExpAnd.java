package ast;

public class ExpAnd extends EBin {
   public ExpAnd(int fila, int columna, Exp op1, Exp op2) {
      super(fila, columna, KindExp.AND, op1, op2);
   }

   public String toString() {
      return '(' + opnd1.toString() + " && " + opnd2.toString() + ')';
   }

}
