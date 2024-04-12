package ast;

public class TypePointer extends Type {
	private Type tipo;

	public TypePointer(Type tipo) {
		this.tipoType = KindType.POINTER;
		this.tipo = tipo;
	}

	public String toString() {
		return "pointer " + tipo.toString();
	}
}