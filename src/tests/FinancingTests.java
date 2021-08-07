package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectWhenValidData () {
		
		Financing f = new Financing(100000.00, 2000.00, 80);
		Assertions.assertEquals(100000.00, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}
	
	@Test
	public void constructorShouldtherowIllegalArgumentExceptionWhenInalidData () {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.00, 2000.00, 20);
		});
		
	}
	
	@Test
	public void setTotalAmountShouldSetDatatWhenValidData () {
		
		//arrange
		Financing f = new Financing(100000.00, 2000.00, 80);
		
		//action
		f.setTotalAmount(90000.00);
		
		//assert
		Assertions.assertEquals(90000.00, f.getTotalAmount());
		
	}
	
	@Test
	public void setTotalAmountShouldtherowIllegalArgumentExceptionWhenInalidData () {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.00, 2000.00, 80);
			f.setTotalAmount(110000.00);
		});
		
	}
	
	@Test
	public void setIncomeShouldSetDatatWhenValidData () {
		
		//arrange
		Financing f = new Financing(100000.00, 2000.00, 80);
		
		//action
		f.setIncome(2100.00);
		
		//assert
		Assertions.assertEquals(2100.00, f.getIncome());
		
	}
	
	@Test
	public void setIncomeShouldtherowIllegalArgumentExceptionWhenInalidData () {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.00, 2000.00, 80);
			f.setIncome(1900.00);
		});
		
	}
	
	@Test
	public void setMonthsShouldSetDatatWhenValidData () {
		
		//arrange
		Financing f = new Financing(100000.00, 2000.00, 80);
		
		//action
		f.setMonths(81);
		
		//assert
		Assertions.assertEquals(81, f.getMonths());
		
	}
	
	@Test
	public void setMonthsShouldtherowIllegalArgumentExceptionWhenInalidData () {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.00, 2000.00, 80);
			f.setMonths(79);
		});
		
	}
	
	@Test
	public void entryShouldCalculateEntryCorrectly () {
		
		Financing f = new Financing(100000.00, 2000.00, 80);
		
		Assertions.assertEquals(20000.00, f.entry());
	}

	@Test
	public void quotaShouldCalculateQuotaCorrectly () {
		
		Financing f = new Financing(100000.00, 2000.00, 80);
		
		Assertions.assertEquals(1000.00, f.quota());
	}


}
