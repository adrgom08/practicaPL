package ast;

import java.util.ArrayList;

public class TypeStruct extends Type {

    private ArrayList<Dec> listDecs;

    public TypeStruct(ArrayList<Dec> listDecs){
        this.tipoType = KindType.STRUCT;
        this.listDecs = listDecs;
    }

    public String toString(){
        StringBuilder str = new StringBuilder("struct {\n");
        for (Dec d : listDecs){
            str.append(d.toString());
            str.append('\n');
        }
        str.append("}\n");
        return str.toString();
    }

}