
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;



public class Hello {
    
    //private static final Logger logger = Logger.getLogger(Hello.class);
	private static Logger logger = Logger.getLogger(Hello.class);
	
    public static void main(String argv[]) {

  	DOMConfigurator.configure("log4j.xml");
    logger.info("Test Log");
  	
  	logger.debug("Hello world.");
  	logger.info("What a beatiful day.");
    }
  }
