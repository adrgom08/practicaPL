

public class TypeIden extends Type {
    
    private String iden;

    public TypeIden(String iden, int fila, int columna){
        this.tipoType = KindType.IDEN;
        this.iden = iden;
        this.fila = fila;
        this.columna = columna;
    }

    public getIden(){return iden; }
    public String toString(){ return iden; }
}
