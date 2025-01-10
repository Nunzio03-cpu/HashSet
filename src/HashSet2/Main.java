package HashSet2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "Uno");
        hashMap1.put(2, "Due");
        hashMap1.put(3, "Tre");

        HashMap<Integer, String> hashMap2 = new HashMap<>() {{
            put(4, "Quattro");
            put(5, "Cinque");
            put(6, "Sei");
        }};

        Map<Integer, String> hashMap3 = Map.of(
                7, "Sette",
                8, "Otto",
                9, "Nove"
        );

        System.out.println("Contenuto di hashMap1:");
        stampaMappa(hashMap1);

        System.out.println("Contenuto di hashMap2:");
        stampaMappa(hashMap2);

        System.out.println("Contenuto di hashMap3:");
        stampaMappa(hashMap3);
    }

    public static <K, V> void stampaMappa(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
