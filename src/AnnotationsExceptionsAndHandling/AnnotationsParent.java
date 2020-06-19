package AnnotationsExceptionsAndHandling;

public class AnnotationsParent {

    public static void theMethodToSayWhatItIs(){
        System.out.println("Iam the parent!");
    }

    //would add this to old code ...shouldn't add to new code
    @Deprecated
    public static void oldMethod(){
        System.out.println("Old way of doing things...");
    }

    public static void newMethod(){
        System.out.println("A new way of doing things...");
    }


}
