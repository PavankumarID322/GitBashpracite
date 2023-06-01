package com.actitime.testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	
	public static void main(String[] args) {

		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		dr.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> tName = dr.findElements(By.xpath("//span[@class='u-hide-phablet']"));
		List<WebElement> match=dr.findElements(By.xpath("//td[@class='table-body__cell u-center-text']/../td[3]"));
		WebElement first=dr.findElement(By.xpath("//td[@class='rankings-block__banner--matches']"));
		System.out.println(tName.get(0).getText()+" = "+first.getText());
		for(int i=0;i<tName.size();i++) {
			String t=tName.get(i+1).getText();
			String n=match.get(i).getText();
			System.out.println(t+" = "+n);
		}
		dr.close();
		
	}

}
