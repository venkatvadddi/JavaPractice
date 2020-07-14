package Utilities;

import java.util.HashMap;
import java.util.Map;

public class Context {
	
	public static Map<String, String> scenarioContext = new HashMap<String, String>();
	
	public static void setContext(String key, String value)
	{
		scenarioContext.put(key, value);
	}
	
	public static String getContext(String key)
	{
		return scenarioContext.get(key);
	}
	
	public static String isContains(String key)
	{
		return scenarioContext.get(key);
	}
}
