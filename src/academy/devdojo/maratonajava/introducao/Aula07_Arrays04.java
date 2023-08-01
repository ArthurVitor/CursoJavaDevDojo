package academy.devdojo.maratonajava.introducao;

import java.util.Arrays;

public class Aula07_Arrays04 {
    public static void main(String[] args) {
        String [] nomes = new String[100];
        nomes[0] = "Dummy001";
        nomes[1] = "Dummy002";
        nomes[2] = "Dummy003";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
