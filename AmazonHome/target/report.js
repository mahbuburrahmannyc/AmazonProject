$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/amazon.feature");
formatter.feature({
  "line": 1,
  "name": "LogIn",
  "description": "\r\nDescription:Amazon LogIn",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Positive",
  "description": "",
  "id": "login;positive",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User on Amazon Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User click sign in",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enter UserName",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Click signIn Button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User Successfully LogIn",
  "keyword": "Then "
});
formatter.match({
  "location": "LogInStepDef.user_on_Amazon_Home_page()"
});
formatter.result({
  "duration": 18067311253,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDef.user_click_sign_in()"
});
formatter.result({
  "duration": 1522896319,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDef.user_enter_UserName()"
});
formatter.result({
  "duration": 266190774,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDef.user_enter_Password()"
});
formatter.result({
  "duration": 218888585,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDef.user_Click_signIn_Button()"
});
formatter.result({
  "duration": 2833258067,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDef.user_Successfully_LogIn()"
});
formatter.result({
  "duration": 616210630,
  "status": "passed"
});
});