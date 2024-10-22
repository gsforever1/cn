import java.net.*;
import java.io.*;
public class Client {
 public static void main(String[] args) throws IOException {
 Socket clientSocket = new Socket("localhost", 1234);
 InputStream inputStream = clientSocket.getInputStream();
 DataInputStream dataInputStream = new DataInputStream(inputStream);
 
 String message = dataInputStream.readUTF();
 System.out.println(message);
 
 dataInputStream.close();
 inputStream.close();
 clientSocket.close();
 }}
