package ast;

import java.util.ArrayList;

public class Bloque extends Ins {
	private ArrayList<Dec> decs;
	private ArrayList<Ins> ins;
	
	public Bloque(ArrayList<Dec> decs, ArrayList<Ins> ins) {
		this.decs = decs;
		this.ins = ins;
        this.tipoIns = KindIns.BLOCK;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder("");
        str.append('{\n')
		for (Dec d : decs) {
			str.append(d.toString());
			str.append('\n');
		}
		for (Ins i : ins) {
			str.append(i.toString());
			str.append('\n');
		}
        str.append('}');
		return str.toString();
	}
}