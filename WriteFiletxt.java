
package JavaProject;
  
import java.io.*;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.*;
public class WriteFiletxt {
    
    private Formatter Output;
   
    public void openFile(String fileName){
        try {
            Output=new Formatter(fileName);
           
        }
        catch (SecurityException Security ){
            System.err.println("You don't have acsess to the file yet ");
            System.exit(1);
        }/// End of First catch
        catch (FileNotFoundException fileNotfound){
           System.err.println("You don't Open or Creat the file yet ");
           System.err.println(fileNotfound);
           System.exit(1);  
        }/// End of Second catch
    }
    
    public void writeFile(Producer p){
        try{
            Output.format(p.toString()+"/n");
           
        }
        catch (FormatterClosedException formatterClosed ){
              System.err.println("Invalid writing to the File ");
           System.err.println(formatterClosed);
           System.exit(1);
        }
    }
    
    public void closeFile(){
        if(Output!=null){
            Output.close();
        }
    }
}
