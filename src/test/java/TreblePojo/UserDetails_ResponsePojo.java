package TreblePojo;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDetails_ResponsePojo {
	
	private int user_id;
	private String email;
	private String first_name;
	private String last_name;
	private String nickname;
	private String phone;
	private String country_code;
	private String profile_image;
	private String profile_thumb_image;
	private String job_title;
	private String company_name;
	private String organization;
	private int organization_id;
	private String background;
	private String how_to_help_other;
	private int industry_category_id;
	private String industry_category;
	private int industry_sub_category_id;
	private String industry_sub_category;
	private int country_id;
	private String country;
	private int state_id;
	private String state;
	private int city_id;
	private String city;
	private String zipcode;
	private String subscription_plan;
	private String subsciption_date;
	private int treble_points;
	private int network_points;
	private int wish_points_remain;
	private int number_of_wishes_remain;
	private int visibility_setting;
	private int wish_tutorial_read;
	private int referral_tutorial_read;
	private int feedback_count;
	private String linkedin_sample_csv_url;
	private int is_password_set;
	private int wish_group_tutorial_read;
	private String wish_toggle;
	private String created_on;
	
	// Below are the nested JSON
	private List <Education_ResponsePOJO> education;
	private List <Interested_Industries_ResponsePOJO> interested_industries;
	private List <Interested_Organizations_ResponsePOJO> interested_organizations;
	private List <Geographies_Response_POJO> geographies;
	
	private Favor_Bar_ResponsePOJO favor_bar;
	private Privacy_Settings_Response_Pojo privacy_settings;
	private Latest_Purchase_Details_Response_Pojo latest_purchase_details;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getProfile_image() {
		return profile_image;
	}

	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}

	public String getProfile_thumb_image() {
		return profile_thumb_image;
	}

	public void setProfile_thumb_image(String profile_thumb_image) {
		this.profile_thumb_image = profile_thumb_image;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public int getOrganization_id() {
		return organization_id;
	}

	public void setOrganization_id(int organization_id) {
		this.organization_id = organization_id;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getHow_to_help_other() {
		return how_to_help_other;
	}

	public void setHow_to_help_other(String how_to_help_other) {
		this.how_to_help_other = how_to_help_other;
	}

	public int getIndustry_category_id() {
		return industry_category_id;
	}

	public void setIndustry_category_id(int industry_category_id) {
		this.industry_category_id = industry_category_id;
	}

	public String getIndustry_category() {
		return industry_category;
	}

	public void setIndustry_category(String industry_category) {
		this.industry_category = industry_category;
	}

	public int getIndustry_sub_category_id() {
		return industry_sub_category_id;
	}

	public void setIndustry_sub_category_id(int industry_sub_category_id) {
		this.industry_sub_category_id = industry_sub_category_id;
	}

	public String getIndustry_sub_category() {
		return industry_sub_category;
	}

	public void setIndustry_sub_category(String industry_sub_category) {
		this.industry_sub_category = industry_sub_category;
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getState_id() {
		return state_id;
	}

	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getSubscription_plan() {
		return subscription_plan;
	}

	public void setSubscription_plan(String subscription_plan) {
		this.subscription_plan = subscription_plan;
	}

	public String getSubsciption_date() {
		return subsciption_date;
	}

	public void setSubsciption_date(String subsciption_date) {
		this.subsciption_date = subsciption_date;
	}

	public int getTreble_points() {
		return treble_points;
	}

	public void setTreble_points(int treble_points) {
		this.treble_points = treble_points;
	}

	public int getNetwork_points() {
		return network_points;
	}

	public void setNetwork_points(int network_points) {
		this.network_points = network_points;
	}

	public int getWish_points_remain() {
		return wish_points_remain;
	}

	public void setWish_points_remain(int wish_points_remain) {
		this.wish_points_remain = wish_points_remain;
	}

	public int getNumber_of_wishes_remain() {
		return number_of_wishes_remain;
	}

	public void setNumber_of_wishes_remain(int number_of_wishes_remain) {
		this.number_of_wishes_remain = number_of_wishes_remain;
	}

	public int getVisibility_setting() {
		return visibility_setting;
	}

	public void setVisibility_setting(int visibility_setting) {
		this.visibility_setting = visibility_setting;
	}

	public int getWish_tutorial_read() {
		return wish_tutorial_read;
	}

	public void setWish_tutorial_read(int wish_tutorial_read) {
		this.wish_tutorial_read = wish_tutorial_read;
	}

	public int getReferral_tutorial_read() {
		return referral_tutorial_read;
	}

	public void setReferral_tutorial_read(int referral_tutorial_read) {
		this.referral_tutorial_read = referral_tutorial_read;
	}

	public int getFeedback_count() {
		return feedback_count;
	}

	public void setFeedback_count(int feedback_count) {
		this.feedback_count = feedback_count;
	}

	public String getLinkedin_sample_csv_url() {
		return linkedin_sample_csv_url;
	}

	public void setLinkedin_sample_csv_url(String linkedin_sample_csv_url) {
		this.linkedin_sample_csv_url = linkedin_sample_csv_url;
	}

	public int getIs_password_set() {
		return is_password_set;
	}

	public void setIs_password_set(int is_password_set) {
		this.is_password_set = is_password_set;
	}

	public int getWish_group_tutorial_read() {
		return wish_group_tutorial_read;
	}

	public void setWish_group_tutorial_read(int wish_group_tutorial_read) {
		this.wish_group_tutorial_read = wish_group_tutorial_read;
	}

	public String getWish_toggle() {
		return wish_toggle;
	}

	public void setWish_toggle(String wish_toggle) {
		this.wish_toggle = wish_toggle;
	}

	public String getCreated_on() {
		return created_on;
	}

	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}

	public List<Education_ResponsePOJO> getEducation() {
		return education;
	}

	public void setEducation(List<Education_ResponsePOJO> education) {
		this.education = education;
	}

	public List<Interested_Industries_ResponsePOJO> getInterested_industries() {
		return interested_industries;
	}

	public void setInterested_industries(List<Interested_Industries_ResponsePOJO> interested_industries) {
		this.interested_industries = interested_industries;
	}

	public List<Interested_Organizations_ResponsePOJO> getInterested_organizations() {
		return interested_organizations;
	}

	public void setInterested_organizations(List<Interested_Organizations_ResponsePOJO> interested_organizations) {
		this.interested_organizations = interested_organizations;
	}

	public List<Geographies_Response_POJO> getGeographies() {
		return geographies;
	}

	public void setGeographies(List<Geographies_Response_POJO> geographies) {
		this.geographies = geographies;
	}

	public Favor_Bar_ResponsePOJO getFavor_bar() {
		return favor_bar;
	}

	public void setFavor_bar(Favor_Bar_ResponsePOJO favor_bar) {
		this.favor_bar = favor_bar;
	}

	public Latest_Purchase_Details_Response_Pojo getLatest_purchase_details() {
		return latest_purchase_details;
	}

	public void setLatest_purchase_details(Latest_Purchase_Details_Response_Pojo latest_purchase_details) {
		this.latest_purchase_details = latest_purchase_details;
	}

	public Privacy_Settings_Response_Pojo getPrivacy_settings() {
		return privacy_settings;
	}

	public void setPrivacy_settings(Privacy_Settings_Response_Pojo privacy_settings) {
		this.privacy_settings = privacy_settings;
	}

}
