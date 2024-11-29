//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n;

        System.out.print("Inserire il numero degli studenti: ");
        n = in.nextInt();

        String[] nomi = new String[n];
        float[] voti = new float[n];
        int[] crediti = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Inserire il nome del " + (i+1) + "° Studente: ");
            nomi[i] = in.next();
            System.out.print("Inserire il voto di " + nomi[i] + ": ");
            voti[i] = in.nextFloat();
            System.out.print("Inserire i crediti formativi di " + nomi[i] + ": " );
            crediti[i] = in.nextInt();
        }

        float media = 0;
        
        for(int i = 0; i < n; i++){
            media += voti[i];
        }

        media /= n;

        System.out.println("La media delle votazioni degli studenti sono: " + media);


        for(int i = 0; i < n; i++){
            if(voti[i] > media && crediti[i] >= 6){
                System.out.println(nomi[i] + " ha la votazione più alta di " + media + " e i crediti formativi maggiori o uguali a 6");
            }
        }
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md