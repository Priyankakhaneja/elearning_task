@createcourse_excel
Feature: Create a category and course
  I want to use this template for my feature file

 @login1
 Scenario: to verify whether application allows admin to create a category
 Given launch application with url
 Then i enter username and passowrd
 And i create a new category for course 
 When i create a course
 Then i verify course is added
 