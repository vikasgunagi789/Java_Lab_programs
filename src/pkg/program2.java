package pkg; 
 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Comparator; 
import java.util.Random; 
import java.util.Scanner; 
 
public class program2 { 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter lower range: "); 
        int lower = sc.nextInt(); 
 
        System.out.print("Enter upper range: "); 
        int upper = sc.nextInt(); 
 
        System.out.print("How many random numbers to generate? "); 
        int count = sc.nextInt(); 
 
        ArrayList<Integer> list = new ArrayList<>(); 
        Random rand = new Random(); 
 
        // Generate random numbers 
        while (list.size() < count) { 
            int num = rand.nextInt(upper - lower + 1) + lower; 
 
            // Check if multiple of 2 and 5 (i.e., divisible by 10) 
            if (num % 2 == 0 && num % 5 == 0) { 
                list.add(num); 
            } 
        } 
 
        System.out.println("Generated Numbers: " + list); 
 
        // Sorting based on tens place using Comparator 
        Collections.sort(list, new Comparator<Integer>() { 
            @Override 
            public int compare(Integer a, Integer b) { 
                int tensA = (a / 10) % 10; 
                int tensB = (b / 10) % 10; 
                return tensA - tensB; 
            } 
        }); 
 
        System.out.println("Sorted according to Tens Place: " + list); 
 
        sc.close(); 
    } 
} 
