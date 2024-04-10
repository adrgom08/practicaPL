package ast;

public class ExpNeg extends EUnit {

   public ExpNeg(int fila,int columna,Exp op) {
      super(fila, columna, KindExp.NEG, op);
   }

   public String toString() {
    return "(-" + opnd.toString() + ')';
    }
}
