package academy.devdojo.maratonajava.exercicios;

public class Aula05_EstruturasCondicionasExercicio02 {
    public static void main(String[] args) {
        // Utilizando Switch dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        /*
         * 1 Domingo
         * 2 Segunda
         * 3 Terça
         * 4 Quarta
         * 5 Quinta
         * 6 Sexta
         * 7 Sábado
         * */
        byte dia = 8;
        String tipoDia;
        switch (dia) {
            case 1:
                tipoDia = "Final de semana";
                break;
            case 2:
                tipoDia = "Dia útil";
                break;
            case 3:
                tipoDia = "Dia útil";
                break;
            case 4:
                tipoDia = "Dia útil";
                break;
            case 5:
                tipoDia = "Dia útil";
                break;
            case 6:
                tipoDia = "Dia útil";
                break;
            case 7:
                tipoDia = "Final de semana";
                break;
            default:
                tipoDia = "Digite um valor inteiro de 1 a 7";
        }
        System.out.println(tipoDia);
    }
}
