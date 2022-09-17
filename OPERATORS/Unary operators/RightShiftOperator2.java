public class RightShiftOperator2{  
public static void main(String args[]){  
    //For positive number, >> and >>> works same  
    System.out.println(20>>2);  
    System.out.println(20>>>2);  
    //For negative number, >>> changes parity bit (MSB) to 0  
    /* In computing, the most significant bit (MSB) is the bit which has the largest value in a multi-bit binary number. 
     The most significant bit is the one which is farthest to the left. */
    System.out.println(-20>>2);  
    System.out.println(-20>>>2);  
}}  