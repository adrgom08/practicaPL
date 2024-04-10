
package ast;

public class ExpPunto extends EBin {

    public ExpPunto (int fila, int columna, Exp op1, Exp op2) {
        super(fila, columna, KindExp.PUNTO, op1, op2);
    }
 
    public String toString() {
        return '(' + opnd1.toString() + '.' + opnd2.toString() + ')';
    }
 }