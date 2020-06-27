package TreblePojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Favor_Bar_ResponsePOJO {
	
	private int given;
	private int receive;
	
	public int getGiven() {
		return given;
	}
	public void setGiven(int given) {
		this.given = given;
	}
	public int getReceive() {
		return receive;
	}
	public void setReceive(int receive) {
		this.receive = receive;
	}
}
