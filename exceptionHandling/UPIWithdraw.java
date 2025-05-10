package exceptionHandling;

public class UPIWithdraw implements AmountWithdraw{
	public boolean withDraw(double balance,double amount) throws InsufficientBalanceException
	{
		if(balance < amount) throw new InsufficientBalanceException("Insuffficient balance");
		return true;
	}
}