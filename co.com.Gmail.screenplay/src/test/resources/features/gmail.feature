#Author: jeacevedo92@gmail.com

@email
Feature: Gmail
				As a Web User
				I want to use Gmail
				To send an email

  @sendEmail
  Scenario: Send Email
    Given Jhon want to send an email in an automated way
    When  he login with user "jeacevedo92@utp.edu.co" and password "Mede789*&"
    And he send the mail
    |receiver							|subject		|message							|
    |jeacevedo92@gmail.com|test email	|This is a test email	|
    Then he verify the correct sending of the email
    
   @sendEmailWithoutRecipient
  Scenario: Send Email without recipient
    Given Jhon want to send an email in an automated way
    When  he login with user "jeacevedo92@utp.edu.co" and password "Mede789*&"
    And he send the mail without recipient
    |receiver	|subject		|message							|
    |					|test email	|This is a test email	|
    Then he should see the message on the screenPlease specify at least one recipient

    
    @DeleteEmail
    Scenario: delete email
    Given Jhon wants delete an email 
    When  he login with user "jeacevedo92@utp.edu.co" and password "Mede789*&"
    And he select and delete the message
    Then Verify that the message is in the trash
    
    @EmptyTrash
    Scenario: delete all emails from the trash
    Given Jhon wants delete all emails from the trash
    When  he login with user "jeacevedo92@utp.edu.co" and password "Mede789*&"
    And he delete all emails from the trash
    Then he should not see any message in the trash
    
    
    