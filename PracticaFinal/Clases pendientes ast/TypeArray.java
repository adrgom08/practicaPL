package ast;

public class TypeArray extends Type {

    private String n;

    public TypeArray(Type tipo, String n){
        this.tipoType = KindType.ARRAY;
        this.tipo = tipo;
        this.n = n;
    }

    public String toString(){ return tipo.toString() + '[' + n + ']'; }

}