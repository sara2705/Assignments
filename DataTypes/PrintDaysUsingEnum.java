import java.util.Scanner;

public class PrintDaysUsingEnum {
    enum Days{
        Sunday,Monday,Tuesday,Wedneday,Friday,Saturday
    }
    public static void main(String[] args) {
       
        for(Days day:Days.values())
        {
            System.out.println(day);
        }

        System.out.println("Enter the Day you want (1-7)");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0 && n<=7)
        {
            System.out.println(Days.values()[n-1]);
        }
        else System.out.println("You entered the Wrong option");
        sc.close();
    }
}
