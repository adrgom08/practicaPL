package ast;

public abstract class ExpResta extends EBin {

   public ExpResta(int fila,int columna,Exp op1, Exp op2) {
      super(fila, columna, KindExp.RESTA, op1, op2);
   }

   public String toString() {
    return '(' + opnd1.toString() + " - " + opnd2.toString() + ')';
    }

}
