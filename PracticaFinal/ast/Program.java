package ast;

public class Program implements ASTNode {
    private ArrayList<Dec> decs;
    private ArrayList<Ins> instrs;
    private int fila;
    private int columna;

    public Programa(ArrayList<Dec> decs){
        this.decs = decs;

        // INSTRUCCIONES
        // ...
    }

    public NodeKind nodeKind(){ return NodeKind.PROGRAM;}
    public String toString(){
        StringBuilder str = new StringBuilder();
        for (Dec d : decs){
            str.append(dec.toString());
			str.append('\n');
        }
        // ...
    }

    public void type() throws TypeException {
    	for (Dec dec : ds) dec.type();
    }
}
