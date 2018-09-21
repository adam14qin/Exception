import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.NumberFormat;


public class NegativeValueException extends Exception {
	private BigDecimal negativeBalance;
	NumberFormat nf=NumberFormat.getCurrencyInstance();
	
	public NegativeValueException(){
		super("Error: negative balance");
	}
	
	public NegativeValueException(BigDecimal Balance){		
		super("Amount exceeds balance by "+Balance);
		this.negativeBalance=Balance;
		try(PrintWriter writer = new PrintWriter("logfile.txt");){
			writer.println("Amount exceeds balance by "+Balance);
			writer.close();	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Balance of "+nf.format(negativeBalance)+ " not allowed";
	}
	
	
	
}
