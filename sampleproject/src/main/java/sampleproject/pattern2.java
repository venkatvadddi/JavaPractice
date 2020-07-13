package sampleproject;

import java.util.HashMap;

public class pattern2 {

	public static void main(String[] args) 
	{ 
		String pattern = "abba";   //true
		String str = "hungry Food hungry Food";
		
		/*String pattern = "abba";  //false
		String str = "hungry Food Food Food";
		
		String pattern = "abba";    //false
		String str = " hungry Food hungry Food";
		
		String pattern = "abba";    //false
		String str = "hungry Food hungry Food";*/
		
		boolean output = wordPattern(pattern, str);
		System.out.println(output);
	
	}
	

	static boolean wordPattern(String pattern, String str) {
	    String[] arr = str.split(" ");  
	 
	    //prevent out of boundary problem
	    if(arr.length != pattern.length())
	        return false;
	 
	    HashMap<Character, String> map = new HashMap<Character, String>();
	    for(int i=0; i<pattern.length(); i++){
	        char c = pattern.charAt(i);
	        if(map.containsKey(c)){
	            String value = map.get(c);
	            if(!value.equals(arr[i])){
	                return false;
	            }
	        }else if (map.containsValue(arr[i])){
	            return false;
	        }
	        map.put(c, arr[i]);
	    }
	 
	    return true;
	}
}
