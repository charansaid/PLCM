package api.PLCM.Scripts;

import java.io.FileInputStream;
import java.util.Properties;


public class GetToken {

	public String fetch(String type) throws Exception
	{
		FileInputStream plcm = new FileInputStream("C:\\Eclipse_WS\\PLCM.properties");
		Properties read = new Properties();

		read.load(plcm);

		String TV = read.getProperty(type);

		return TV;
	}

}
