package com.atmecs.phptravel.baseclass;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.atmecs.phptravel.filepath.FilePath;
import com.atmecs.phptravel.readerlocation.ReaderLocation;




public class BaseClass {
     Properties property;
     public static WebDriver driver;
     @BeforeTest
      public void invokeBrowser() throws IOException {
    	  property = ReaderLocation.readLocation(FilePath.Config_Path);
          System.setProperty("webdriver.chrome.driver", FilePath.Driver_Path);
          driver = new ChromeDriver();
          String baseUrl = property.getProperty("Url");
  		// driver.manage().window().maximize();
  		  System.out.println(baseUrl);
  		  driver.get(baseUrl);
  		  driver.manage().window().maximize();
  		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
    	  
}
}

