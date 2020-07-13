package ConfigReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	

	protected static Properties prop =null;
	protected static InputStream input = ReadProperties.class.getClassLoader().getResourceAsStream("config.properties");

	public static void main(String args[]) throws IOException {
		prop = readPropertiesFile();
      
     }

	   private static Properties readPropertiesFile() throws IOException {
		
		   		try {	
		          prop = new Properties();
		          prop.load(input);        
		      	 } 
      
	      		catch(FileNotFoundException fnf)
	      		{
	    	  		fnf.printStackTrace();
	      		} 
	      		catch(IOException ioe) 
	      		{
	    	  	ioe.printStackTrace();
	      		}
	      
	      		finally
	      		{
	    	  	input.close();
	      		}
				return prop;	    
              
	   }
   
	   public static String getBaseUrl() {
	        String baseUrl = prop.getProperty("baseURI");
	        if(baseUrl != null) return baseUrl;
	        else throw new RuntimeException("baseURI not specified in the Configuration.properties file.");
	    }

	    public static String getBasepath() {
	        String userId = prop.getProperty("basePath");
	        if(userId != null) return userId;
	        else throw new RuntimeException("basePath not specified in the Configuration.properties file.");
	    }
	    
	    public static String getTokenId() {
	        String userId = prop.getProperty("token");
	        if(userId != null) return userId;
	        else throw new RuntimeException("token not specified in the Configuration.properties file.");
	    }



}
