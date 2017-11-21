import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Test {



	public static void main(String[] args) {
		System.out.println("Hello");
		BasicConfigurator.configure();
		final Logger logger = Logger.getLogger(Test.class);
		logger.info("Hello Neeraj Gupta");

		logger.debug("Hello World!");
                logger.info("hello");

	}

}
