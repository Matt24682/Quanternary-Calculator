# Quaternary-Calculator

##Project Screenshots

###Initial startup of program:
![](images/program_startup.png)

###Entering quaternary values:
![](images/quaternary_values_entered.png)

###Converting values to decimal:
![](images/decimal_values.png)

###Result of the operation:
![](images/quaternary_result_value.png)

###Quaternary result converted to decimal:
![](images/standard_final_result.png)

##Project Manual

###To run the project, you will need to go into the Main class, click the green triangle next to the main function, and finally select "run Main.main()". This should start the calculator. Note: The user may have to download and/or configure Java 16 or openjdk-16 before running the program.
###Once the calculator appears on the screen, the user can select various numbers and operations during which the user can convert them over to their decimal values. Note that the user can only select one operation at a time.
###The user can run addition, subtraction, multiplication, division, as well as use square and square root quaternary numbers. One way you can tell if the number you are looking at is in quaternary or standard is if the program lets you use the buttons. If it allows you to use the other buttons, it means that the value is in quaternary, and if all buttons except for the convert and clear button is disabled, it means that the values are decimal numbers.
###The program has a default value set to where if the user doesn't enter a value and selects an operation (particularly for addition, subtraction, multiplication, and division), it will assume that the first value is 0. If the user doesn't enter a second value before selecting calculate, the program will add in a 0 as the second value, and run the calculation.
###The program also contains a clear button to where if the user accidentally selects a value or operation that they didn't want, they can clear all the values that they have entered and re-enter the value they actually wanted.
###Finally, when the user is ready to close out of the program, all they have to do is select the X button in the upper right corner of the calculator, and the program will close and finish running.

##Dependencies

###Program runs using Maven dependencies.

###-Java SDK 16
###-OpenJFX - JavaFX-FXML
###-OpenJFX - JavaFX-Graphics
###-OpenJFX - JavaFX-Controls
###-JUnit 4.13-Beta-3
###-JUnit Jupiter Engine/API

###Dependencies can be found in the pom.xml file.



##Task Distribution

###Matthew Johnson = Create Repository.
###Matthew Johnson = Set up .gitignore file.
###Matthew Johnson = Addition and subtraction functions work with quaternary numbers.
###Matthew Johnson = Implement addition and subtraction tests.
###Matthew Johnson = Implement UI number buttons, addition button, and subtraction button functionality.
###Matthew Johnson = Implement toggle button (particularly to work when converting with operations involved).
###Matthew Johnson = Gave description of Meetings and included project screenshots in the Readme file.

###Annie Peabody = Implemented function to convert quaternary to decimal.
###Annie Peabody = Implemented function to convert decimal to quaternary.
###Annie Peabody = Implemented tests to make sure conversion functions worked properly.

###Curtis Clemmons = Implemented the clear button to remove all the user's input.
###Curtis Clemmons = Implemented the toggle button to convert to and from quaternary.

###Ethan Bowers = Set up function to calculate operation functions (primarily focused in decimal).
###Ethan Bowers = Set up multiplication, division, square and square root functions to work with quaternary numbers.
###Ethan Bowers = Implemented quaternary tests to make sure multiplication, division, square, and square root functions work properly.

###Austin Belt = Integrated multiplication, division, square root, and square operation functions with GUI elements
###Austin Belt = Implemented functions to disable and re-enable GUI buttons under certain conditions

###Isaac Pearson = Designed the appearance of the calculator.
###Isaac Pearson = Created the UI.
###Isaac Pearson = Connected FXML label and buttons to the fxController so that the buttons can be made functional.

##Meetings
###Unfortunately due to varying class and work schedules, we were unable to meet for a full team meeting. We also did not meet up with parts of the group.
###While not being able to meet was an inconvenience, we did our best to keep continuous communication via the group chat created for this assignment in Slack. We would inform each other of what we were planning to work on, along with the progress each of us had made as we worked on different parts as to prevent multiple people from working on the same part (unless assistance was needed). 
