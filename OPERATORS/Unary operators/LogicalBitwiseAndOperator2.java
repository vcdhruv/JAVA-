public class LogicalBitwiseAndOperator2{  
                                public static void main(String args[]){  
                                int a=10;  
                                int b=5;  
                                int c=20;  
                                System.out.println(a<b&&a++<c);//false && true = false  
                                System.out.println(a);//10 because second condition is not checked 
                                //IMP POINT IS THERE...  BITWISE AND SECOND CONDITION IS CHECKED SO ANSWER IS 11 IN LOGICAL SECOND WAS NOT CHECKED. 
                                System.out.println(a<b&a++<c);//false && true = false  
                                System.out.println(a);//11 because second condition is checked  
                            }
} 