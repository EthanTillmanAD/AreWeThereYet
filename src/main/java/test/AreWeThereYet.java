import java.util.Scanner;
    public class AreWeThereYet {
        public static void main(String[] args) {
            //while vs for loop
            //write a method that keeps scanning or asking a user a question such as are we there yet?
            //when the use says yes..then quit the program
            Scanner scanner = new Scanner(System.in);

            int x = 1;

            while (x > 0) {
                {
                    System.out.println("Are we there yet?");

                    x++;
                }
                String answer = scanner.nextLine();
                if (answer.equals("no")) {
                    //if answer is no ..ask the qwuestion again
                    System.out.println("Answer is : " + answer);  // Output user input
                } if (answer.equals("yes")){

                    //what i want to do if the answer is no
                    System.out.println("Answer is : " + answer);
                    System.out.println("Yes we are there");
                    x = -1;

                } else {
                    System.out.println("can you ask again");

                }

            }


        }
    }



