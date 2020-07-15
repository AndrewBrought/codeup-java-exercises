import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
//English to Spanish Dictionary
        Map<String, String> englSpanDictionary = new HashMap<>();
//        inserting things into dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miércoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "domingo");
//    Retrieve things from our dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
//        Print out all keys
        System.out.println(englSpanDictionary.keySet());
//        Print out all values
        System.out.println(englSpanDictionary.values());
        System.out.println(englSpanDictionary.size());

        System.out.println();
        System.out.println();

//        Shopping List
        Map<String, Boolean> shoppingList = new HashMap<>();
//        Put some stuff in shopingList
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", true);
        shoppingList.put("Oreos", true);
        shoppingList.put("Eggs", false);
        shoppingList.put("Sugar", false);
//        Retrieve Items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));
//        Key-Value Pairs Print Out
        System.out.println(shoppingList.toString());
//        is Empty?
        System.out.println(shoppingList.isEmpty());
//        Clear shoppingList
        shoppingList.clear();
        System.out.println(shoppingList.toString());
//        is Empty?
        System.out.println(shoppingList.isEmpty());

    }
}
