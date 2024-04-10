

public class TypeRef extends Type {
    
    public TypeRef(Tipo tipo){
        this.tipoType = KindType.REF;
        this.tipo = tipo;
    }

    public String toString(){
        return tipo.toString();
    }
}
