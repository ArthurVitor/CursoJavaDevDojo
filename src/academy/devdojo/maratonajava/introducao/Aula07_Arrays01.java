package academy.devdojo.maratonajava.introducao;

public class Aula07_Arrays01 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades[0] = 15;
        idades[1] = 15;
        idades[2] = idades[0] + idades[1];
        System.out.println(idades[2]);
    }
}
