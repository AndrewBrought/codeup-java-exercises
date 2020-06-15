package inheritanceLecture;

public class InheritancePolymorphismLec {

//    A subclass/child can have additional things that the parent class doesn't have.
//    A class can only extend from one other direct parent
//    The subclass/child class can access all public and protected fields (methods and properties) from its super/parent class

//    Object (every class extends from an object at the highest level)
//      can be extended LivingBeing

//    Classes can keep extending down into more and more specific classes
/*       EX  of hierarchy:
*         Living Being
*         can be extended by Person
*         Person
*         can be extended by Employee
*         Employee
*         can be extended by Engineer
*         Engineer
*         can be extended by JuniorEngineer
*         etc.*/

//      Constructors are not inherited in Java but parent constructors can be referenced in child constructors.

//    The ability to work with shared behavior between different types of classes

// Must have an empty constructor in the parent/super class for the other classes to be able to operate with different definitions of constructors

    //Compiler will automatically generate an empty constructor at runtime if one is not defined

//     If a non-empty parameter constructor is added to a lclass(parent) and another class extends from it (child), one of the folllowing MUST be done:
   // a default empty or

//    ======== ADDING SUBCLASS MEMBERS

//    A child class may have additional fields, in addition to inheriting all public and protected fields from its parent.
//    If no constructors are written explictly, the compiler automatically creates
//    an empty default constructor.
//    If a non-empty parameter constructor is added to a class (parent) and another class extends from it (child), one of following MUST be done:
//            - a default (empty) constructor is added to the parent class
//    OR
//  - a child constructor is added that calls a defined parent constructor using the super keyword
//    If no constructor is added to a parent class, the default constructor is automatically added to the parent class at compile time and will not interfere with what constructors can be defined on one of its child classes.
//    https://stackoverflow.com/questions/7187799/why-default-constructor-is-required-in-a-parent-class-if-it-has-an-argument-ed-c

//    public - accessed in any other class
//    protected - accessible to any subclass (child) classes
//    package-private only accessible to classes in the package -- protected properties are accessible to any class that extends the parent class...not private.
//    private - only accessible in the class they are declared
//    default setting for properties without visibility definition is private.

//    Here’s another analogy I found for Java’s visibility modifiers:
//            “Most of you know that I live down at the beach. If you find yourself riding past my house, and it’s hot outside, you might come to my front door, knock and ask if you could have a soda. I don’t live in a gated community, so anyone can come to my front door and knock. My front door is public. However, you can’t open the front door, walk right in to my kitchen, open the refrigerator door, and help yourself to a soda! My refrigerator door is not public.
//    My children and grandchildren, however, who live next door, think nothing of walking into the house and getting anything they like out of the refrigerator. In our house, the refrigerator is protected; my family can directly access it, but the general public cannot.
//    Not everything in our family is protected, though. My kids know that going upstairs, finding my Visa card, and charging a new book at Amazon, isn’t permitted. My Visa card, and the contents of my wallet, are private. No one else can access them directly; they have to make a request.”




//    ========== Polymorphism ========
//     Allows for targeting shared behaviors between diff. classes by targeting classes be a common ancestor
//    ** One thing, many forms
    //Overloading
    //Overriding

//    ----------------- SUPER AND FINAL KEYWORDS
//    Super keyword uses...
//            - when used in a subclass method other than a constructor, it allows the subclass method to invoke the parent class method implementation
//  - when used in a subclass constructor, will invoke a parent constructor but has to be the first statement within the subclass constructor
//    Final keyword uses...
//            - when used on a class, it prevents any classes from extending from it
//  - when used on a method, the method cannot be overwritten
//  - when used on a property, it creates a constant
//-- !! MINI-EXERCISE 5 !!
//    Add a method of genericTurnOn to both the Jet class and the Car class (not the Vehicle class). When invoked, it should print out "Vehicle is turning on...". How can the parent version of the turnOn method be used to do this?
//    Experiment with the three uses of the final keyword using the Vehicle and Car classes. These three uses again are...
//            1. Create a constant
//  2. Prevent method overriding
//  3. Prevent inheritance
//

}
