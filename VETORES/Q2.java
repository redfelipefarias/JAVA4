import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("DIGITE O TAMANHO DO VETOR: ");
        int tamanho = l.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("DIGITE OS ELEMENTOS DO VETOR: ");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = l.nextInt();
        }
        System.out.println("DIGITE O NÚMERO QUE BUSCA: ");
        int numero = l.nextInt();

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numero){
                System.out.println("O NÚMERO " + numero + " FOI ENCONTRADO NA POSIÇÃO " + i );
                return;
            }
        }
        System.out.println("O NÚMERO " + numero + " NÃO FOI ENCONTRADO.");
    }
}
