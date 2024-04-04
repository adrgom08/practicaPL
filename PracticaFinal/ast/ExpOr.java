package ast;

public abstract class ExpOr extends EBin {

   public ExpOr(int fila,int columna,Exp op1, Exp op2) {
      super(fila, columna, KindExp.OR, op1, op2);
   }

   public String toString() {
    return '(' + opnd1.toString() + " || " + opnd2.toString() + ')';
    }

}
