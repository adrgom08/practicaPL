package ast;

import ast.KindExp;

public class ExpIden extends Exp {

    String id;

    public ExpIden (int fila, int columna, String iden) {
       this.fila = fila;
       this.columna = columna;
       this.id = iden;
       this.tipoExp = KindExp.BOOLEANO;
    }
 
    public String toString() { return id; }
 
 }
 