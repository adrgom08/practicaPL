package ast;

import ast.KindExp;

public class ExpEntero extends Exp {

    String id;

    public ExpEntero (int fila, int columna, String e) {
       this.fila = fila;
       this.columna = columna;
       this.id = e;
       this.tipoExp = KindExp.ENTERO;
    }
 
    public String toString() { return id; }
 
 }
 