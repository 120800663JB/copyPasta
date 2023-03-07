import java.util.Scanner;
import java.io.*;

public class studentResults {
    static Scanner keyboard = new Scanner(System.in);

    static final int STUDENT_NUMBER = 50;

    static String [] forename = new String [STUDENT_NUMBER];
    static String [] surname = new String [STUDENT_NUMBER]; 
    static int [] maths = new int [STUDENT_NUMBER];
    static int [] english = new int [STUDENT_NUMBER];
    static int [] history = new int [STUDENT_NUMBER];
    static int [] science = new int [STUDENT_NUMBER];
    public static void main(String[] args) throws IOException {
        // read from file function
        readFile();

        // calculate total score
        calculateTotal();
    }

    public static void readFile() throws IOException {
        

        String fileName = "studentResults.csv";
      
        Scanner fileScanner = new Scanner (new BufferedReader (new FileReader(fileName)));
      
        fileScanner.useDelimiter("[\\r\\n,]+");

        for(int currentline = 0; currentline < STUDENT_NUMBER; currentline ++) {
            forename[currentline] = fileScanner.next();
            surname[currentline] = fileScanner.next();
            maths[currentline] = fileScanner.nextInt();
            english[currentline] = fileScanner.nextInt();
            history[currentline] = fileScanner.nextInt();
            science[currentline] = fileScanner.nextInt();
        }
    }

    public static void calculateTotal() {
        
    }
}
