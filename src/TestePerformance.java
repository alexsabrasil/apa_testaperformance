import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerformance {
    public static void main(String[] args) {
        int[] tamanhos = {50000, 100000, 150000, 200000};
        
        for (int tamanho : tamanhos) {
            System.out.println("Testando para " + tamanho + " elementos:");
            testarArrayList(tamanho);
            testarHashSet(tamanho);
            System.out.println();
        }
    }
    
    public static void testarArrayList(int tamanho) {
        System.out.println("ArrayList:");
        long inicio = System.currentTimeMillis();
        Collection<Integer> teste = new ArrayList<>();
        
        for (int i = 0; i < tamanho; i++) {
            teste.add(i);
        }
        
        for (int i = 0; i < tamanho; i++) {
            teste.contains(i);
        }
        
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo + " ms");
    }
    
    public static void testarHashSet(int tamanho) {
        System.out.println("HashSet:");
        long inicio = System.currentTimeMillis();
        Collection<Integer> teste = new HashSet<>();
        
        for (int i = 0; i < tamanho; i++) {
            teste.add(i);
        }
        
        for (int i = 0; i < tamanho; i++) {
            teste.contains(i);
        }
        
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo + " ms");
    }
}
