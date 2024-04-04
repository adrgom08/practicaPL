package ast;

public abstract class Exp implements ASTNode {
    protected Tipo tipo;
    protected KindE tipoExp;
    protected int fila;
	protected int columna;

    public abstract KindE kind() {return tipoExp;};
    public NodeKind nodeKind() {return NodeKind.EXPRESSION;}
    public Tipo getTipo() {
    	if(tipo.kindType() == KindType.REF)return tipo.getTipo();
    	return tipo;
    }
    public Dec getDec(String iden) throws TypeException {
    	return tipo.getDec(iden);
    }
    public int getFila(){ return fila; }

    public Exp opnd1() {throw new UnsupportedOperationException("opnd1");} 
    public Exp opnd2() {throw new UnsupportedOperationException("opnd2");} 
    public String num() {throw new UnsupportedOperationException("num");}
    
    public String toString() {return "";}

}
