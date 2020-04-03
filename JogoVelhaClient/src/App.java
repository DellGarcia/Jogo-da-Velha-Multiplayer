import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class App {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost", 5555);
		
		ObjectOutputStream obj = new ObjectOutputStream(socket.getOutputStream());
		obj.writeUTF("Hello");
	
		ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
		System.out.println(in.readUTF());
		socket.close();
	}
}
