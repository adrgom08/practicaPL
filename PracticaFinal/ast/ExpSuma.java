package ast;

public abstract class ExpSuma extends EBin {

   public ExpSuma(int fila,int columna,Exp op1, Exp op2) {
      super(fila, columna, KindExp.SUMA, op1, op2);
   }

   public String toString() {
    return '(' + opnd1.toString() + " + " + opnd2.toString() + ')';
    }

}
