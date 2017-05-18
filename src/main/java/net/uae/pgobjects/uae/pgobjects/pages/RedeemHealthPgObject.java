package net.uae.pgobjects.uae.pgobjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class RedeemHealthPgObject extends PageObject{
	
	@FindBy(xpath= ".//*[@id='productList']/div[2]/div[4]/div/div[1]/a[3]/span")
	 WebElement redeem_prod;
	 
	 public void clickRedeemProducts(){
		redeem_prod.click();
		 }
}
