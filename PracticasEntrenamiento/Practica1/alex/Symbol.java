package alex;

public class Symbol {
    public String sym;
    public Object value;
    public Symbol(String sym) {
	this.sym = sym;
    }
    public Symbol(String sym, Object value) {
	this.sym = sym;
	this.value = value;
    }
}
