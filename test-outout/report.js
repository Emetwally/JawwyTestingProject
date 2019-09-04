$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Basem/eclipse-workspace/JawwyTestingProject/src/test/java/TvJawwyFeatures/SampleFeature.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#sampletesting.feature"
    }
  ],
  "line": 2,
  "name": "Verify sample tests for home and login screen",
  "description": "",
  "id": "verify-sample-tests-for-home-and-login-screen",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Background:"
    },
    {
      "line": 4,
      "value": "#Given Jawwytv site opens successfully"
    },
    {
      "line": 5,
      "value": "#When User changes language in welcome screen"
    },
    {
      "line": 6,
      "value": "#And User clicks on seven days free subscribe now button"
    },
    {
      "line": 7,
      "value": "#with Examples Keyword i will pass the username and password parameters"
    },
    {
      "line": 8,
      "value": "#Also i will combine username and password in one step"
    }
  ],
  "line": 10,
  "name": "Validate back button on payment screen",
  "description": "",
  "id": "verify-sample-tests-for-home-and-login-screen;validate-back-button-on-payment-screen",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@bottomtest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Jawwy homepage open successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user enters \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enters \"\u003cpassword\u003e\" also clicks on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should see back button displayed on payment screen",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "verify-sample-tests-for-home-and-login-screen;validate-back-button-on-payment-screen;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17,
      "id": "verify-sample-tests-for-home-and-login-screen;validate-back-button-on-payment-screen;;1"
    },
    {
      "cells": [
        "testuser@gm.com",
        "12345678"
      ],
      "line": 18,
      "id": "verify-sample-tests-for-home-and-login-screen;validate-back-button-on-payment-screen;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 18457084038,
  "status": "passed"
});
formatter.before({
  "duration": 6647105,
  "status": "passed"
});
formatter.before({
  "duration": 3253330,
  "status": "passed"
});
formatter.before({
  "duration": 2062220,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Validate back button on payment screen",
  "description": "",
  "id": "verify-sample-tests-for-home-and-login-screen;validate-back-button-on-payment-screen;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@bottomtest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Jawwy homepage open successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user enters \"testuser@gm.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enters \"12345678\" also clicks on continue button",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should see back button displayed on payment screen",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageStep.Validate_HomepageTitle()"
});
formatter.result({
  "duration": 9552707953,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testuser@gm.com",
      "offset": 13
    }
  ],
  "location": "HomepageStep.user_enters_username_and_password(String)"
});
formatter.result({
  "duration": 3641433208,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678",
      "offset": 13
    }
  ],
  "location": "HomepageStep.Click_at_Continue_button(String)"
});
formatter.result({
  "duration": 2794893516,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStep.Validate_Back_Button()"
});
formatter.result({
  "duration": 3018928428,
  "status": "passed"
});
formatter.after({
  "duration": 1173439401,
  "status": "passed"
});
formatter.before({
  "duration": 15249996222,
  "status": "passed"
});
formatter.before({
  "duration": 2289776,
  "status": "passed"
});
formatter.before({
  "duration": 6960882,
  "status": "passed"
});
formatter.before({
  "duration": 1944443,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Validate user navigates back to subscribe now page",
  "description": "",
  "id": "verify-sample-tests-for-home-and-login-screen;validate-user-navigates-back-to-subscribe-now-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@bottomtest"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "Jawwy homepage open successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "user enters \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user enters \"\u003cpassword\u003e\" also clicks on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user navigates back to subscribe now page",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user clicks on Click here link in create your account section",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user clicks on Subscribe link in Existing User section",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user should redirect to subscribe screen",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageStep.Validate_HomepageTitle()"
});
formatter.result({
  "duration": 7905837861,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cusername\u003e",
      "offset": 13
    }
  ],
  "location": "HomepageStep.user_enters_username_and_password(String)"
});
formatter.result({
  "duration": 4296678847,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cpassword\u003e",
      "offset": 13
    }
  ],
  "location": "HomepageStep.Click_at_Continue_button(String)"
});
formatter.result({
  "duration": 2556421728,
  "status": "passed"
});
formatter.match({
  "location": "SubscribeStepDefinition.NavigateBack_SubscribePage()"
});
formatter.result({
  "duration": 6164134076,
  "status": "passed"
});
formatter.match({
  "location": "SubscribeStepDefinition.Click_CreateYourAccountPage()"
});
formatter.result({
  "duration": 3951458710,
  "status": "passed"
});
formatter.match({
  "location": "SubscribeStepDefinition.Click_SubscribeLink()"
});
formatter.result({
  "duration": 1464160032,
  "status": "passed"
});
formatter.match({
  "location": "SubscribeStepDefinition.FinalStep_SubscribeScreen()"
});
formatter.result({
  "duration": 1148140757,
  "status": "passed"
});
formatter.after({
  "duration": 1009306214,
  "status": "passed"
});
formatter.before({
  "duration": 12828475708,
  "status": "passed"
});
formatter.before({
  "duration": 1709332,
  "status": "passed"
});
formatter.before({
  "duration": 2794220,
  "status": "passed"
});
formatter.before({
  "duration": 1487999,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "Validate terms and conditions page",
  "description": "",
  "id": "verify-sample-tests-for-home-and-login-screen;validate-terms-and-conditions-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 51,
      "name": "@bottomtest"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "Jawwy homepage open successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "user clicks on Terms and Conditions link in create your account section",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "user should see that Terms and Conditions section is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageStep.Validate_HomepageTitle()"
});
formatter.result({
  "duration": 8215078031,
  "status": "passed"
});
formatter.match({
  "location": "TermsNcondsStepDefinition.Click_TermsNCondURL()"
});
formatter.result({
  "duration": 1193317606,
  "status": "passed"
});
formatter.match({
  "location": "TermsNcondsStepDefinition.Verify_TermsNConditionsPage()"
});
formatter.result({
  "duration": 1747187780,
  "status": "passed"
});
formatter.after({
  "duration": 1005368884,
  "status": "passed"
});
});