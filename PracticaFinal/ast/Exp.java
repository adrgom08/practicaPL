package ast;

public abstract class Exp implements ASTNode {
    protected Type tipo;
    protected KindExp tipoExp;
    protected int fila;
	protected int columna;

    public NodeKind nodeKind() {return NodeKind.EXPRESSION;}
    
    public Type getTipo() {
    	return tipo;
    }

    public int getFila(){ return fila; }

    public Exp opnd1() {throw new UnsupportedOperationException("opnd1");} 
    public Exp opnd2() {throw new UnsupportedOperationException("opnd2");} 
    public String num() {throw new UnsupportedOperationException("num");}
    
    public String toString() {return "";}

}

