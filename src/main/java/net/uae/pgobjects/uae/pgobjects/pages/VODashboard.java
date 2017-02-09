package net.uae.pgobjects.uae.pgobjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class VODashboard extends PageObject{
	
	@FindBy(xpath= ".//*[@id='mainNavi']/ul/li[1]/a")
	WebElement product_link;
	
	@FindBy(partialLinkText = "LifeQode")
	WebElement LifeQode_link;
	
	@FindBy(partialLinkText = "HomePure")
	WebElement HomePure_link;
	
	@FindBy(partialLinkText = "VTube+")
	WebElement vtube_link;
	
	@FindBy(xpath = ".//*[@id='header']/div/div[4]/a[2]")
	WebElement VO;
	
	public void clickproduct(){
		product_link.click();
	}
	
	public void clicklifeQode(){
		LifeQode_link.click();
	}
	
	public void clickHomePure(){
		HomePure_link.click();
	}
	
	public void clickVO(){
		VO.click();
	}
	public void clickVTube(){
		vtube_link.click();
	}
}
