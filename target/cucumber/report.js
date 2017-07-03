$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("add_racing_bet.feature");
formatter.feature({
  "line": 1,
  "name": "Add horse racing bet",
  "description": "In order to test add bet feature of William Hill application\r\nAs a non-registered user\r\nI want to specify stake value and other conditions",
  "id": "add-horse-racing-bet",
  "keyword": "Feature"
});
formatter.before({
  "duration": 25932070301,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "Flow till Horse Racing Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on William Hill landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I expand Racing section",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I see Horses link under Next To Jump section",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click Horses link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I see Horse Racing page",
  "keyword": "Then "
});
formatter.match({
  "location": "add_racing_bet_steps.i_am_on_William_Hill_landing_page()"
});
formatter.result({
  "duration": 3681064399,
  "status": "passed"
});
formatter.match({
  "location": "add_racing_bet_steps.i_expand_Racing_section()"
});
formatter.result({
  "duration": 1682236972,
  "status": "passed"
});
formatter.match({
  "location": "add_racing_bet_steps.i_see_Horses_link_under_Next_To_Jump_section()"
});
formatter.result({
  "duration": 6597328911,
  "status": "passed"
});
formatter.match({
  "location": "add_racing_bet_steps.i_click_Horses_link()"
});
formatter.result({
  "duration": 2690131100,
  "status": "passed"
});
formatter.match({
  "location": "add_racing_bet_steps.i_see_Horse_Racing_page()"
});
formatter.result({
  "duration": 575576440,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Add horse racing without logging in",
  "description": "",
  "id": "add-horse-racing-bet;add-horse-racing-without-logging-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I click on odd value button for top odd under Trending Multi",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I see QuickBet popup",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I add stake value",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click Add to Bet Slip button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "QuickBet popup closes",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I click Bet Slip",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I see Bet Details",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Bet Details are correct",
  "keyword": "And "
});
formatter.match({
  "location": "add_racing_bet_steps.i_click_on_odd_value_button_for_top_odd_under_Trending_Multi()"
});
formatter.result({
  "duration": 5800680109,
  "status": "passed"
});
formatter.match({
  "location": "add_racing_bet_steps.i_see_QuickBet_popup()"
});
formatter.result({
  "duration": 728359890,
  "status": "passed"
});
formatter.match({
  "location": "add_racing_bet_steps.i_add_stake_value()"
});
formatter.result({
  "duration": 3640957438,
  "status": "passed"
});
formatter.match({
  "location": "add_racing_bet_steps.i_click_Add_to_Bet_Slip_button()"
});
formatter.result({
  "duration": 611865054,
  "status": "passed"
});
formatter.match({
  "location": "add_racing_bet_steps.quickbet_popup_closes()"
});
formatter.result({
  "duration": 15683496782,
  "status": "passed"
});
formatter.match({
  "location": "add_racing_bet_steps.i_click_Bet_Slip()"
});
formatter.result({
  "duration": 2343936381,
  "status": "passed"
});
formatter.match({
  "location": "add_racing_bet_steps.i_see_Bet_Details()"
});
formatter.result({
  "duration": 968983261,
  "status": "passed"
});
formatter.match({
  "location": "add_racing_bet_steps.bet_Details_are_correct()"
});
formatter.result({
  "duration": 111613,
  "status": "passed"
});
formatter.after({
  "duration": 2037724182,
  "status": "passed"
});
});