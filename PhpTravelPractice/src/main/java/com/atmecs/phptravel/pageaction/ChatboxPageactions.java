package com.atmecs.phptravel.pageaction;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.phptravel.filepath.FilePath;
import com.atmecs.phptravel.readerlocation.ReaderLocation;
import com.atmecs.phptravels.commonhelpers.CommonHelpers;

public class ChatboxPageactions {
	static Properties property;
	ReaderLocation read = new ReaderLocation();
	WebDriver driver;


	@Test
	public void handlingFrames() throws Exception {
		System.out.println("launch chrome");
		property = ReaderLocation.readLocation(FilePath.locator_path); 
	
		
		property = ReaderLocation.readLocation(FilePath.User_path);
		driver.switchTo().frame("chat-Widget");
		CommonHelpers.findFrame(driver, property.getProperty("loc_chat"));

	    
        //enter user mail name
        CommonHelpers.sendText(driver, property.getProperty("loc_name"), property.getProperty("user_name"));
        
        //enter user password
        CommonHelpers.sendText(driver, property.getProperty("loc_whatsapp"), property.getProperty("user_whatsapp"));
        
        //select mail id
        CommonHelpers.sendText(driver, property.getProperty("loc_email"), property.getProperty("user_mailid"));

        //select checkbox
        CommonHelpers.clickAction(driver,  property.getProperty("loc_checkbox"));
        
        //select dropdown
		CommonHelpers.dropDownMenu(driver, property.getProperty("loc_option"), property.getProperty("user_choose"));
		
        //click submit button
        CommonHelpers.clickAction(driver, property.getProperty("loc_submit"));



	}
		


}
