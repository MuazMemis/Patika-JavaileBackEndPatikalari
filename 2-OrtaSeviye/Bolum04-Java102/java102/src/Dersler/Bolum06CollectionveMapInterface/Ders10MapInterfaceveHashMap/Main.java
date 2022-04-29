package Dersler.Bolum06CollectionveMapInterface.Ders10MapInterfaceveHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> country = new HashMap<>();
        country.put("TR", "Türkiye");
        country.put("TR", "Türkiye2");
        country.put("USA", "Amerika");
        country.put("GR", "Almanya");
        country.put("EN", "İngiltere");

//        System.out.println(country.get("TR")); // Son değeri alır
//        country.remove("EN");
//        System.out.println(country.get("EN"));
//        country.clear();
//        System.out.println(country);
//        System.out.println(country.size());
        country.replace("GR", "Alamanya");

        for (String key : country.keySet()) {
            System.out.println(key + "\t -> " + country.get(key));
        }

        for (String value : country.values()) {
            System.out.println(value);
        }

    }
}







