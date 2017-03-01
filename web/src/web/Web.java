package web;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Web {

	@BeforeMethod
	public static void setup() throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://192.168.140.66:9090/signin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("adminhlsango");
		driver.findElement(By.xpath(".//*[@id='app']/div/div[1]/div/div/form/div/button")).click();
		driver.findElement(By.xpath(".//*[@id='app']/div/div[2]/div[2]/div[3]/div[2]/a[1]/a")).click();
		driver.findElement(By.id("rw_1__listbox__option__0")).click();
		driver.findElement(By.className("rw-dropdownlist-picker rw-select rw-btn")).click();
		driver.findElement(By.id("rw_2__listbox__option__0")).click();
		
	}

	@AfterMethod
    public static void tearDown() throws Exception {
        
    }
	
	
	@Test
	public void dasdas() {
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.firefox.bin", "C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://192.168.140.66:9090/signin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("adminhlsango");
		driver.findElement(By.xpath(".//*[@id='app']/div/div[1]/div/div/form/div/button")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@placeholder=\"产品ID\"]/span")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(".//*[@id='rw_1__listbox__option__0']")).click();
		driver.findElement(By.xpath("//div[@placeholder=\"服务器ID\"]/span")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(".//*[@id='rw_2__listbox__option__9']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), '操作列表')]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"玩家昵称\"]")).sendKeys("asdsadas");
		//driver.close();   
	}
}
