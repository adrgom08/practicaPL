package ast;

import exceptions.TypeException;

public class Type {
    protected KindType tipoType;
    protected int fila;
    protected int columna;

    public NodeKind nodeKind(){return NodeKind.TYPE;}
    public KindType getKindType(){ return tipoType; }
    public int getFila(){return fila;}
    public int getColumna(){return columna;}
    public void type() throws TypeException{}

    public String getId(){ return tipoType.toString();}

    
    // NECESARIO? O con excepciones
    //public Tipo getTipo(){ return null; }
    //public Dec getDec() { return null; }
    // Excepciones



}
