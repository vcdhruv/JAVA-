public class OperatorPrePostTwo{  
public static void main(String args[]){  
                                        int a=10;  
                                        int b=10;  
                                        /*firsst value of a will be assigned as it is postincrement so a=10
                                          then it will be incremented so a=11 no original value of a will be
                                          11,but a++ will be 10 since a is assigned 10. now in ++a a=11 will
                                          be incremented first as it is preincrement so a will be equal to 12
                                          then it will be assigned so a = 12. so 10 + 12 */
                                        System.out.println(a++ + ++a);//10+12=22  
                                        System.out.println(b++ + b++);//10+11=21  
  
                                    }   
}  