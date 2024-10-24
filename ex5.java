public class ex5 {

    public static String exibirDiaSemana(int numero) {
        switch (numero) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sábado";
            default:
                return "Dia da semana inválido";
        }
    }

    public static void main(String[] args) {
        System.out.println(exibirDiaSemana(3));  
        System.out.println(exibirDiaSemana(8));  
    }
}
