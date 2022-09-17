public class OperatorPostPre{  
public static void main(String args[]){  
                                        int x=10;  
                                        System.out.println(x++);//10 (11)  
                                        System.out.println(++x);//12  
                                        System.out.println(x--);//12 (11)  
                                        System.out.println(--x);//10
                                        System.out.print("\n");
                                        int a,b,c,d;
                                        a = x++;
                                        b = ++x;
                                        c = x--;
                                        d = --x;
                                        System.out.println(+a+ "\n" +b+ "\n" +c+ "\n" +d+ "\n");  
                                        }
}  