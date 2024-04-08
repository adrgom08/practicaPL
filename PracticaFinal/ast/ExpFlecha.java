package ast;

public class ExpFlecha extends EBin {

    public ExpFlecha (int fila, int columna, Exp op1, Exp op2) {
        super(fila, columna, KindExp.FLECHA, op1, op2);
    }
 
    public String toString() {
        return '(' + opnd1.toString() + "->" + opnd2.toString() + ')';
    }
 
 }