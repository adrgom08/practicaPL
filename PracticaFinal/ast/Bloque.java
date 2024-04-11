package ast;

import java.util.ArrayList;

public class Bloque extends Ins {
	private Pair<ArrayList<Dec>,ArrayList<Ins>> b;
	
	public Bloque(Pair<ArrayList<Dec>,ArrayList<Ins>> b) {
		this.b = b;
        this.tipoIns = KindIns.BLOCK;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder("");
        str.append('{\n')
		for (Dec dec : b.getFirst()) {
			str.append(dec.toString());
			str.append('\n');
		}
		for (Ins ins : b.getSecond()) {
			str.append(ins.toString());
			str.append('\n');
		}
        str.append('}');
		return str.toString();
	}
}