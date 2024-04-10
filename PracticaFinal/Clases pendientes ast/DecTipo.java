package ast;

public class DecTipo extends Dec {

    public DecTipo(int fila, int columna, String iden, Tipo tipo){
        this.tipoDec = KindDec.TIPO;
        this.fila = fila;
        this.columna = columna;
        this.iden = iden;
        this.tipo = tipo;
    }

    public String toString(){
        return "tipo " + iden + " << " + tipo.toString() + ';';
    }
}
