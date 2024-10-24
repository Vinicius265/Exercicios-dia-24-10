public class ex6{

    public static int maiorValor(int[] numeros) {
        int maior = numeros[0]; 
        for (int num : numeros) {
            if (num > maior) {
                maior = num; 
            }
        }
        return maior;
    }

    
    public static int menorValor(int[] numeros) {
        int menor = numeros[0]; 
        for (int num : numeros) {
            if (num < menor) {
                menor = num; 
            }
        }
        return menor;
    }

    
    public static int mediaMaxMin(int[] numeros) {
        int maior = maiorValor(numeros);
        int menor = menorValor(numeros);
        return (maior + menor) / 2; 
    }

    public static void main(String[] args) {
        int[] vetor = { 3, 7, 2, 9, 1 };

        System.out.println("Maior valor: " + maiorValor(vetor));
        System.out.println("Menor valor: " + menorValor(vetor));
        System.out.println("Média entre maior e menor: " + mediaMaxMin(vetor));
    }
}
