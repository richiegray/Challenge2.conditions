
package challange2;


import java.util.Scanner;
public class Challange2 {

    
    public static void main(String[] args) {
        
        
        System.out.println("Please enter a number greater then 0 and under 101:");

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        
        // if x is odd and between 0 to 101
    if (!(x % 2 == 0) && (x >= 1) && (x <= 100)){
        System.out.println("Not Weird");
        //if x is even and inclusive of the range 2 to 5
    }else if ((x > 1) && (x < 6)){
        System.out.println("Barely Weird");
        //if x is even and inclusive of the range 6 to 20
    }else if ((x % 2 == 0) && (x > 5) && (x < 21)){
        System.out.println("Mildly Weird");
        //if x is even and greater then 20 but under 101
    }else if ((x % 2 == 0) && (x > 20) && (x <= 100)){
        System.out.println("Super Weird");
        //all other numbers outside of the inclusive range of 1 to 100
    }else{
        System.out.println("Astonomically Weird");
    }
  

        
        
    }
    
}
