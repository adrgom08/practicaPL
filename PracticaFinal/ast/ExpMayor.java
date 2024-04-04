package ast;

public abstract class ExpMayor extends EBin {

   public ExpMayor(int fila,int columna,Exp op1, Exp op2) {
      super(fila, columna, KindExp.MAYOR, op1, op2);
   }

   public String toString() {
    return '(' + opnd1.toString() + " > " + opnd2.toString() + ')';
    }

}
