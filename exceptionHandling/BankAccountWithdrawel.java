package exceptionHandling;

import java.util.Scanner;

public class BankAccountWithdrawel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Initial Balance :");
		double balance=sc.nextDouble();
		while(true)
		{
			System.out.println("1.Atm \n2.Card \n3.UPI \n4.Checkbalance \n5.Exit");
			System.out.println("Enter Mode Of Withdraw :");
			int choice =sc.nextInt();
			double withdraw=0;
			if(choice!=4 || choice!=5) 
			{
				System.out.print("Entre With Drawel Amount :");
				withdraw=sc.nextDouble();
			}
			try
			{
				switch(choice)
				{
					case 1:
					{
						AmountWithdraw obj=new AtmWithdraw();
						if(obj.withDraw(balance,withdraw)) {
							balance-=withdraw;
							System.out.println("Amount Withdrawed SuccessFully");
						}
						break;
						
					}
					case 2:
					{
						AmountWithdraw obj=new CardWithdraw();
						if(obj.withDraw(balance,withdraw)) {
							balance-=withdraw;
							System.out.println("Amount Withdrawed SuccessFully");
						}
						break;
					}
					case 3:
					{
						AmountWithdraw obj=new UPIWithdraw();
						if(obj.withDraw(balance,withdraw)) {
							balance-=withdraw;
							System.out.println("Amount Withdrawed SuccessFully");
						}
						break;
					}
					case 4:
					{
						System.out.println("Balance :"+balance);
						break;
					}
					case 5:
					{
						System.exit(0);
					}
				}
			} 
			catch(InsufficientBalanceException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
