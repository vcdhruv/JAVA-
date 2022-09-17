public class HelloJava{
	public static void main(String[] args){
	System.out.println("HELLO JAVA");
}
}
//class keyword is used to declare a class in Java.


//public keyword is an access modifier that represents visibility. It means it is visible to all.


/*static is a keyword. If we declare any method as static, it is known as the static method.
 The core advantage of the static method is that there is no need to /*create an object to invoke the static method.*/


 /*The main() method is executed by the JVM, so it doesn't require creating an object to invoke the main() method.
  So, it saves memory.*/


//void is the return type of the method. It means it doesn't return any value.


//main represents the starting point of the program.


//String[] args or String args[] is used for command line argument. We will discuss it in coming section.


/*System.out.println() is used to print statement. Here, System is a class, out is an object of the PrintStream class,
 println() is a method of the PrintStream class.*/

/*
 There are many ways we can write java programs :
 1) By changing the sequence of the modifiers, method prototype is not changed in Java.
 EG: static public void main(String args[])

 2) The subscript notation in the Java array can be used after type, before the variable or after the variable.
 EG: public static void main(String[] args)
     public static void main(String args[])
     public static void main(String []args)

3) You can provide var-args support to the main() method by passing 3 ellipses (dots)
EG: public static void main(String... args)

4) Having a semicolon at the end of class is optional in Java.
EG: class A{  
            static public void main(String... args){  
                                                        System.out.println("hello java4");  
                                                    }  
            };  

VALID JAVA MAIN METHOD SIGNATURE :

public static void main(String[] args)  
public static void main(String []args)  
public static void main(String args[])  
public static void main(String... args)  
static public void main(String[] args)  
public static final void main(String[] args)  
final public static void main(String[] args)  
final strictfp public static void main(String[] args)  

INVALID JAVA MAIN METHOD SIGNATURE :

public void main(String[] args)  
static void main(String[] args)  
public void static main(String[] args)  
abstract public static void main(String[] args) 

Q) Can you save a Java source file by another name than the class name?
Yes, if the class is not public

EG : class Simple{
        public static void main(String args[]){
            System.out.println("Hello");
        }
    }
    To compile : java Simple.java
    To run : java Simple , beacaause after compilation Simple.class will be formed.....

Q) Can you have multiple classes in a java source file?
Yes

EG : class A[]                                      A.class
     class B[]          after compilation           B.class
     class C[]                                      C.class
*/