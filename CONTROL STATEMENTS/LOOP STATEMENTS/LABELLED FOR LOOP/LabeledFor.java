//The break and continue keywords breaks or continues the innermost for loop respectively.
/*
Syntax :
labelname:    
for(initialization; condition; increment/decrement){    
//code to be executed    
} 
*/
public class LabeledFor{  
public static void main(String[] args) {  
    //Using Label for outer and for loop  
    aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        break aa;  
                    }  
                    System.out.println(i+" "+j);  
                }  
        }  
}  
}
//If  break bb;, it will break inner loop only which is the default behaviour of any loop.
/*
public class LabeledForExample2 {  
public static void main(String[] args) {  
    aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        break bb;  
                    }  
                    System.out.println(i+" "+j);  
                }  
        }  
}  
} */