package oops;
import java.io.*;

class Logger{
    private String path ;
    Logger(String path) throws IOException{
        File file = new File(path);
        if(!file.exists()){
            file.createNewFile();
        }
        this.path = path ;
    }

    public void log(String message){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(this.path,true))){   // in new FileWriter(this.path,true) true is for appending the message to the file instead of overwriting it
            bw.write(message);
            bw.newLine();
        } catch(Exception e ){
            System.out.println("Failed to log this message : " + message);
        }
    }
}

public class Oops14_logger {
    public static void main(String[] args) throws IOException{
        Logger logger = new Logger("log.txt");
        logger.log("This is a log message.");
        logger.log("This is another log message.");
        logger.log("This is an another log message.");
    }
}
