//n over match runs
import java.util.Scanner;
public class CricketSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter match overs:");
        int n = sc.nextInt();
        int[][] runPerOver = new int[n][6];
        switch(n){
            case 50 : System.out.println("Match is of 50 overs");
            break;
            case 20 : System.out.println("Match is of 20 overs");
            break;
            case 90 : System.out.println("It is a TEST Match of one day");
            break;
            default : System.out.println("INVALID INPUT");
            break;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<6;j++){
                System.out.print("enter run taken" + "in over number " +(i+1)+ " & ball number is " +(j+1)+ ":");
                runPerOver[i][j] = sc.nextInt();
                if(runPerOver[i][j] == -1){
                    continue;
                }
            }
        }
        int totalRun = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<6;j++){
                totalRun+=runPerOver[i][j];
            }
        }
        double average = totalRun/(double)runPerOver.length;
        System.out.print("total run by whole team is:" +totalRun);
        System.out.print("average per over is :" +average);
    }
}