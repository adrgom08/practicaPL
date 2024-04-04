package ast;

public abstract class ExpMult extends EBin {

   public ExpMult(int fila,int columna,Exp op1, Exp op2) {
      super(fila, columna, KindExp.MULT, op1, op2);
   }

   public String toString() {
    return '(' + opnd1.toString() + " * " + opnd2.toString() + ')';
    }

}
