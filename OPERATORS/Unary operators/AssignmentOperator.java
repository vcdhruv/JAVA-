public class AssignmentOperator{  
                                public static void main(String args[]){  
                                int a=10;  
                                int b=20;  
                                a+=4;//a=a+4 (a=10+4)  
                                b-=4;//b=b-4 (b=20-4)  
                                System.out.println(a); 
                                System.out.println(b);
                                a+=3;//14+3  = 17
                                System.out.println(a);  
                                a-=4;//17-4  = 13
                                System.out.println(a);  
                                a*=2;//13*2  = 26
                                System.out.println(a);  
                                a/=2;//26/2  = 13
                                System.out.println(a);
                                short c=10;  
                                short d=10;  
                                //a+=b;//a=a+b internally so fine  
                                short e=(short)(c+d);//Compile time error because 10+10=20 now int  
                                System.out.println(e);  
                            }
}