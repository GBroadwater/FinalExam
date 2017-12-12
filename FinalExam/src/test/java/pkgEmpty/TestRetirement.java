package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class TestRetirement {

	@Test
	public void test() {
		Retirement r = new Retirement(40, 0.07, 20, 0.02, 10000, 2642);
		assertTrue(554.13 == r.AmountToSave());
		assertTrue(1454485.55 == r.TotalAmountSaved());
	}

}
