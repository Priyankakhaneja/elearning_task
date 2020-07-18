@createcourse
Feature: Create a category and course
  I want to use this template for my feature file

 @login
 Scenario: to verify whether application allows admin to create a category
 Given launch application with url "http://elearningm1.upskills.in/index.php"
 Then i enter username "admin" and passowrd "admin@123"
 
	@createcategory
 Scenario: to create a course category
 Given i click on administration tab and course category
 Then i create a new category for course with category code "BL" and category name "Blended Learning"
 
 @createcourse
 Scenario: to create a course
 Given i click on admin tab and create a course link
 And i add title "testing" and code "tes"
 Then i add teacher "manzoor" category "BL322" and language "french"
 
 
 
 