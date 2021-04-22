$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/addUser.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "add a new user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is already logged in",
  "keyword": "Given "
});
formatter.step({
  "name": "user is in user Management module",
  "keyword": "And "
});
formatter.step({
  "name": "click on Add user",
  "keyword": "When "
});
formatter.step({
  "name": "Add user form should open",
  "keyword": "Then "
});
formatter.step({
  "name": "enter the values \u003cfistname\u003e, \u003clastname\u003e, \u003cemail\u003e, \u003caccessType\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "click on save",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fistname",
        "lastname",
        "email",
        "accessType"
      ]
    },
    {
      "cells": [
        "Rohit",
        "Sharma",
        "VK18@demo.comm",
        "Tester"
      ]
    }
  ]
});
formatter.scenario({
  "name": "add a new user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is already logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "AddUser_StepDefinition.user_is_already_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in user Management module",
  "keyword": "And "
});
formatter.match({
  "location": "AddUser_StepDefinition.user_is_in_user_Management_module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add user",
  "keyword": "When "
});
formatter.match({
  "location": "AddUser_StepDefinition.click_on_Add_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add user form should open",
  "keyword": "Then "
});
formatter.match({
  "location": "AddUser_StepDefinition.add_user_form_should_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the values Rohit, Sharma, VK18@demo.comm, Tester",
  "keyword": "Then "
});
formatter.match({
  "location": "AddUser_StepDefinition.enter_the_values_Virat_Kohli_VK_demo_comm_Tester(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on save",
  "keyword": "Then "
});
formatter.match({
  "location": "AddUser_StepDefinition.click_on_save()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});