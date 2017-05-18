package net.uae.pgobjects.uae.pgobjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class VODashboard extends PageObject{
	@FindBy(xpath = ".//*[@id='header']/div[1]/div[2]/div[1]/div/a/span[2]")
	WebElement exproductdel_txt;
	
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
	
	@FindBy(id = "eRdmStore")
	WebElement redeem_btn;
	
	@FindBy(partialLinkText = "Q-breaks")
	WebElement Qbreak_link;
	
	@FindBy(xpath = ".//*[@id='header']/div[1]/div[2]/div[1]/div/a/span[1]")
	WebElement shpcart_btn;

	@FindBy(xpath = ".//*[@id='header']/div[1]/div[2]/div[1]/div/div/div[2]/div/a/span")
	WebElement prodDel_btn;
	
	public void clickQBreak() {
		Qbreak_link.click();
	}
	
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
	public void clickRedeem(){
		redeem_btn.click();
	}
	public void emptycart() {
		try {
			if (Integer.parseInt(exproductdel_txt.getText()) > 0) {
				shpcart_btn.click();
				
				prodDel_btn.click();
			}
		} catch (org.openqa.selenium.ElementNotVisibleException e) {
			// TODO: handle exception
		}	
	}
}
