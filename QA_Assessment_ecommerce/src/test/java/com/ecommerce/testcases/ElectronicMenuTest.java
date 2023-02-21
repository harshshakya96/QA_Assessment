package com.ecommerce.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ecommerce.base.TestBaseClasss;

public class ElectronicMenuTest extends TestBaseClasss {

	@Test
	public static void MenuTest() {

		driver.findElement(By.xpath(loc.getProperty("login_PopUp_icon"))).click();
		driver.findElement(By.xpath(loc.getProperty("Mobile_link"))).click();
		driver.findElement(By.xpath(loc.getProperty("Electronic_link"))).click();
		List<WebElement> list = driver.findElements(By.xpath(loc.getProperty("Menu_items")));

		for (WebElement menu : list) {
			System.out.println(menu.getText());
		}

	}

}
