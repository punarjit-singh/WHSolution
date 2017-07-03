package com.cucumber.automation.bdt.stepDefinitions;

import com.cucumber.automation.web.actions.LandingPage_Action;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class add_racing_bet_steps {
	
	@Given("^I am on William Hill landing page$")
	public void i_am_on_William_Hill_landing_page() throws Throwable {
	   LandingPage_Action.verifyBtnLogin();
	}

	@When("^I expand Racing section$")
	public void i_expand_Racing_section() throws Throwable {
		LandingPage_Action.clickLnkRacing();
	}

	@Then("^I see Horses link under Next To Jump section$")
	public void i_see_Horses_link_under_Next_To_Jump_section() throws Throwable {
		LandingPage_Action.verifyLnkHorses();
	}

	@When("^I click Horses link$")
	public void i_click_Horses_link() throws Throwable {
		LandingPage_Action.clickLnkHorses();
	}

	@Then("^I see Horse Racing page$")
	public void i_see_Horse_Racing_page() throws Throwable {
		LandingPage_Action.verifyLblHorses();
	}

	@When("^I click on odd value button for top odd under Trending Multi$")
	public void i_click_on_odd_value_button_for_top_odd_under_Trending_Multi() throws Throwable {
		LandingPage_Action.clickBtnTrendingBet();
	}

	@Then("^I see QuickBet popup$")
	public void i_see_QuickBet_popup() throws Throwable {
		LandingPage_Action.verifyImgQuickBet();
	}
	
	@When("^I add stake value$")
	public void i_add_stake_value() throws Throwable {
		LandingPage_Action.enterStakeValue("10.50");
		LandingPage_Action.getBetNameValue();
		LandingPage_Action.getPayoutValue();
	}

	@When("^I click Add to Bet Slip button$")
	public void i_click_Add_to_Bet_Slip_button() throws Throwable {
		LandingPage_Action.clickBtnAddBet();
	}

	@Then("^QuickBet popup closes$")
	public void quickbet_popup_closes() throws Throwable {
		LandingPage_Action.verifyImgQuickBetNotExist();
	}

	@When("^I click Bet Slip$")
	public void i_click_Bet_Slip() throws Throwable {
		Thread.sleep(2000);
		LandingPage_Action.clickLnkBetSlip();
	}

	@Then("^I see Bet Details$")
	public void i_see_Bet_Details() throws Throwable {
		LandingPage_Action.getBetNameDetailsValue();
		LandingPage_Action.getPayoutDetailsValue();
		LandingPage_Action.getPossiblePayoutDetailsValue();
		LandingPage_Action.getTotalCostDetailsValue();
		LandingPage_Action.getStakeDetailsValue();
	}
	
	@Then("^Bet Details are correct$")
	public void bet_Details_are_correct() throws Throwable {
		LandingPage_Action.verifyBetDetails();
	}

}