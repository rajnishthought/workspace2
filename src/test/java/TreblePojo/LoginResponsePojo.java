package TreblePojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginResponsePojo {
	
	private String code;
	private String status;
	private String access_token;
	private int plan_id;
	private String plan_slug;
	private String user_type;
	private int is_synk_contact;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public int getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}
	public String getPlan_slug() {
		return plan_slug;
	}
	public void setPlan_slug(String plan_slug) {
		this.plan_slug = plan_slug;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public int getIs_synk_contact() {
		return is_synk_contact;
	}
	public void setIs_synk_contact(int is_synk_contact) {
		this.is_synk_contact = is_synk_contact;
	}
	
	

}
