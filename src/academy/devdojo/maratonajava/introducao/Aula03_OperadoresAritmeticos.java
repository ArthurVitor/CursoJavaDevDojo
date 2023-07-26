package academy.devdojo.maratonajava.introducao;

import java.io.PrintStream;
import java.lang.reflect.Array;

public class Aula03_OperadoresAritmeticos {
    public static void main(String[] args) {
        // * / - +
        int numero01 = 10;
        double numero02 = 20;
        double res = numero01 * numero02;
        System.out.println(res);

        // %
        int resto = 10 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezIgualDez: " + isDezIgualDez);
        System.out.println("isDezDiferenteDez: " + isDezDiferenteDez);

        // && (and)
        // || (or)
        // ! (not)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroLeiMaiorQueTrinta: " + isDentroLeiMaiorQueTrinta);
        System.out.println("isDentroLeiMenorQueTrinta: " + isDentroLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalPoupanca = 10000;
        float valorPlaystation = 5000;

        boolean isPS5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalPoupanca > valorPlaystation;
        System.out.println("isPS5Compravel: " + isPS5Compravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus -= 1000;
        System.out.println("Bônus: " + bonus);

        // ++ --
        int contador = 0;
        System.out.println(contador);
    }
}
