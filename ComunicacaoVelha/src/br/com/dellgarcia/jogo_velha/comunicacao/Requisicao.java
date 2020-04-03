package br.com.dellgarcia.jogo_velha.comunicacao;
import java.io.Serializable;

/**
 * 
 */

/**
 * @author FamiliaGarcia
 *
 */
@SuppressWarnings("serial")
public class Requisicao implements Serializable {

	public static final int PLAY_A_GAME = 0;
	public static final int MAKE_A_MOVE = 1;
	
	private int messageType;
	private String position;
	
	
	public int getMessageType() {
		return messageType;
	}
	public void setMessageType(int messageType) {
		this.messageType = messageType;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
}
