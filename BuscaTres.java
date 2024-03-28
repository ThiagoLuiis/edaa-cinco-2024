import java.util.Date;

public class BuscaTres {
    

    public static int buscaBinaria(int[] numeros, int target) {
        int pos = -1, posInicial = 0, posFinal = numeros.length - 1;
        while(posInicial <= posFinal) {
        pos = (posFinal  + posInicial) / 2;
        if(numeros[pos] == target) return pos;
        else if(numeros[pos] > target) posFinal = pos - 1;
        else posInicial = pos + 1;
        };
        return -1;
    }

    public static void buscarEImprimirResultado(int[] numeros, int target) {
        int posicao = buscaBinaria(numeros, target);
        imprimirResultado(posicao, target);
    }

    public static void imprimirResultado (int result,int target){
        if (result == -1)
        System.out.println("\nCarro de placa: " + target + " não encontrado");
        else{
            int posicaoCarro = result + 1;
            Date now = new Date(System.currentTimeMillis());
            System.out.println("\n\tRegistro: " + now);
            System.out.println("\nCarro/Placa: " + target + " , Foi o " + posicaoCarro + "° carro que trafegou na via.");
            
        }

    }

}
