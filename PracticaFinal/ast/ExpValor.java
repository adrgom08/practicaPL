package ast;

public class ExpValor extends EUnit {

    public ExpValor(int fila, int columna, Exp op) {
       super(fila, columna, KindExp.VALOR, op);
    }
 
    public String toString() {
     return "(*" + opnd2.toString() + ')';
     }
 
}
 