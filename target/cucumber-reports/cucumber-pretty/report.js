$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("course.feature");
formatter.feature({
  "line": 2,
  "name": "Create a category and course",
  "description": "I want to use this template for my feature file",
  "id": "create-a-category-and-course",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@createcourse"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "to verify whether application allows admin to create a category",
  "description": "",
  "id": "create-a-category-and-course;to-verify-whether-application-allows-admin-to-create-a-category",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@createcategory"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "launch application with url \"http://elearningm1.upskills.in/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i enter username \"admin\" and passowrd \"admin@123\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://elearningm1.upskills.in/index.php",
      "offset": 29
    }
  ],
  "location": "stepdefinitions.launch_application_with_url(String)"
});
formatter.result({
  "duration": 16905468500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 18
    },
    {
      "val": "admin@123",
      "offset": 39
    }
  ],
  "location": "stepdefinitions.i_enter_username_and_passowrd(String,String)"
});
formatter.result({
  "duration": 11442722600,
  "status": "passed"
});
});