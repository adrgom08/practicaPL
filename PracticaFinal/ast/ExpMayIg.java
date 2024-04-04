package ast;

public abstract class ExpMayIg extends EBin {

   public ExpMayIg(int fila,int columna,Exp op1, Exp op2) {
      super(fila, columna, KindExp.MAYORIGUAL, op1, op2);
   }

   public String toString() {
    return '(' + opnd1.toString() + " >= " + opnd2.toString() + ')';
    }

}
