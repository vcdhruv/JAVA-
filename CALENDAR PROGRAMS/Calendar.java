import java.time.Year;
import java.util.Scanner;
public class Calendar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YEAR:");
        int year = sc.nextInt();
        System.out.print("ENTER MONTH:");
        String month = sc.next();
        System.out.print("ENTER DATE:");
        int date = sc.nextInt();
        int leapyear=0,normalyear=0,oddDays=0,oddaysinyear,x,z,y;

         System.out.print("ENTER ANY NUMBER TO PRINT DAY:");
        int days = sc.nextInt();

        System.out.print("ENTER ANY CENTURY:");
        int century = sc.nextInt();


        Input_Date_Month_Year idmy = new Input_Date_Month_Year();
        idmy.inputdata(year, date, month);

        System.out.print("\n"+date+" "+month+","+year+"\n");
        
        NoOfOddDays o = new NoOfOddDays();
        o.OddDaysInWeek(days);
        System.out.println();
        o.OddDaysInCentury(century,leapyear,normalyear);
        o.OddDaysInYear(year, oddaysinyear, x, z, y);
    }
}

class Input_Date_Month_Year{
    public void inputdata(
        int year,int date,String month){
        if(year%100!=0&&year%4==0||year%400==0)
        {
            System.out.print(year+" is leap year");
            switch (month) {
                case "january":   
                if(date>=1 && date<=31)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }  
                break;

                case "february":
                if(date>=1 && date<=28)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "march":
                if(date>=1 && date<=31)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "april":
                if(date>=1 && date<=30)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "may":
                if(date>=1 && date<=31)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "june":
                if(date>=1 && date<=30)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "july":
                if(date>=1 && date<=31)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "august":
                if(date>=1 && date<=30)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "september":
                if(date>=1 && date<=31)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "october":
                if(date>=1 && date<=30)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "november":
                if(date>=1 && date<=31)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "december":
                if(date>=1 && date<=30)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                default:System.out.print("ENTER VALID MONTH");
                break;
            }
        }
        else
        {
            System.out.print(year+" is not leap year");
            System.out.println();
            switch (month) {
                case "january":   
                if(date>=1 && date<=31)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }  
                break;

                case "february":
                if(date>=1 && date<=28)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "march":
                if(date>=1 && date<=31)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "april":
                if(date>=1 && date<=30)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "may":
                if(date>=1 && date<=31)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "june":
                if(date>=1 && date<=30)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "july":
                if(date>=1 && date<=31)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "august":
                if(date>=1 && date<=30)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "september":
                if(date>=1 && date<=31)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "october":
                if(date>=1 && date<=30)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "november":
                if(date>=1 && date<=31)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;

                case "december":
                if(date>=1 && date<=30)
                {
                    //System.out.print("date:"+date);
                }
                else{
                    System.out.print("Enter valid date");
                }
                break;
                
                default:System.out.print("ENTER VALID MONTH");
                break;
            }
        }
    }
}

class NoOfOddDays{
    public void OddDaysInWeek(int days)
    {
        switch (days) {
            case 0:System.out.print("MONDAY");
            break;
            case 1:System.out.print("TUESDAY");
            break;
            case 2:System.out.print("WEDNESDAY");
            break;
            case 3:System.out.print("THURSDAY");
            break;
            case 4:System.out.print("FRIDAY");
            break;
            case 5:System.out.print("SATURDAY");
            break;
            case 6:System.out.print("SUNDAY");
            break;
            default:System.out.print("ENTER VALID NUMBER BETWEEN 0 TO 6");
            break;
        }
    }
    public void OddDaysInCentury(int century,int leapyear,int normalyear)
    {
        for(int i=1;i<=century;i++)
        {
            if(i%400==0||i%4==0&&i%100!=0)
            {
                    leapyear++;
            }
            else
            {
                normalyear++;
            }
        }
        System.out.print("leap year:"+leapyear);
        System.out.println();
        System.out.print("normal year:"+normalyear);

        System.out.print("\n"+"NO OF ODD DAYS IN A "+century+" IS:"+(leapyear*2+normalyear*1)%7);
    }
    public void OddDaysInYear(int year,int oddaysinyear,int x,int z,int y)
    {
        year = year - 1;
        if(year%2==0)
        {
            z = year - 200;
        }
        else
        {
            z = year - 300;
        }
        for(int k=0;k<2;k++)
        {
            if(year%k==0)
            {
                break;
            }
            else
            {
                x = year%k;
                year = year/10;
            }
        }
        y = (year+x)-x;
        y = y%400;
        z = z%4;
        x = x%4;
        oddaysinyear = y + x + z;

    }
}

