package sampleGittest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sampleGittest {
	@Test
	public void logintest() throws IOException{
		
		WebDriver wd= new FirefoxDriver();
		wd.get("http://www.bing.com");
		wd.manage().window().maximize();
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\SeleniumTraining\\sampleGittest\\Screenshot\\test.jpg"));
	}
	
	}

