package com.cucumber.automation.web.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.cucumber.automation.utils.DriverFactory;
import com.google.common.base.Function;

public class LandingPage extends DriverFactory {
	
 /**
   * All locators will be mentioned here
   * 
   * For this example i am not using properties file for reading locators
   */
  
  private static WebElement element;

  public static WebElement wait(final By byValue) {
	  
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			   .withTimeout(10, TimeUnit.SECONDS)
			   .pollingEvery(300, TimeUnit.MILLISECONDS)
			   .ignoring(ElementNotVisibleException.class);

	Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>(){	
	
	WebElement element;
	
	public WebElement apply(WebDriver arg0) {
		System.out.println("Finding Element by " + byValue);
			element = arg0.findElement(byValue);
			if(element.isDisplayed() && element.isEnabled()) {
				System.out.println("Element Found");
				return element;
			} else {
				System.out.println("Element not found");
				return null;
			}
		}
	};
	
	try {
		return wait.until(function);
	} catch (Exception e) {
		return null;
	}
	
}
  
  public static WebElement btnLogin() {  	
		element = wait(By.id("login"));
		return element;
  }
  
  public static WebElement lnkRacing() {  	
		element = wait(By.xpath("//span[contains(@class, 'MenuItem_text_1Om') and text()='Racing']"));
		return element;
  }
  
  public static WebElement lnkhorses() {  	
		element = wait(By.xpath("//span[contains(@class, 'MenuItem_text_1Om') and text()='Horses']"));
		return element;
  }
  
  public static WebElement lblHorseRacing() {  	
		element = wait(By.xpath("//div[contains(@class,'EventTypeHeader_content_3oL')]/span[text()='Horse Racing']"));
		return element;
  }
  
  
  public static WebElement btnTrendingBet() {
	   		//I am not happy with this xpath, but due to time constraints this best I could do. Though I would like to make it better
	  element = wait(By.xpath("//div[@class='TilesLayout_tiles_2mE']//div[@class='TrendingBets_betPair_2km'][1]/div[@class='TrendingBets_bet_MoB'][1]//button[@class='BetButton_betButton_C1F']"));
	  
		return element;
  }
  
  public static WebElement imgQuickBet() {  	
		element = wait(By.xpath("//*[@alt='QuickBet']"));
		return element;
  }
  
  public static WebElement lblBetName() {  	
		element = wait(By.xpath("//span[@class='QuickBet_competitorName_Wxl']"));
		return element;
  }
  
  public static WebElement edtStake() {  	
		element = wait(By.xpath("//input[@placeholder='Stake' and @data-redesign-ga='QuickBet/Edit/QuickBetStake']"));
		return element;
  }
  
  public static WebElement edtStakeDetails() {  	
		element = wait(By.xpath("//input[@placeholder='Stake' and @class='CurrencyBox_currencyBox_2ey CurrencyBox_withSymbol_2qf']"));
		return element;
  }
  
  public static WebElement lblPayout() {  	
		element = wait(By.xpath("//*[contains(@class, 'QuickBetOptions_payoutNumber')]"));
		return element;
  }
  
  public static WebElement btnAddBet() {  	
		element = wait(By.xpath("//button[contains(text(),'Add to Bet Slip')]"));
		return element;
  }
  
  public static WebElement lnkBetSlip() {  	
		element = wait(By.xpath("//span[contains(text(),'Bet slip')]"));
		return element;
  }
  
  public static WebElement lblBetNameDetails() {  	
		element = wait(By.xpath("//*[@class='Ticket_eventInfo_3VE']/h1"));
		return element;
  }
  
  public static WebElement lblPayoutDetails() {  	
		element = wait(By.xpath("//*[contains(@class, 'Ticket_payoutNumber')]/span"));
		return element;
  }
  
  public static WebElement lblPossiblePayoutDetails() {  	
		element = wait(By.xpath("//*[contains(@class, 'Betslip_possiblePayOut')]/span"));
		return element;
  }
  
  public static WebElement lblTotalCostDetails() {  	
		element = wait(By.xpath("//*[contains(@class, 'Betslip_field')]/span")); //1
		return element;
  }
   
}