package exceptionHandling;

public interface AmountWithdraw {
	public boolean withDraw(double balance,double amount) throws InsufficientBalanceException;
}
