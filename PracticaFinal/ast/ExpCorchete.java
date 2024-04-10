package ast;

public class ExpCorchete extends EBin {

    public ExpCorchete (int fila, int columna, Exp op1, Exp op2) {
        super(fila, columna, KindExp.CORCHETE, op1, op2);
    }
 
    public String toString() {
        return '(' + opnd1.toString() + '[' + opnd2.toString() + "])";
    }
 
 }