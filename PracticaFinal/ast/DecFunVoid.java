package ast;

import java.util.ArrayList;

public class DecFunVoid extends Dec {
    private ArrayList<Dec> args;
    private Ins bloque;
    private String id;
    private int maxSize;

    public DecFunVoid(int fila, int columna, Type tipo, String id, ArrayList<Dec> args, Ins bloque) {
        super(fila, columna, tipo, id);
        this.decTipo = KindDec.FUNVOID;
        this.args = args;
        this.bloque = bloque;
    }

    public String toString() {
        StringBuilder str = new StringBuilder("fun void ");
        str.append(iden);
        str.append('(');
        for (Dec dec : args) {
            str.append(dec.toString());
            str.append(", ");
        }
        str.delete(str.length() - 2, str.length());
        str.append(") ");
        str.append("{\n");
        str.append(bloque.toString());
        str.append("\n}");
        return str.toString();
    }
}