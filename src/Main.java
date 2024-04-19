//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> carrello = inserisciArticoli();
        System.out.println("Il carrello contiene: " + carrello);

        String verificaArticolo = "Cuffie";

        boolean articoloNelCarrello = controlloCarrello(carrello, verificaArticolo);
        System.out.println("L'articolo [" + verificaArticolo + "] è nel carrello? " + articoloNelCarrello);

    }

    public static HashSet<String> inserisciArticoli () {

        HashSet<String> carrello = new HashSet<>();

        carrello.add("Cuffie");
        carrello.add("Smartphone");
        carrello.add("Carica batterie");
        return carrello;
    }

    private static boolean controlloCarrello (HashSet<String> carrello, String articolo) {
        return carrello.contains(articolo);
    }
}