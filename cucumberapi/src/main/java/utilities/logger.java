package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logger {
	
	//private static Logger logger = LogManager.getLogger(logger.class);

	/*public static void main(String[] args) {
		
		log().trace("this is trace");
		log().info("this is info");
		log().warn("this is warning");
		log().error("this is error");
		log().fatal("this is fatal");
		

	}*/
	
	public static Logger log() {
	 
		return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}
	

}
