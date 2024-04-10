package ast;

import ast.KindExp;

public class ExpNull extends Exp {

    public ExpNull () {
       this.tipoExp = KindExp.NULL;
    }
 
    public String toString() { return "Null";}
 
 }
 