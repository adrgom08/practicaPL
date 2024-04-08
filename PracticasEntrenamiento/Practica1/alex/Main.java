package alex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import asint.ClaseLexica;

public class Main {
   public static void main(String[] args) throws FileNotFoundException, IOException {
     Reader input = new InputStreamReader(new FileInputStream(args[0]));
     AnalizadorLexicoTiny al = new AnalizadorLexicoTiny(input);
     UnidadLexica unidad;

     String[] palabras;
     String[] patrones;
     do {
       unidad = al.yylex();
       System.out.println(unidad);
       /*
       if (unidad.clase().equals(ClaseLexica.PALABRA)) {
          palabras.push(unidad.lexema());
       }
       else if (unidad.clase().equals(ClaseLexica.PATRON)) {
          patrones.push(unidad.lexema());
       }
       */
     }

     while (!unidad.clase().equals(ClaseLexica.EOF));

      /*
     System.out.println("PALABRAS: ");
     for (String s: palabras) {
        System.out.println(s);
     }

    System.out.println("PATRONES: ");
     for (String s: patron) {
        int count = 0;
        for (String str: palabras) {
          boolean coincide = s.length() == str.length();
          int i = 0;
          while (coincide && i < s.length()) {
            if (s[i] != "*" && s[i] != str[i]) coincide = false;
          }
          if (coincide) ++count;
        } 
         System.out.println(s + ": " + Integer.toString(count));
     }

    */
    }
} 
