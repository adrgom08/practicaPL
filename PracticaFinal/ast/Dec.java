package ast;

public abstract class Dec implements ASTNode {
    protected Tipo tipo;
    protected String id;
    protected int fila;
    protected int columna;
    protected KindDec tipoDec;

    public Dec(int fila, int columna, Tipo tipo, String id) {
        this.fila = fila;
        this.columna = columna;
        this.tipo = tipo;
        this.id = id;
    }

    public Tipo getTipo() { 
        if(tipo.kindType() == KindType.REF)return tipo.getTipo();
    	return tipo;
    }
    public KindDec getKindDec(){return tipoDec;}
    public String getId() {return id;}
    public int getFila(){ return fila; }
    public int getColumna(){ return columna; }

    public NodeKind nodeKind() {
        return NodeKind.DECLARATION;
    }

    public abstract void bind() throws TypeException;

    public String toString() {
        return tipo.toString() + " " + id;
    }
}