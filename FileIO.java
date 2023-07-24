import java.io.*;

public class FileIO {
    public static void main(String[] args) {

        // --- Array to hold employee names
        String[] names = {"Abdi", "Chue", "Halima", "Rosa"};

        // --- Create a try/catch block to catch any IO errors
        try {
            //Create a new BufferWriter to write to the file
            //Name the file output.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            //Write a header to the file
            writer.write("Employee Names:\n");

            //Loop through the array of names and write each one to the file
            for(String name : names){
                writer.write("\n" + name);
            } //end for each loop

            //Close the file
            writer.close();

        } catch (IOException e) {
            //This catch block will catch any exceptions from creating the file
            //If an exception is caught, then print the stack trace.
            e.printStackTrace();
        } //end try catch block

        // -- Declare a try-catch block to catch a exception that is thrown if the file cannot be read.
        try{
            //Create a new BudderedReader to read in the file
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

            //Declare a string variable to hold the value of the current line of the file
            String line;

            //While there is another line in the file, read it and display it to the user
            while((line = reader.readLine()) !=null){
                System.out.println(line);
            }
            //Close the file
            reader.close();
        } catch (IOException e) {
            //This catch block will catch any exceptions
            //If an exception is caught, print the stack trace.
            e.printStackTrace();
        } //end try-catch


        // -- Array to hold classmates names
        String[] classnames = {"Liiban", "Anderson", "Xavier", "Lohnel"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("classmates.txt"));
            writer.write("\nClassmates Names: \n");

            for(String classmate : classnames) {
                writer.write("\n" + classmate);
            } //end loop

            writer.close();
        } catch (IOException s) {
            s.printStackTrace();
        } //end try-catch

        try{
            BufferedReader reader = new BufferedReader(new FileReader("classmates.txt"));
            String line2;
            while((line2 = reader.readLine()) !=null){
                System.out.println(line2);
            }
            reader.close();
        } catch (IOException s) {
            s.printStackTrace();
        } //end try-catch


    } //end main
} //end class
