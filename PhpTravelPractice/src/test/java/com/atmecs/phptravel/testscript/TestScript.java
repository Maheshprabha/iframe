package com.atmecs.phptravel.testscript;



import com.atmecs.phptravel.baseclass.BaseClass;

import com.atmecs.phptravel.pageaction.ChatboxPageactions;


public class TestScript extends BaseClass {
	ChatboxPageactions chatbox = new ChatboxPageactions();
	public void chatboxaction() throws Exception {
		chatbox.handlingFrames();
	}
}
	
	
	
	
	
	
	
/*	static Properties property;
	ReaderLocation read = new ReaderLocation();


	@Test
	public void handlingFrames() throws Exception {
		System.out.println("launch chrome");
		property = ReaderLocation.readLocation(FilePath.locator_path); 
	
		
		property = ReaderLocation.readLocation(FilePath.User_path);
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

*/


		
	
