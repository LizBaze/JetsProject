# JetsProject

### Description
This program presents the user with a menu that allows them to navigate a fleet of aircraft. They may view the jets' information, load cargo jets, send the fighters to battle, commence a spy mission with stealth aircraft, or a take a trip on one of the passenger planes. They may also add or remove jets. The initial set of jets is read from a text file and stored in an ArrayList. User provided jets are added to the ArrayList but are not added to the text file. 

This was completed during week 3 of the Skill Distillery Java Full-Stack bootcamp.

### Lessons Learned
- A constructor can call another method in the same class file without needing an instance to do so (e.g. my AirField constructor calls the addJet() method). This is very useful
- Never code while hungry
- Break big projects into manageable pieces
- Math.max(dataType num1, dataType num2) returns the higher value of two numbers passed as arguments
- Need to flush scanner in the catch block to ensure the user is actually allowed to try again (the first flush never executes since the inputMismatchException causes the program to skip to the catch block)


### Technology Used
- Java
- Git