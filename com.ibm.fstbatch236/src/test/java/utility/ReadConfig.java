package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	public ReadConfig() throws Exception {
		// TODO Auto-generated constructor stub
		FileInputStream fis=new FileInputStream("./testData/config.properties");
		Properties prop=new Properties();
		prop.load(fis);
						
	}

}
