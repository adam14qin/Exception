import java.math.BigDecimal;

public class BankAccount {
	private Double balance;

	public BankAccount(Double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws NegativeValueException {
		try {
			if (amount>balance){
				throw new NegativeValueException(BigDecimal.valueOf(amount-balance));
			}
			else balance-=amount;
		} catch (NegativeValueException e) {
			//System.out.println(e.getLocalizedMessage());
			System.out.println(e);
			System.out.println(e.getMessage());
		}		
	}
	
	public void quickwithdraw(double amount)throws NegativeValueException{
		try {
			if (amount>balance){
				throw new NegativeValueException();
			}
			else balance-=amount;
		} catch (NegativeValueException e) {
			//System.out.println(e.getLocalizedMessage());
			//System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
/*	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}*/

/*	public static void main(String[] args){
		BankAccount b=new BankAccount(500);
		try {
			b.withdraw(600);
		} catch (NegativeValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			b.quickwithdraw(600);
		} catch (NegativeValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(b);
	}*/
}
