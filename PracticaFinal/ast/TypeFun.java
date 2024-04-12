package ast;

public class TypeFun extends Type {
    private Exp tam;
    private Type tipo;

    public TypeFun(Type tipo, Exp tam) {
        this.tipoType = KindType.FUN;
        this.tipo = tipo;
        this.tam = tam;
    }

    public String toString() {
        return "guevArray " + tipo.toString() + " [" + tam.toString() + ']';
    }
}