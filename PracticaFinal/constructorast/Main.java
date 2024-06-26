package constructorast;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import alex.AnalizadorLexicoTiny;

public class Main {
	public static void main(String[] args) throws Exception {
		Reader input = new InputStreamReader(new FileInputStream(args[0]));
		AnalizadorLexicoTiny alex = new AnalizadorLexicoTiny(input);
		ConstructorASTExp constructorast = new ConstructorASTExp(alex);
		try {
			System.out.println(constructorast.parse().value);
		} catch (Exception e) {
			System.out.println("Something went wrong with the parsing...");
		}
	}
}
