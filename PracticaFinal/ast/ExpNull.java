package ast;

import ast.KindExp;

public class ExpNull extends Exp {

    public ExpNull (int fila, int columna) {
       this.fila = fila;
       this.columna = columna;
       this.tipoExp = KindExp.BOOLEANO;
    }
 
    public String toString() { return "Null";}
 
 }
 