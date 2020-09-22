package com.atmecs.phptravel.testscript;



import com.atmecs.phptravel.baseclass.BaseClass;

import com.atmecs.phptravel.pageaction.ChatboxPageactions;


public class TestScript extends BaseClass {
	ChatboxPageactions chatbox = new ChatboxPageactions();
	public void chatboxaction() throws Exception {
		chatbox.handlingFrames();
	}
}
	
	
	
	
	
	
	
