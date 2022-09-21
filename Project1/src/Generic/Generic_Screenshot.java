package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_Screenshot extends Base_Test
{
	public static void get_photo(WebDriver d) throws IOException
	{
		String photo="./Screenshot_photos";
		TakesScreenshot TS=(TakesScreenshot)d;
		File src = TS.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+".jpeg");
		FileUtils.copyFile(src, dst);
		
	}
	
}
