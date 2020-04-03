import java.io.IOException;
import java.net.Socket;

public class App {
	public static void main(String[] args) throws IOException {
		Server server = new Server();
		server.createServerSocket(5555);
		System.out.println("Aguardando conexao...");
		Socket socket = server.awaitConnection();
		server.trataConexao(socket);
	}
}
