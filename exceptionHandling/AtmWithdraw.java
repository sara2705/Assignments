package exceptionHandling;

public class AtmWithdraw implements AmountWithdraw{
	@Override
	public boolean withDraw(double balance,double amount) throws InsufficientBalanceException 
	{
		if(balance<amount) throw new InsufficientBalanceException("InSufficient Balance");
		return true;
	}
}
