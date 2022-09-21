package EXE_Property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DD1
{
	@Test
	public void state1() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./p.properties"));
		String A1 = p.getProperty("Base_URL");
		System.out.println(A1);
	}

}
