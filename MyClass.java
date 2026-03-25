package projectdavid;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

///// File reader number program
public class MyClass {

    public static void main(String[] args) throws FileNotFoundException {
    	String fileName = "C:\\Users\\david\\OneDrive\\Documents\\sample.txt";
    	File file = new File(fileName);
    	Scanner input = new Scanner(file);
    	
    	int count = 0;
    	double sum = 0;
    	double largest = Double.NEGATIVE_INFINITY;
    	double smallest = Double.POSITIVE_INFINITY;

    	while (input.hasNext()) {
    		if (input.hasNextDouble()) {
    			double num = input.nextDouble();
    			count++;
    			sum+= num;
    			
    			if (num > largest) {
    				largest = num;
    			}
    			if (num < smallest) {
    				smallest = num;
    			}
    		} else {
    			input.next();
    		}
    	}
    	input.close();
    	
    	double average = (count == 0) ? 0 : sum/count;
    	double range = (count == 0) ? 0 : largest - smallest;
    	
    	System.out.println("Number of numbers: " + count);
    	System.out.println("Average of numbers: " + average);
    	System.out.println("Largest number: " + largest);
    	System.out.println("Smallest number: " + smallest);
    	System.out.println("Range: " + range);

    }
}
