package mcgill_ecse429.arti1;

import org.junit.Test;

public class AppTest
{
	@Test
	public void testMainMethodForNull() {
		App.main(null);
	}

	@Test
	public void testMainMethodForEmptyArray() {
		App.main(new String[0]);
	}

	@Test
	public void testMainMethodForNonEmptyArray() {
		String[] args = {"Hello", "World"};
		App.main(args);
	}
}