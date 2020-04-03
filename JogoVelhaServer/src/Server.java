import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private ServerSocket server;
	
	public void createServerSocket(int port) throws IOException {
		server = new ServerSocket(port);
	}
	
	public Socket awaitConnection() throws IOException {
		return server.accept();
	}
	
	public void closeSocket( Socket socket ) {
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void trataConexao( Socket socket ) {
		
		try {
			// Criando streams de entrada e saida
			
			ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
			
			//Tratando a conversa
			String msg = input.readUTF();
			System.out.println("Mensagem recebida: " + msg);
			output.writeUTF("<html>HELLO WORLD</html>");
		} catch( IOException e) {
			
		} finally {
			closeSocket(socket);
		}
		
	}
}
