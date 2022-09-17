/*
The while loop is also used to iterate over the number of statements multiple times.
However, if we don't know the number of iterations in advance, it is recommended to use a while loop. 
Unlike for loop,
the initialization and increment/decrement doesn't take place inside the loop statement in while loop.
*/
public class WhileLoop{    
                            public static void main(String[] args) {    
                            // TODO Auto-generated method stub    
                            int i = 0;    
                            System.out.println("Printing the list of first 10 even numbers \n");    
                            while(i<=10) {    
                            System.out.println(i);    
                            i = i + 2;    
                            }    
                        }    
}   