$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("web.feature");
formatter.feature({
  "line": 1,
  "name": "Web accessibility testing",
  "description": "",
  "id": "web-accessibility-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "validating if the web is accessible from mozila",
  "description": "",
  "id": "web-accessibility-testing;validating-if-the-web-is-accessible-from-mozila",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    },
    {
      "line": 5,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the mozila browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user navigate to the application",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user should be able to see application home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.the_mozila_browser_is_open()"
});
formatter.result({
  "duration": 109919900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_navigate_to_the_application()"
});
formatter.result({
  "duration": 84900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_see_application_home_page()"
});
formatter.result({
  "duration": 65600,
  "status": "passed"
});
formatter.uri("webTest.feature");
formatter.feature({
  "line": 3,
  "name": "web test feature",
  "description": "",
  "id": "web-test-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "the browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef.the_browser_is_open()"
});
formatter.result({
  "duration": 120500,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "scenario 1",
  "description": "",
  "id": "web-test-feature;scenario-1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user goes to the website",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user should be able to buy products",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_goes_to_the_website()"
});
formatter.result({
  "duration": 71600,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_buy_products()"
});
formatter.result({
  "duration": 618800,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "the browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef.the_browser_is_open()"
});
formatter.result({
  "duration": 85100,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "scneario 2",
  "description": "",
  "id": "web-test-feature;scneario-2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user goes to the sign up page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user should be able to sign up for new accounts",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_goes_to_the_sign_up_page()"
});
formatter.result({
  "duration": 81100,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_sign_up_for_new_accounts()"
});
formatter.result({
  "duration": 57700,
  "status": "passed"
});
});