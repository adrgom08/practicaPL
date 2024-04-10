package ast;

public abstract class ExpMod extends EBin {

   public ExpMod(int fila,int columna,Exp op1, Exp op2) {
      super(fila, columna, KindExp.MOD, op1, op2);
   }

   public String toString() {
    return '(' + opnd1.toString() + " % " + opnd2.toString() + ')';
    }

}
