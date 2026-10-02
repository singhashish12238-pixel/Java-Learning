package oops;
import java.io.*;
//File Handling

public class Oops13_file_Handling {
    public static void main(String[] args) throws IOException{
        File file = new File("test.txt");
        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.canRead());

        //Buffer Writer
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter("test.txt"));
            bw.write("Hello World");
            bw.newLine();
            bw.write("I am writing a file .");
            // bw.flush(); for instant writing and not waiting for buffer to fill
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            bw.close();
        }

        //Buffer Reader
        //try with resources automatically closes the resource after use so we don't need to close it in finally block
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            // br = new BufferedReader(new FileReader("user/path/test.txt"));  
            String line;  // for character by character reading we can use int line = br.read(); and then convert it to char using (char)line and it return -1 when it reaches end of file ;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        // finally{
        //     br.close();
        // }
    }
}
