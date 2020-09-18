package com.atmecs.phptravel.testscript;

import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.baseclass.BaseClass;
import com.atmecs.commonhelpers.CommonHelpers;
import com.atmecs.filepath.FilePath;
import com.atmecs.readerlocation.ReaderLocation;

public class TestScript extends BaseClass {
	static Properties property;
	ReaderLocation read = new ReaderLocation();


	@Test
	public void handlingFrames() throws Exception {
		System.out.println("launch chrome");
		property = ReaderLocation.readLocation(FilePath.locator_path); 
		CommonHelpers.findFrame(driver, "chat-widget");
		property = ReaderLocation.readLocation(FilePath.locator_path);
		property = ReaderLocation.readLocation(FilePath.User_path);

	    
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
