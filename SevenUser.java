package com.yourorganization.maven_sample;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SevenUser
{

    WebDriver driver;
	  @Test
	  public void openapp()
	  {  
		try
       {
	     ChromeOptions options = new ChromeOptions();
		 options.addArguments("--use-fake-ui-for-media-stream");
		 System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		 options.addArguments("--headless");
		 options.addArguments("--window-size=1280,720");
	  	 //options.addArguments("--disable-extensions");
		 //options.addArguments("-Djava.awt.headless=true");
		 options.addArguments("--allow-file-access-from-files");	
	     options.addArguments("--use-fake-device-for-media-stream");						
		 //options.addArguments("--use-file-for-fake-video-capture=");
		 options.addArguments("--use-file-for-fake-audio-capture=C:\\Users\\ASTR-34\\Desktop\\maven\\javaparser-maven-sample-master\\javaparser-maven-sample-master\\video\\38mb.mp4");
		 options.addArguments("--autoplay-policy=no-user-gesture-required");
		 options.addArguments("--disable-infobars");	
		 driver = new ChromeDriver(options);		
	     driver.get("https://live.monetanalytics.com/stu_proc/student.html#"); 	
	     driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//input[@class='bootbox-input bootbox-input-text form-control']")).sendKeys("Student-7");
	     System.out.println(driver.getTitle());	
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();	
	     Robot rb=new Robot();		
	   		
	     Thread.sleep(8000);			
	     rb.keyPress(KeyEvent.VK_TAB);						
	     rb.keyRelease(KeyEvent.VK_TAB);
	  
	     Thread.sleep(1000);
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(2000);
	     rb.keyPress(KeyEvent.VK_TAB);			
	  
	     rb.keyRelease(KeyEvent.VK_TAB);
	     Thread.sleep(1000);
	     rb.keyPress(KeyEvent.VK_TAB);		
	     rb.keyRelease(KeyEvent.VK_TAB);
	     Thread.sleep(2000);
	     rb.keyPress(KeyEvent.VK_ENTER);	
	     rb.keyRelease(KeyEvent.VK_ENTER);   
	     Thread.sleep(300000);
	     driver.close();
	     }catch(Throwable e)
         {
	     e.printStackTrace();  
          }


}
	    
	    
}