package TreblePojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetMyProfile_Response_Pojo {
	
	private int code;
	private String status;
	private UserDetails_ResponsePojo user_details;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public UserDetails_ResponsePojo getUser_details() {
		return user_details;
	}
	public void setUser_details(UserDetails_ResponsePojo user_details) {
		this.user_details = user_details;
	}
	

}
