package collections;

import java.util.HashMap;

public class HashMapLecture {
    public static void main(String[] args) {


        HashMap<String, Integer> userIds = new HashMap<>();
        HashMap<String, String> passwords = new HashMap<>();
        HashMap<Integer, String> horses = new HashMap<>();

        userIds.put("skunk1",1);
        userIds.put("jfunk",2);
        userIds.put("skrillfan",3);
        userIds.putIfAbsent("jfunk",4); //this doesn't run if the key - value exists
//        userIds.put("jfunk", 4); //what NOW...
        System.out.println(userIds.get("jfunk")); //id number or integer that we set - 2 || NOW we get the last instance of the value.  Intellij tells us we shouldnt have duplicate keys
        userIds.replace("skunk1",7); // replacing the values, now the userId is 7
//        userIds.remove("jfunk", 2); //removes jfunk from HashMap
        System.out.println(userIds); // list of usernames
        System.out.println(userIds.get("dstephens")); //get back null
        System.out.println(userIds.containsKey("dstephens")); //returns boolean false
        System.out.println(userIds.containsValue("2")); //returns boolean true
        System.out.println(userIds.getOrDefault("dstephens", 4)); //this is a failsafe so that we don't return a null value
        System.out.println(userIds); //list of names
        userIds.clear();
        System.out.println(userIds); //clears HashMap





    }
}
