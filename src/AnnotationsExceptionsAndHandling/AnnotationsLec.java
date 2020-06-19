package AnnotationsExceptionsAndHandling;

public class AnnotationsLec {

//    ================================= ANNOTATIONS
//    Meta instructions for the Java compiler or Java applications
//    Can control behaviours at compile-time and at runtime
//    Can create custom annotations (out of scope for today)
//    Common built-in compile time annotations:
//    @Deprecated
//    @Override
//    @SuppressWarnings -- can be a little confusing.   Better to be more specific with this annotation.  AVOID setting @SuppressWarnings("all")
//    We can suppress "unchecked", "deprecated"...
//    A number of key/value pairs can be set for a given annotation (called elements)
//    An annotation is normally placed on it's own line above various declarations (classes, methods, properties, and method parameters)
//    Frequently used to configure Java frameworks like JUnit and Spring

/*    Java annotations can have elements ex: @entity(table = "vehicles")`  | and can have multiple elements
*     we can just pass in the value of an element once it's established      */

    public static void main(String[] args) {

        AnnotationsParent.oldMethod();

//        AnnotationsChild c = new AnnotationsChild();
//        c.theMethodToSayWhaItIs();
//



    }

}
