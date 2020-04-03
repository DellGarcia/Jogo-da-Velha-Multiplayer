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
public class Resposta implements Serializable {
	
	public static final int GAME_FOUND 		= 0;
	public static final int GAME_NOT_FOUND 	= 1;
	public static final int VALID_MOVE 		= 2;
	public static final int INVALID_MOVE	= 3;
	public static final int END_OF_GAME		= 4;
	
	
	private int 	responseCode;
	private String 	responseContent;
	
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	
	public String getResponseContent() {
		return responseContent;
	}
	public void setResponseContent(String responseContent) {
		this.responseContent = responseContent;
	}
	
	
	
}
