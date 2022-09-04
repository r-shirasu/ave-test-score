import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
    	/* This program assumes that the student has up to 10 test scores,
    	 * thats why I have created the array of size 10. 
    	 */
        int scores[] = new int[10];
        int i;
        float count=0, avg;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter test quiz scores in numbers");
      
        for(i=0; i<10; i++) {
           System.out.print("Enter quiz score of Subject"+(i+1)+":");
           scores[i] = scanner.nextInt();

          // Loop ends when 999 is entered
          if(scores[i] == 999){
            scanner.close();
            break;
          }

          /* If a number other than 0 to 100 is entered,
    	 　　　　　　* prompted to enter the appropriate test score. 
    	 　　　　　　*/ 
          if(!(scores[i]>=0 && scores[i]<=100)){
            System.out.print("Enter a number between 0 and 100 for score");
            i -= 1;
            continue;
          }
          
           count = count + scores[i];
        }
        scanner.close();
      
        //Calculating average here.
        avg = count/i;

      // The letter grade of the average is calculated and output to the console.
        System.out.print("The student average quiz grade is: ");
      
        if(avg>=90 && avg<=100)
        {
            System.out.print("A");
        }
        else if(avg>=80 && avg<=89)
        {
           System.out.print("B");
        } 
        else if(avg>=70 && avg<=79)
        {
            System.out.print("C");
        }
        else if(avg>=60 && avg<=69)
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("F");
        }
    }
}
