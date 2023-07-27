package academy.devdojo.maratonajava.exercicios;

public class Aula05_EstruturasCondicionasExercicio {
    public static void main(String[] args) {
        double salario = 70000;
        double tax;
        if (salario <= 34712) {
            tax = 9.7;
        } else if (salario >= 34713 && salario <= 68507) {
            tax = 37.35;
        } else {
            tax = 49.50;
        }
        double salarioTax = salario - tax / 100 * salario;
        System.out.println("Você tera de pagar uma taxa de " + tax + " sobre o seu salário, " + salarioTax + " é o seu salário após o pagamento");

    }
}
