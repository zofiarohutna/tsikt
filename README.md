# SEMESTRAL ASSIGNMENT FROM TSIKT

## Contents
				
 - [TSIKT Assignment](#assignment)
 - [Our application](#application)
     * [Connection](#connection)
     * [Choice window](#choice-window)
     * [Student mode](#student-mode)   
     * [Covid restriction](#covid-restrictions)      
     * [Clerk](#clerk)
     	+ [Clerk login](#clerk-login)
     	+ [Clerk manager](#clerk-manager)
  - [Technologies](#technologies)
  - [Resources](#resources)


## TSIKT Assignment:


Imagine working in a company that received an order as one of many to create a proof of
concept of application of registration information system for a university. In times of a COVID19 pandemic, this will help minimize number of students waiting in queues - e.g. at the study
department, at the computer center, during the consultation of the final thesis, etc. Or you
can propose other situations.
The system should support 2 roles: student and clerk.

**The minimal functionality of the application must support:**
1. the student registers with the client application that he would like to visit the clerk and
personally handle the necessary request. The application will allow him to find out which is
his order in a queue (also continuously as the length of queue changes) and when he can visit
the clerk.
2. the client application will allow the clerk to find out how many students are waiting in
a queue and will allow the following student when he can come.

**Minimal standard of technical solution:**
3. the application must be of the client-server type
4. the client and server must be separate and communicate through a defined interface that
the server‘s class implements and the client class calls;
5. when presenting the final solution, the basic functionality must be demonstrated (manually
or automatically) - using 2 different students and 2 different clerks;
6. the server must use the collections framework and/or the Derby database;
7. the documentation must contain a detailed description of the interface between the client
and the server (e.g. using Javadoc) and a detailed description of the functional and nonfunctional features of the solution.

**The solution does not have to, but may include:**
- be persistent
- clients and server run in various processes
- use communication over TCP / UDP
- have a GUI or interactive screen (a predefined scenario is enough, eg using UNIT tests)
It is important that students be able to react promptly and answer any questions during
presenting the assignment (it is not important to submit the assignment, but also to defend
that you are really its author). The basic evaluation of the functionality will take place directly
at the exercise, a detailed evaluation of the entire solution, including the supplied
documentation will continue.

## OUR APPLICATION 
Our application helps to reduce the amount of students in PGO. Students are able to register that they want to visit their PGO referent (for 1st 2nd and 3rd grade of bachelor studium. It is possible to register also for people that are not students of FEI because the app does not work with ais database but students can register by their name and phone number. 

### Connection 
- We created method for getting connection between program and database server  
- Command for getting connection is: *DriverManager.getConnection("URL","name","Password")*
- System saves it into a variable and the method returns the varibale 
- This method is called every time we want to make something with database in entire program 

### Choice window 
**STUDENT mode button** opens registration form for students

**CLERK mode button** opens login form for clerks

### Student mode
- After the user has chosen Student mode in the first window he can see registration form for student 
- Students do not have to login with username and password
- Students can register by name surname and phone number and chooses which referent they student wants to visit and what day and time it should be 
- When student **fills in** the fields and presses the **CONFIRM button** the program:
1. Checks if all the fields are filled 
2. Takes the information of chosen referent and by that information choose the table with which system will work
3. Checks if the **phone number** is already in the table
	* If the system finds the phone number in table --> student already had a term (phone number is uniqe for every person so it can be our identifier) and system shows the term which is connected to the phone number
4. The phone number is not in the table so system checks if the chosen day and time occures in the table 
	* If the time and day occures in the certain row of the table --> someone has already reserved that terim so the system prompts students to choose another term 
5. The program did not find that day and time in ceratin row so the system can successfully register  student to the chosen term.
6. Displays window with regulation connected to COVID-19

* When user presses **EXIT button** he will see again the screen with choice

### Covid restrictions 
After successful registration student could see window with information and restrictions connected to COVID-19 pandemy

**CONTINUE button**  returns the *choice* window

**EXIT button** turns off the program 


### Clerk mode

#### Clerk login
- After the user has chosen Clerk mode in the first window, he can see Clerk loginform
- Clerks have to login with their username, password and ID and press **login button** 
- System checks if the row with username, passoword and ID occures in the evidence table 
- If username passoword and ID occures in the table, the clerk is successfully logged into the Clerk manager 

Clerk's login details   

| username      | password| ID     |
| :--- |    :----:   | ---: |
| Jozef     | 123     | 1   |
| Marek  | 321       |2   |
| Peter| 111 | 3|


#### Clerk manager 
Clerk can see empty **login table**, **REFRESH** button and **DELETE** button and **LOG OUT** button

**REFRESH button**
1. System uses clerk's ID to show certain table from database for each referent
2. Program selects everything from certain table and orders it by days of week (Monday to Friday) and by time (lowest to highest) and displays it in the empty table
	* Days of week are Strings but with CASE command we replaced strings (monday) with numbers (1) and order it from lowest to highest
3. Every time clerk presses the button, system shows actual data from the table

**DELETE button**
1. Clerk selects the row to be deleted (student is equipped)
2. System chooses the phone number from the table (because it is our "identifier") and converts it into the integer
3. Program finds the phone number in the table and deletes the entire row in which the phone belongs
4. When clerk presses the refresh button again, he won't see the deleted row

**LOG OUT button** 
1. Returns the *choice* window




### System information 
- **Name of project:** 
- **Authors:** Žofia Rohutná, Kristián Oljeník 
- **Programming Language:** Java 
- **Development Environment:** NetBeans IDE 8.2
- **Database:** Java Derby Database 
- **Documentation:** Javadoc, Markdown

### Resources 
- We got information from :
	- TSIKT lectures
	- Youtube tutorials: etc. [loginform example](https://www.youtube.com/watch?v=7m9cldwVGFc&t=1121s), [GUI design](https://www.youtube.com/watch?v=0EZQLyfCVWQ&t=52s)...
	- Programming forums etc. [stackoverflow](https://stackoverflow.com/)
- We created this doccumentation with [markdown editor](https://jbt.github.io/markdown-editor/)
