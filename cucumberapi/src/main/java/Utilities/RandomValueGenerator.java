package utilities;

import org.apache.commons.lang3.RandomStringUtils;



public class RandomValueGenerator {


	public static String getrandomAlphabets(int n) {

		String str = RandomStringUtils.randomAlphabetic(n);
		return str;
	}

	public static String getrandomAlphanumerict(int n) {
	
		String str = RandomStringUtils.randomAlphanumeric(n);
		return str;
	}

	public static String getNumeric(int n) {
	
		String str = RandomStringUtils.randomNumeric(n);
		return str;
	}
	
	
}
