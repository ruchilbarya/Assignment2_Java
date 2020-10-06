package lecture5;

public class practice {

	public static void main(String[] args) {
		int grade3 = 72;
		int grade4 = 63;
		float grade1 = 91.14f;
		float grade2 = 85.01f;
		float grade5 = 81.14f;
		float average;
		average = (grade1 + grade2 +grade3 +grade4 +grade5)/5 ;
		System.out.println("The average of grades is "+ average);
		float x = average;
        if (x <= 100 && x >= 90) { 
			  System.out.print("A: Fantastic job!");
        }
        else if (x <= 89.99 && x >= 80) {
				  System.out.print("B: Good");	
		}
        else if (x <= 79.99 && x >= 70 ) {
				  System.out.print("C: Please try more next time!");
        }
        else if (x <= 69.99 ) {
				  System.out.print("“F: Unfortunately you failed!");			
		}
        else {
			  System.out.print("You dont have a grade");			
	}
           }
			 
		}




//If the final average grade is more than 90.00 and less than 100 it prints “A: Fantastic job!”
//If it is between 80 to 89.99, it prints: “B: Good!”
//If it is between 70 to 79.99, it prints “C: Please try more next time!”
//If it is 69.99 or less, it prints “F: Unfortunately you failed!
