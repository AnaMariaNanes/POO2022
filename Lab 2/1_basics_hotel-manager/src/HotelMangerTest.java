import org.junit.Assert;
import org.junit.Test;

public class HotelMangerTest {

	@Test
	public void testIsClean() {
		Assert.assertTrue(HotelManager.isClean(10));
		Assert.assertTrue(HotelManager.isClean(14));
	}

	@Test
	public void testIsNotClean() {
		Assert.assertFalse(HotelManager.isClean(200));
		Assert.assertFalse(HotelManager.isClean(-10));
	}
}
