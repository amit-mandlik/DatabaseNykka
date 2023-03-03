$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./FeatureNykkaFile/DataTablewithoutHeader.feature");
formatter.feature({
  "line": 1,
  "name": "To verify Nykka website dataTable without header",
  "description": "Description: to check login functionality",
  "id": "to-verify-nykka-website-datatable-without-header",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Nykka websites login functionality",
  "description": "",
  "id": "to-verify-nykka-website-datatable-without-header;verify-nykka-websites-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open my chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter URL of website\"https://www.nykaa.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter my valid username and password",
  "rows": [
    {
      "cells": [
        "amitdmandlik46@gmail.com",
        "amit@0965"
      ],
      "line": 7
    },
    {
      "cells": [
        "ankitmandlik46@gmail.com",
        "ankit@0965"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should be on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTableWithoutHeader.i_open_my_chrome_browser()"
});
formatter.result({
  "duration": 42291088818,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.nykaa.com/",
      "offset": 23
    }
  ],
  "location": "DataTableWithoutHeader.i_enter_URL_of_website(String)"
});
formatter.result({
  "duration": 11234945384,
  "status": "passed"
});
formatter.match({
  "location": "DataTableWithoutHeader.i_enter_my_valid_username_and_password(DataTable)"
});
formatter.result({
  "duration": 25124313982,
  "status": "passed"
});
formatter.match({
  "location": "DataTableWithoutHeader.user_should_be_on_homepage()"
});
formatter.result({
  "duration": 38035,
  "status": "passed"
});
});