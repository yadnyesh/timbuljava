package io.java9.in28minutes.exceptionHandling;

public class Amount {
	private String currency;
	private int amount;
	
	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount amount) throws Exception {
		if(!this.currency.equals(amount.currency)){
			throw new Exception("Currencies don't match");
		}
		this.amount += amount.amount;
	}
	
	@Override
	public String toString() {
		return "Amount{" + "currency='" + currency + '\'' + ", amount=" + amount + '}';
	}
	
}

class ThrowingExceptionRunner {
	
	public static void main(String[] args) {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}
}