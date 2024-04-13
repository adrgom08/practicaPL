package ast;

import java.util.ArrayList;

public class DecFun extends Dec {
	private Type returnType;
	private ArrayList<Dec> args;
	private Ins bloque;
	private Exp e;
	private String id;

	public DecFun(int fila, int columna, String id, Type tipo, Type returnType, ArrayList<Dec> args, Ins bloque,
			Exp e) {
		super(fila, columna, tipo, id);
		this.tipoDec = KindDec.FUNCION;
		this.returnType = returnType;
		this.args = args;
		this.bloque = bloque;
		this.e = e;
	}

	public String toString() {
		StringBuilder str = new StringBuilder("fun ");
		str.append(returnType.toString());
		str.append(' ');
		str.append(id);
		str.append('(');
		for (Dec dec : args) {
			str.append(dec.toString());
			str.append(", ");
		}
		str.delete(str.length() - 2, str.length());
		str.append(") ");
		str.append("{\n");
		str.append(bloque.toString());
		str.append("return ");
		str.append(e.toString());
		str.append(";\n");
		str.append("\n}");
		return str.toString();
	}
}