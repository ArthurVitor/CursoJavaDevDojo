package academy.devdojo.maratonajava.exercicios;

public class Aula06_EstruturasRepeticaoExercicio {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        for (int c = 0; c <= 1000000; c++) {
            System.out.println(c % 2 == 0 ? "Número: " + c : "Não é par");
        }
    }

}
