package utilities;

import java.util.HashMap;
import java.util.Map;

public class Context {
	
	public static Map<String, String> scenarioContext = new HashMap<String, String>();
	
	public static void setValue(String key, String value)
	{
		scenarioContext.put(key, value);
	}
	
	public static String getValue(String key)
	{
		return scenarioContext.get(key);
	}
	
	public static String isContains(String key)
	{
		return scenarioContext.get(key);
	}
}
