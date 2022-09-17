//java wrapper class provides the mechanism to convert primitive into object and object into primitive.
//java allows four wrapper classes :Byte , Short , Integer , Long......
public class WrapperInSwitch{       
       public static void main(String args[])  
       {         
            Integer age = 18;        
            switch (age)  
            {  
                case 16:            
                    System.out.println("You are under 18.");  
                    break;  
                case (18):                
                    System.out.println("You are eligible for vote.");  
                    break;  
                case (65):                
                    System.out.println("You are senior citizen.");  
                    break;  
                default:  
                    System.out.println("Please give the valid age.");  
                    break;  
            }             
        }  
}  