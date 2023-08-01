package academy.devdojo.maratonajava.exercicios;

public class Aula06_EstruturasRepeticaoExercicio02 {
    // Imprima os primeiros 25 números de um dado valor. Por exemplo, 50
    public static void main(String[] args) {
        int valorMax = 50;
        for (int c = 0; c <= valorMax; c++) {
            if (c > 25){
                break;
            }
            System.out.println(c);
        }
    }
}
