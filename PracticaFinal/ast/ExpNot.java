package ast;

public class ExpNot extends EUnit {

    public ExpNot(int fila, int columna, Exp op) {
       super(fila, columna, KindExp.NOT, op);
    }
 
    public String toString() {
     return "(!" + opnd.toString() + ')';
     }
 
 }
 