import java.util.*;

public class New{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(Math.abs(n%7))
        {
            case 1:
            {
                System.out.println("Sunday");
                break;
            }
            case 2:
            {
                System.out.println("Monday");
                break;
            }
            case 3:
            {
                System.out.println("Tuesday");
                break;
            }
            case 4:
            {
                System.out.println("Wednesday");
                break;
            }
            case 5:
            {
                System.out.println("Thursday");
                break;
            }
            case 6:
            {
                System.out.println("Friday");
                break;
            }
            case 7:
            {
                System.out.println("Saturday");
                break;
            }
            default:
            {
                System.out.print("Invalid");
            }
        }
        System.out.println("Numbers from 1 to "+n);
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
        int m=n;
        System.out.println("Numbers from "+n+" to 1");
        while(m!=0)
        {
            System.out.println(m);
            m--;
        }
        int s=1;
        System.out.println("Printing Numbers from 1 to 3");
        do{
            System.out.print(s+" ");
            s++;
        }
        while(s!=4);

        sc.close();
    }
}