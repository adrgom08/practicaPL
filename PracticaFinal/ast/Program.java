package ast;

import java.util.ArrayList;

public class Program implements ASTNode {
    private ArrayList<Dec> decs;
    private ArrayList<Ins> instrs;
    private int fila;
    private int columna;

    public int getFila(){return fila;}
    public int getColumna(){return columna;}

    public Program(ArrayList<Dec> decs){
        this.decs = decs;

        // INSTRUCCIONES
        // ...
    }

    public NodeKind nodeKind(){ return NodeKind.PROGRAM;}
    public String toString(){
        StringBuilder str = new StringBuilder();
        for (Dec d : decs){
            str.append(d.toString());
			str.append('\n');
        }
        // ...
        return str.toString();
    }

}

