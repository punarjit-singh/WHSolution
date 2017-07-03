package com.cucumber.automation.web.actions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.cucumber.automation.utils.DriverFactory;
import com.cucumber.automation.web.pages.LandingPage;

public class LandingPage_Action extends DriverFactory {
	
	public static String PossiblePayoutValue , BetNameValue, StakeValue, 
	PayoutDetailsValue, BetNameDetailsValue, 
	PossiblePayoutDetailsValue, TotalCostDetails, StakeValueDetails;
	
	  /**
	   * All functions related to behavior will follow now
	   */
	
	public static void verifyBtnLogin() {
		Assert.assertNotNull(LandingPage.btnLogin());
	}

	public static void clickLnkRacing() {
		LandingPage.lnkRacing().click();
	}
	
	public static void verifyLnkHorses() {
		Assert.assertNotNull(LandingPage.lnkhorses());
	}
	
	public static void clickLnkHorses() {
		LandingPage.lnkhorses().click();
	}
	
	public static void verifyLblHorses() {
		Assert.assertNotNull(LandingPage.lblHorseRacing());
	}
	
	public static void clickBtnTrendingBet() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,600)", "");
		LandingPage.btnTrendingBet().click();
	}
	
	public static void verifyImgQuickBet() {
		Assert.assertNotNull(LandingPage.imgQuickBet());
	}
	
	public static String getBetNameValue() {
		BetNameValue = LandingPage.lblBetName().getText();
		System.out.println("BetNameValue" + " " + BetNameValue);
		return BetNameValue;
	}
	
	public static void enterStakeValue(String arg0) {
		StakeValue = arg0;
		LandingPage.edtStake().sendKeys(arg0);
	}
	
	public static String getPayoutValue() {
		PossiblePayoutValue = LandingPage.lblPayout().getText();
		System.out.println("PossiblePayoutValue" + " " + PossiblePayoutValue);
		return PossiblePayoutValue;
	}
	
	public static void clickBtnAddBet() {
		LandingPage.btnAddBet().click();
	}
	
	public static void verifyImgQuickBetNotExist() {
		Assert.assertNull(LandingPage.imgQuickBet());
	}
	
	public static void clickLnkBetSlip() {
		LandingPage.lnkBetSlip().click();
	}
		
	public static String getBetNameDetailsValue() {
		BetNameDetailsValue = LandingPage.lblBetNameDetails().getText();
		System.out.println("BetNameDetailsValue" + " " + BetNameDetailsValue);
		return BetNameDetailsValue;
	}
	
	public static String getPayoutDetailsValue() {
		PayoutDetailsValue = LandingPage.lblPayoutDetails().getText();
		System.out.println("PayoutDetailsValue" + " " + PayoutDetailsValue);
		return PayoutDetailsValue;
	}
	
	public static String getPossiblePayoutDetailsValue() {
		PossiblePayoutDetailsValue = LandingPage.lblPossiblePayoutDetails().getText();
		System.out.println("PossiblePayoutDetailsValue" + " " + PossiblePayoutDetailsValue);
		return PossiblePayoutDetailsValue;
	}
	
	public static String getTotalCostDetailsValue() {
		TotalCostDetails = LandingPage.lblTotalCostDetails().getText();
		System.out.println("TotalCostDetails" + " " + TotalCostDetails);
		return TotalCostDetails;
	}
	
	public static String getStakeDetailsValue() {
		StakeValueDetails = LandingPage.edtStakeDetails().getAttribute("value");
		System.out.println("StakeValueDetails" + " " + StakeValueDetails);
		return StakeValueDetails;
	}
	
	public static void verifyBetDetails() {
		Assert.assertTrue(BetNameValue.equalsIgnoreCase(BetNameDetailsValue));
		Assert.assertTrue(StakeValue.equalsIgnoreCase(StakeValueDetails));
		Assert.assertTrue(PossiblePayoutValue.equalsIgnoreCase(PayoutDetailsValue));
		Assert.assertTrue(PossiblePayoutValue.equalsIgnoreCase(PossiblePayoutDetailsValue));
		Assert.assertTrue(PossiblePayoutValue.equalsIgnoreCase(TotalCostDetails));
	}

}