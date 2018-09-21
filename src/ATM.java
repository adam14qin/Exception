
public class ATM {
	private BankAccount b;

	public ATM() {
		super();
		BankAccount B=new BankAccount(500.0);
		this.b = B;
	}
	
	public void handleTransactions(){
		try {
			b.withdraw(600);
		} catch (NegativeValueException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		try {
			b.quickwithdraw(600);
		} catch (NegativeValueException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args){
		ATM atm=new ATM();
		atm.handleTransactions();
	}
	
	
}
