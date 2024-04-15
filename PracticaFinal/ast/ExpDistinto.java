package ast;

public class ExpDistinto extends EBin {

   public ExpDistinto(int fila, int columna, Exp op1, Exp op2) {
      super(fila, columna, KindExp.DISTINTO, op1, op2);
   }

   public String toString() {
      return '(' + opnd1.toString() + " != " + opnd2.toString() + ')';
   }

}
