import static org.junit.Assert.*;

import org.junit.Test;

import edu.gcu.bootcamp.cst135.milestone.model.Transaction;

public class CheckTest {

	private double accountBalance;

	@Test
	public void testGetOverdraft() {
		final double overDraft = 25;
		Checking checking = new Checking("Test", 0, overDraft); 
		assertEquals("Overdraft test fails", checking.getOverDraft(), overDraft, 0.001);
	}

	@Test
	public void testSetOverdraft() {
		final double overDraft = 25;
		Checking checking = new Checking("Test", 0, overDraft); 
		checking.setOverDraft(overDraft * 2);
		assertEquals("Overdraft test fails", checking.getOverDraft(), overDraft * 2, 0.001);
	}

	
	@Test
	public void testGetAccountNumber() {
        final String accountNumber = "TEST";
        Checking checking = new Checking(accountNumber, 0, 0);
        assertEquals("getAccountNumber test fails", checking.getAccountNumber(), accountNumber);
	}
	
	
	@Test
	public void testSetAccountNumber() {
        final String accountNumber = "TEST";
        Checking checking = new Checking(accountNumber, 0, 0);
        checking.setAccountNumber(accountNumber);
        assertEquals("SetAccountNumber test fails", checking.getAccountNumber(), accountNumber);
	}
	
	 @Test
	    public void testGetAccountBalance() {
	        final double balance = 500;
	        Checking checking = new Checking("TEST", balance, 0);
	        assertEquals("getAccountBalance test fails", checking.getAccountBalance(), balance, 0.001);
	    }
	    @Test
	    public void testSetAccountBalance() {
	        final double balance = 500;
	        Checking checking = new Checking("TEST", balance, 0);
	        checking.setAccountBalance(balance);
	        assertEquals("setAccountBalance test fails", checking.getAccountBalance(), balance, 0.001);

	    }
}
