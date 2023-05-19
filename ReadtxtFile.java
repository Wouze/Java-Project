
package JavaProject;
import java.io.*;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.*;
import java.util.Scanner;

public class ReadtxtFile {

    private Scanner input;
   
   
   
    public void openFile(String fileName){
        try {
            input =new Scanner (new File("Producer.txt"));
           
        } catch (FileNotFoundException fileNotfound){
           System.err.println("You don't Open or Creat the file yet ");
           System.err.println(fileNotfound);
           System.exit(1);  
        }
    }
    
    public void readFile(){
        try {
            while (input.hasNextLine()){
                System.out.println(input.nextLine());
            }
        } catch (NoSuchElementException noSuchElement ){
            System.err.println("File improply formed");
             System.err.println(noSuchElement);
             System.exit(1);
        }
       
       
    }
   
    public void closefile(){
         if(input!=null){
            input.close();
    }
    }}

