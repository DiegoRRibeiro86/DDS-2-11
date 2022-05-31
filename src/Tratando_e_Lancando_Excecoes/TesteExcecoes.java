package Tratando_e_Lancando_Excecoes;

import java.util.Locale;

public class TesteExcecoes {

    public static void main(String[] args) {
       // int numero = 5 / 0;     // Lança java.lang.ArithmeticException
       /* String s= null;
        String maiuscula = s.toUpperCase(Locale.ROOT); Lança java.lang.NullPointerException */

        ContaCorrente cc = new ContaCorrente(100);      // injetou uma cc

        try {
            cc.depositar(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Você executou uma operação ilegal: " + e.getMessage());
        }
    }
}
