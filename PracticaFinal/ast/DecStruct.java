package ast;

import java.util.ArrayList;
import java.util.HashMap;

public class DecStruct extends Dec {
    private ArrayList<Dec> listaDs;

    public DecStruct(int fila, int columna, String id, Type tipo, ArrayList<Dec> listaDs) {
        super(fila, columna, tipo, id);
        this.decTipo = KindDec.STRUCT;
        this.listaDs = listaDs;
    }

    public String toString() {
        StringBuilder str = new StringBuilder("stalinTruct ");
        str.append(iden);
        str.append(" {\n");
        for (Dec dec : listaDs) {
            str.append(dec.toString());
            str.append('\n');
        }
        str.append('}');
        str.append('\n');
        return str.toString();
    }
}