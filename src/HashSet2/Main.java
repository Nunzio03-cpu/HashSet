package HashSet2;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = creaHashSet();
        String oggettoDaVerificare = "Elemento2";

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.equals(oggettoDaVerificare)) {
                iterator.remove();
                System.out.println("Rimosso: " + elemento);
            }
        }

        // Svuotare l'HashSet
        hashSet.clear();
        System.out.println("HashSet svuotato.");

        // Verificare se l'HashSet è vuoto
        if (hashSet.isEmpty()) {
            System.out.println("L'HashSet è vuoto.");
        } else {
            System.out.println("L'HashSet contiene ancora elementi.");
        }
    }
    public static HashSet<String> creaHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Elemento1");
        hashSet.add("Elemento2");
        hashSet.add("Elemento3");
        hashSet.add("Elemento4");
        return hashSet;
    }
}
