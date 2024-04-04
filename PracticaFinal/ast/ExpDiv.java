package ast;

public abstract class ExpDiv extends EBin {

   public ExpDiv(int fila,int columna,Exp op1, Exp op2) {
      super(fila, columna, KindExp.DIV, op1, op2);
   }

   public String toString() {
    return '(' + opnd1.toString() + " / " + opnd2.toString() + ')';
    }

}
