import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try{
            socket = new Socket("localhost", 1234);
            inputStreamReader = new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            Scanner scanner = new Scanner(System.in);

           while (true) {
            String getMsg = scanner.nextLine();
                bufferedWriter.write (getMsg);
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                bufferedWriter.flush();

                System.out.println("Server: " + bufferedReader.readLine());
                if (getMsg.equalsIgnoreCase("Bye"));
                break;
           }
            
           }
                
            

            catch (IOException e){
                e.printStackTrace();
            } 
            finally{
                if (socket != null)  
            socket.close();
                if (inputStreamReader != null)
                inputStreamReader.close();
                if (outputStreamWriter != null)
                outputStreamWriter.close();
                if (bufferedReader!= null)
                bufferedReader.close();
                
            }

        
    }

 }




