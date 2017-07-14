import java.util.*;
public class Main {

    public static void main(String[] args) {
	    // write your code here
	   Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of disks.");
		int numDisks = in.nextInt();

		System.out.println("The moves are:");
		timedSort(numDisks);
	}

	public static void moveDisks(int n, char fromTower, char auxTower, char toTower) {
		if (n == 1) { //(Base Case) if n is equal to the bottom disk then move the disk from A to C
			System.out.println("Disk 1 from " + fromTower + " to " + toTower);//prints the disk moving from the first tower to the last tower
		} else {
			moveDisks(n - 1, fromTower, toTower, auxTower); //if n is not equal to 1 then it moves the disk from the first tower to the last tower and then to the middle tower.
			System.out.println("Disk " + n + " from " + fromTower + " to " + toTower); //prints the disk moving from the first tower to the last tower
			moveDisks(n - 1, auxTower, fromTower, toTower); //moves the disk from the middle tower, then to the first tower, then finally to the last tower.
		}
	}
	public static void timedSort(int n) {
		long startTimer = System.currentTimeMillis(); //Starts the time of the program before the method runs
		moveDisks(n, 'A', 'B', 'C'); //Runs the move disk method
		long endTimer = System.currentTimeMillis(); //Ends the timer after the moveDisks method is done running
		long time = endTimer - startTimer; //subtracts the end time by the start time to find the actual time taken for the method to stop running
		System.out.println("Time taken to execute is " + time + "ms"); //Prints out how long it takes for the program to run in milliseconds
			
		}
	}
    

