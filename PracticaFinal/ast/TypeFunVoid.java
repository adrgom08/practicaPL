package ast;

import java.util.ArrayList;

public class TypeFunVoid extends Type {
    private ArrayList<Dec> listaArgs;
    private HashMap<String, Dec> dicArgs;

    public TypeFunVoid(ArrayList<Dec> listaArgs) {
        this.tipoType = KindType.FUNVOID;
        this.listaArgs = listaArgs;
        this.dicArgs = new HashMap<String, Dec>();
        for (Dec dec : listaArgs)
            dicArgs.put(dec.getIden(), dec);
    }

    public String toString() {
        StringBuilder str = new StringBuilder("");
        for (Dec dec : listaArgs) {
            str.append(dec.getTipo().toString());
            str.append(" x ");
        }
        str.delete(str.length() - 3, str.length());
        str.append(" -> emptySet");
        str.append('\n');
        return str.toString();
    }
}