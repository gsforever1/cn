import java.net.*;
import java.io.*;
public class Server {
 public static void main(String[] args) throws IOException {
 ServerSocket serverSocket = new ServerSocket(1234);
 Socket socket = serverSocket.accept();
 OutputStream outputStream = socket.getOutputStream();
 DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
 
 dataOutputStream.writeUTF("Hello client/Vishal!");
 dataOutputStream.close();
 socket.close();
 serverSocket.close();
 }
}
