package ast;

import java.util.ArrayList;

public class DecStruct extends Dec {
    private ArrayList<Dec> listaDs;

    public DecStruct(int fila, int columna, String id, Type tipo, ArrayList<Dec> listaDs) {
        super(fila, columna, tipo, id);
        this.tipoDec = KindDec.STRUCT;
        this.listaDs = listaDs;
    }

    public String toString() {
        StringBuilder str = new StringBuilder("stalinTruct ");
        str.append(id);
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