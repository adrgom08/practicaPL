package ast;

import java.util.ArrayList;

public class ExpFun extends Exp {
    Exp id;
    ArrayList<Exp> params;

    public ExpFun(int fila, int columna, Exp id, ArrayList<Exp> params) {
        this.fila = fila;
        this.columna = columna;
        this.id = id;
        this.params = params;
        this.tipoExp = KindExp.FUNCION;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(id.toString());
        str.append('(');
        for (Exp e : params) {
            str.append(e.toString());
        }
        str.deleteCharAt(str.length() - 1);
        str.append(")\n");

        return str.toString();
    }
}
