package academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizado = idade >= 18;
        if (isAutorizado) {
            System.out.println("Pode comprar pinga");
        } else {
            System.out.println("Não pode comprar pinga");
        }

        if (!isAutorizado) {
            System.out.println("Não pode comprar");
        }
    }
}
