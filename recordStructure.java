import java.util.Scanner;
import java.io.*;

class runner {
    int bibNo;
    String name;
    int age;
    int laneNo;
    double time;
}


public class runners {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        // setup runners array
        runner [] runnerDetails = new runner[8];

        // read file
        readFile(runnerDetails);      
    }

    public static void readFile(runner [] runners) throws IOException {
        

        String fileName = "Runners.csv";
        
        Scanner fileScanner = new Scanner (new BufferedReader (new FileReader(fileName)));
        
        fileScanner.useDelimiter("[\\r\\n,]+");

        try{
            fileScanner = new Scanner (new BufferedReader (new FileReader(fileName)));
            fileScanner.useDelimiter("[\\r\\n,]+");
            int currentLine = 0;
            while (fileScanner.hasNext()){
                runners[currentLine] = new runner();
                runners[currentLine].bibNo = fileScanner.nextInt();
                runners[currentLine].name = fileScanner.next();
                runners[currentLine].age = fileScanner.nextInt();
                runners[currentLine].laneNo = fileScanner.nextInt();
                runners[currentLine].time = fileScanner.nextDouble();
                currentLine = currentLine + 1;
            }
        }
        catch (FileNotFoundException error) {
            System.out.println("file not found " + error);
        }

        finally {
            if (fileScanner != null) {
                fileScanner.close();
            }
        }
    }
}
