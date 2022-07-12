package Pac1;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Ashottest {
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();	

		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		ru.yandex.qatools.ashot.Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
				

		ImageIO.write(s.getImage(), "jpg", new File("D:\\ElementScreenshot.png));
		
	}
}
