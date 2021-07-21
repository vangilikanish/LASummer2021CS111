/*
Recitation 14 - Week 8.1 - 7/20:
This is the code that the students came up with during class
The solutions to these questions are located on the slide deck which is accessible through canvas
*/

/*
PROBLEM 1 - Bank Accounts
You are in charge of designing software for a bank, to be used for managing customers' accounts.
You first must create a class that represents an individual bank account. 
What data should your class store? 
What operations should you class offer? Think about what people do with bank accounts.
Now, implement the class in Java with the behavior you outlined above. 
Define fields for each of the pieces of data you decided to store.
Define and implement methods for each of the operations you decided to have your class offer.
Think of sequences of operations that would be good to try to test your methods. Justify your choices. 
Can you think of a sequence of operations that may cause problems with a bank account? In essence, how can we break a bank account?
In another file, create a simple test drive class that creates an instance of your bank account class, executes the sequences you came up with in part 3, and display the results.
*/
//can you unhighlight, I can barely see the code
//try refreshing, that should work



//CODE:


/*
PROBLEM 2 - Elevator
Implement an Elevator class.
The elevator has a fixed number of floors, given as a constructor argument.
The Elevator has a maximum capacity (weight), and should keep track of its current floor.
Add methods to: go up or down by one floor, and add or remove a passenger (with passenger's weight as a parameter).
*/

//CODE:

public class Elevator {

    public int floorMax;
    public int floor = 0;
    public double weightMax;
    public double weight = 0;

    public Elevator(){
        floorMax = 0;
        weightMax = 0;
    }

    public Elevator(int floorMax, double weightMax){
        this.floorMax = floorMax;
        this.weightMax = weightMax;
    }

    public void addPassenger(double passWeight){
        if ((weight+passWeight) >= weightMax){
            StdOut.println("Cannot Enter Elevator!");
        }
        else weight += passWeight;
    }

    public void removePassenger(double passWeight){
        if ((weight-passWeight) <= 0){
            StdOut.println("Cannot Exit Elevator!");
        }
        else weight -= passWeight;
    }

    public void goingUp(){
        if(floor == floorMax){
            StdOut.println("Cannot Go Up!");
        }
        else floor++;
    }

    public void goingDown(){
        if(floor == 0){
            StdOut.println("Cannot Go Down!");
        }
        else floor--;
        
    }
}

public class Elevator{
    private int maxFloor; 
    private int currentFloor = 0; 
    private double maxCapacity;
    private double currentElevatorWeight = 0;
    private boolean inService; // is elevator in service

    public Elevator(int maxFloor, int currentWeight){
        this.maxFloor = maxFloor;
        this.currentElevatorWeight = currentElevatorWeight;
    }
    public void addPassenger(double passengerWeight){
        if (passengerWeight>=maxCapacity){
            StdOut.println("You cannot enter the elevator");
        }
        else
        {
            currentElevatorWeight+=passengerWeight;
        }
    }
    public void removePassenger(double passengerWeight){
        if(currentElevatorWeight-passengerWeight <= 0){
            StdOut.println("You cannot enter the elevator");
        }
    }
    public void goUpLevel(){
        if(currentFloor>maxFloor){
            StdOut.println("Elevator cannot go up, try a different level");
        }
        else{
            currentFloor++;
        }
    }
    public void goDownLevel(){
        if(currentFloor==maxFloor){
            StdOut.println("Elevator cannot go up anymore");
        }
        else{
            currentFloor--;
        }
    }
}
