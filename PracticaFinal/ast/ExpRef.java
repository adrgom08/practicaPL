package ast;

public class ExpRef extends EUnit {

    public ExpRef(int fila, int columna, Exp op) {
       super(fila, columna, KindExp.REF, op);
    }
 
    public String toString() {
     return "(#" + opnd.toString() + ')';
     }
 
 }
 