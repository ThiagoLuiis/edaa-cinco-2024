

public class buscaUmEDois {

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
        System.out.println("\nO número: " + target + " não foi encontrado");
        else{
            int posicao = result;
            System.out.println("\nO número: " + target + " ,é o indice " + posicao + " da lista.");
            
        }

    }

}