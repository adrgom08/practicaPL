package ast;

public class ExpPos extends EUnit {

   public ExpPos(int fila,int columna,Exp op) {
      super(fila, columna, KindExp.POS, op);
   }

   public String toString() {
    return "(+" + opnd.toString() + ')';
    }

}
