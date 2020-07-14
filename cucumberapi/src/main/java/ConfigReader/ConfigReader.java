package ConfigReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
		   
	 private Properties prop;
	 String path = System.getProperty("user.dir");
	 private final String propertyFilePath= "config.properties";
	 
	 
	 public ConfigReader() throws IOException{
		 	
		 BufferedReader reader;
		 	try {
			 reader = new BufferedReader(new FileReader(propertyFilePath));
			 prop = new Properties();		 
			 prop.load(reader);
			 reader.close();
		 	} 
			 catch (FileNotFoundException e)
			 {
			 e.printStackTrace();
			 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
			 } 
	 }	
   
	  public String getBaseUrl() {
	        String baseUrl = prop.getProperty("baseURI");
	        if(baseUrl != null)
	        	return baseUrl;
	        else throw new RuntimeException("baseURI not specified in the Configuration.properties file.");
	    }

	    public String getBasepath() {
	        String basePath = prop.getProperty("basePath");
	        if(basePath != null) 
	        	return basePath;
	        else throw new RuntimeException("basePath not specified in the Configuration.properties file.");
	    }
	    
	    public String getTokenId() {
	        String token = prop.getProperty("token");
	        if(token != null) 
	        	return token;
	        else throw new RuntimeException("token not specified in the Configuration.properties file.");
	    }

	    public String getenv() {
	        String environment = prop.getProperty("environment");
	        if(environment != null)
	        	return environment;
	        else throw new RuntimeException("environment not specified in the Configuration.properties file.");
	    }
	    
	    public String gettestdata() {
	        String testdata = path+prop.getProperty("testdata");
	        if(testdata != null)
	        	return testdata;
	        else throw new RuntimeException("testdata not specified in the Configuration.properties file.");
	    }

}
