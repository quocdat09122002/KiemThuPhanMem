package Testbasic;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vlogtruyentest {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
	
		driver.navigate().to("https://vlogtruyen2.net/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

	}
	
	@Test
	public void search() throws InterruptedException {
		// chuc nang tim kiem
		WebElement search = driver.findElement(By.id("qsearch"));
		search.sendKeys("do long");
		
		Thread.sleep(2000);

		WebElement searchBnt = driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[2]/div[1]/form[1]/div[1]/div[2]/button[1]"));
		searchBnt.click();
		
		Thread.sleep(2000);

		WebElement result = driver.findElement(By.xpath("//body/div[4]/div[1]/ul[1]/li[1]/div[2]/a[1]/h3[1]"));

		Assert.assertEquals("Đồ Long",result.getText());
		
		// chuc nang theo doi truyen
		WebElement TK = driver.findElement(By.id("qsearch"));
		TK.sendKeys("do long");
		
		Thread.sleep(2000);

		WebElement NTK = driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[2]/div[1]/form[1]/div[1]/div[2]/button[1]"));
		NTK.click();
		
		Thread.sleep(2000);
		
		WebElement searchyt = driver.findElement(By.xpath("//body/div[4]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]/img[1]"));
		searchyt.click();
		
		Thread.sleep(2000);
		
		WebElement themyt = driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[2]"));
		themyt.click();
		
		// chuc nang dang nhap
		WebElement DNBnt = driver.findElement(By.id("btnLogin"));
		DNBnt.click();
		
		WebElement TenDN = driver.findElement(By.xpath("//body/div[@id='myModal']/div[1]/div[2]/div[2]/form[1]/div[1]/input[1"));
		TenDN.sendKeys("quocdat");
		
		WebElement MKDN = driver.findElement(By.xpath("//body/div[@id='myModal']/div[1]/div[2]/div[2]/form[1]/div[2]/input[1]"));
		MKDN.sendKeys("123456");
		
		WebElement DN = driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]"));
		DN.click();
		
		// chuc nang lich su truyen
		WebElement LSbnt = driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/div[1]/img[1]"));
		LSbnt.click();
		
		Thread.sleep(2000);
		
		WebElement Home = driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[1]/a[1]/img[1]"));
		Home.click();
		
		Thread.sleep(2000);
		
		WebElement cLS = driver.findElement(By.xpath("//body/div[6]/div[2]/div[1]/div[1]/a[1]"));
		cLS.click();
		
		// chuc nang xoa lich su
		WebElement xLS = driver.findElement(By.className("remove-history-btn"));
		xLS.click();
	}

//	@After
//	public void shutDown() {
//		driver.close();
//		driver.quit();
//	}

}
