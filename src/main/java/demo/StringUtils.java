package demo;

public class StringUtils {
	
	public static final String VERSION = "1.0";

	public static boolean isNullOrBlank(String value) {
		return value == null || value.isBlank();
	}
	
}
