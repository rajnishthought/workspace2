package TreblePojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Privacy_Settings_Response_Pojo {
	
	private int privacy_settings;
	private List<Wish_Org_Id_Response_Pojo> wish_org_id;
	private List<Wish_Tag_Id_Response_Pojo> wish_tag_id;
	private int visibility_setting;
	private int is_connection_request_accepted;
	private int email_notification;
	private int mobile_notification;
	private int reminder_email_send;
	private int reminder_push_alert;
	private int is_email_opt_out;
	private int wish_attachment_send;
	private int is_monthly;
	private int is_weekly;
	
	public int getPrivacy_settings() {
		return privacy_settings;
	}
	public void setPrivacy_settings(int privacy_settings) {
		this.privacy_settings = privacy_settings;
	}
	public List<Wish_Org_Id_Response_Pojo> getWish_org_id() {
		return wish_org_id;
	}
	public void setWish_org_id(List<Wish_Org_Id_Response_Pojo> wish_org_id) {
		this.wish_org_id = wish_org_id;
	}
	public List<Wish_Tag_Id_Response_Pojo> getWish_tag_id() {
		return wish_tag_id;
	}
	public void setWish_tag_id(List<Wish_Tag_Id_Response_Pojo> wish_tag_id) {
		this.wish_tag_id = wish_tag_id;
	}
	public int getVisibility_setting() {
		return visibility_setting;
	}
	public void setVisibility_setting(int visibility_setting) {
		this.visibility_setting = visibility_setting;
	}
	public int getIs_connection_request_accepted() {
		return is_connection_request_accepted;
	}
	public void setIs_connection_request_accepted(int is_connection_request_accepted) {
		this.is_connection_request_accepted = is_connection_request_accepted;
	}
	public int getEmail_notification() {
		return email_notification;
	}
	public void setEmail_notification(int email_notification) {
		this.email_notification = email_notification;
	}
	public int getMobile_notification() {
		return mobile_notification;
	}
	public void setMobile_notification(int mobile_notification) {
		this.mobile_notification = mobile_notification;
	}
	public int getReminder_email_send() {
		return reminder_email_send;
	}
	public void setReminder_email_send(int reminder_email_send) {
		this.reminder_email_send = reminder_email_send;
	}
	public int getReminder_push_alert() {
		return reminder_push_alert;
	}
	public void setReminder_push_alert(int reminder_push_alert) {
		this.reminder_push_alert = reminder_push_alert;
	}
	public int getIs_email_opt_out() {
		return is_email_opt_out;
	}
	public void setIs_email_opt_out(int is_email_opt_out) {
		this.is_email_opt_out = is_email_opt_out;
	}
	public int getWish_attachment_send() {
		return wish_attachment_send;
	}
	public void setWish_attachment_send(int wish_attachment_send) {
		this.wish_attachment_send = wish_attachment_send;
	}
	public int getIs_monthly() {
		return is_monthly;
	}
	public void setIs_monthly(int is_monthly) {
		this.is_monthly = is_monthly;
	}
	public int getIs_weekly() {
		return is_weekly;
	}
	public void setIs_weekly(int is_weekly) {
		this.is_weekly = is_weekly;
	}
	
	
	
	
	

}
