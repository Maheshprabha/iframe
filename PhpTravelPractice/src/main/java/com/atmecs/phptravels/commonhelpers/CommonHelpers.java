package com.atmecs.phptravels.commonhelpers;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonHelpers {
	public static void webElement(WebDriver driver, String elementPath, String actual, String expected) {
		driver.findElement(By.xpath(elementPath)).getText();
    }

	public static void sendText(WebDriver driver, String elementPath, String value) {
		driver.findElement(By.xpath(elementPath)).sendKeys(value);
	}

	public static void clickAction(WebDriver driver, String elementPath) {
		driver.findElement(By.xpath(elementPath)).click();
		
	}

	public static void mouseMoveOver(WebDriver driver, String elementPath) {
		WebElement element = driver.findElement(By.xpath(elementPath));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	public static void findFrame(WebDriver driver, String name) {
		try {
			List<WebElement> elements = driver.findElements(By.tagName("iframe"));
			int numberOfTags = elements.size();
			System.out.println("No. of Iframes on this Web Page are: " + numberOfTags);
			driver.switchTo().frame(name);
			System.out.println("Switching to the frame");
			Actions actions = new Actions(driver);
			WebElement findElement = driver.findElement(By.xpath(name));
			actions.moveToElement(findElement).perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", name);
         driver.switchTo().parentFrame();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void scrollDown(WebDriver driver, String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public static void clickJavaScriptExecutor(WebDriver driver, String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	public static void dropDownMenu(WebDriver driver, String mainMenu, String subMenu) throws Exception {
		WebElement element = driver.findElement(By.xpath(mainMenu));
		Select select = new Select(element);
		select.selectByVisibleText(subMenu);
	}
	//public static void switchTOWindow(WebDriver driver ,int index) {
		//String windowId = null;
		//Set<String> windowIds =  driver.getWindowHandles();
		//Iterator<String> iter = windowIds.iterator();
		//for(int i=1;i<=index;i++) {
			//windowId=iter.next();
		//}
		//driver.switchTo().window(windowId);
	//}
	public static void switchTOWindows(WebDriver driver ,String elementPath) {
     String mainWindow=driver.getWindowHandle();
	Set<String> set =driver.getWindowHandles();
	Iterator<String> itr= set.iterator();
	while(itr.hasNext()){
	String childWindow=itr.next();
	if(!mainWindow.equals(childWindow)){
	driver.switchTo().window(childWindow);
	System.out.println("childwindow" + driver.switchTo().window(childWindow).getTitle());
	driver.close();
	}
	
    driver.switchTo().window(mainWindow);
	System.out.println("mainwindow" + driver.switchTo().window(mainWindow).getTitle());

    
	}
	}
}
