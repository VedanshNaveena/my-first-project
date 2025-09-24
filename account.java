package com.shopvox.testing1;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.shopvox.base.baseClass;

public class account extends baseClass {
	public void addLogo() throws IOException {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-label=\"Settings\"]")));
 		driver.findElement(By.cssSelector("div[data-label=\"Settings\"]")).click();
 		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href=\"/settings/account\"]")));
 		driver.findElement(By.cssSelector("a[href=\"/settings/account\"]")).click();
 		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("h1[class=\"f f-alignItems-c height-64 css-5usmmn\"]")));
 		 File tempImage = File.createTempFile("upload", ".png");
   	  
   	  int width = 200, height = 200;
         BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

         Graphics2D g = image.createGraphics();
         g.setColor(Color.red);
         g.fillRect(0, 0, width, height);
         g.setColor(Color.BLACK);
         g.drawString("OnFly Image", 50, 100);
         g.dispose();

         ImageIO.write(image, "png", tempImage);
   	  
   	  
   	  
 		driver.findElement(By.cssSelector("input[type='file']")).sendKeys(tempImage.getAbsolutePath());
 		
	}
	
	

}
