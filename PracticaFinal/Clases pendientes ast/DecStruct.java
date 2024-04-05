package ast;

import java.util.ArrayList;

public class DecStruct extends Dec {

    private ArrayList<Dec> listDecs;

    public DecStruct(Iden i, ArrayList<Dec> l){
        this.listDecs = l;
        this.id = i;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();

		str.append(id);
		str.append(" {\n");
		for (Dec d : listaDs) {
			str.append(d.toString());
			str.append('\n');
		}
		str.append("}\n");
		return str.toString();
    }
    
}

// DECLARACIONES DE MOMENTO HE HECHO HASTA STRUCT, QUEDAN LAS OTRAS 4
