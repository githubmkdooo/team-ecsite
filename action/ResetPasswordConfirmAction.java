package com.internousdev.neptune.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.neptune.dao.UserInfoDAO;
import com.internousdev.neptune.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordConfirmAction extends ActionSupport implements SessionAware{
	private String userId;
	private String password;
	private String newPassword;
	private String reConfirmationPassword;
	private Map<String, Object> session;

	private List<String> userIdErrorMessageList = new ArrayList<String>();
	private List<String> passwordErrorMessageList = new ArrayList<String>();
	private List<String> passwordIncorrectErrorMessageList = new ArrayList<String>();
	private List<String> newPasswordErrorMessageList = new ArrayList<String>();
	private List<String> reConfirmationNewPasswordErrorMessageList = new ArrayList<String>();
	private List<String> newPasswordIncorrectErrorMessageList = new ArrayList<String>();


	public String execute(){
	String result = ERROR;
	InputChecker inputChecker = new InputChecker();
	userIdErrorMessageList = inputChecker.doCheck("ユーザーID", userId, 1, 8,
			true, false, false, true, false, false, false);
	passwordErrorMessageList = inputChecker.doCheck("現在のパスワード", password, 1, 16,
			true, false, false, true, false, false, false);
	newPasswordErrorMessageList = inputChecker.doCheck("新しいパスワード", newPassword, 1, 16,
			true,false,false,true,false,false,false);
	reConfirmationNewPasswordErrorMessageList = inputChecker.doCheck("新しいパスワード(再確認)",getReConfirmationPassword(),
			1,16,true,false,false,true,false,false,false);

	if(!(newPassword.contains(getReConfirmationPassword()))){
		newPasswordIncorrectErrorMessageList.add("新しいパスワードと新しいパスワード(再確認)が一致しません。");
	}
	if((userIdErrorMessageList.size() == 0 || userIdErrorMessageList == null)
	&& (passwordErrorMessageList.size() == 0  || passwordErrorMessageList == null)
	&& (newPasswordErrorMessageList.size() == 0 || newPasswordErrorMessageList == null)
	&& (reConfirmationNewPasswordErrorMessageList.size() == 0 || reConfirmationNewPasswordErrorMessageList == null)
	&& (newPasswordIncorrectErrorMessageList.size() == 0 || newPasswordIncorrectErrorMessageList == null)) {
			UserInfoDAO userInfoDAO = new UserInfoDAO();
			if(userInfoDAO.isExistsUserInfo(userId, password)){
				String concealedPassword = userInfoDAO.concealPassword(newPassword);
				session.put("userId", userId);
				session.put("newPassword", newPassword);
				session.put("concealedPassword", concealedPassword);

				result = SUCCESS;
			}else{
				 passwordIncorrectErrorMessageList.add("ユーザIDまたはパスワードが異なります。");
			}
		}
		return result;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNewPassword() {
		return newPassword;
	}


	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}


	public String getReConfirmationPassword() {
		return reConfirmationPassword;
	}


	public void setReConfirmationPassword(String reConfirmationPassword) {
		this.reConfirmationPassword = reConfirmationPassword;
	}


	public List<String> getUserIdErrorMessageList() {
		return userIdErrorMessageList;
	}

	public void setUserIdErrorMessageList(List<String>userIdErrorMessageList) {
		this.userIdErrorMessageList= userIdErrorMessageList;
	}

	public List<String> getPasswordErrorMessageList() {
		return passwordErrorMessageList;
	}

	public void setPasswordErrorMessageList(List<String> passwordErrorMessageList) {
		this.passwordErrorMessageList = passwordErrorMessageList;
	}

	public List<String> getPasswordIncorrectErrorMessageList() {
		return passwordIncorrectErrorMessageList;
	}

	public void setPasswordIncorrectErrorMessageList(List<String> passwordIncorrectErrorMessageList) {
		this.passwordIncorrectErrorMessageList = passwordIncorrectErrorMessageList;
	}

	public List<String> getNewPasswordErrorMessageList() {
		return newPasswordErrorMessageList;
	}

	public void setNewPasswordErrorMessageList(List<String> newPasswordErrorMessageList) {
		this.newPasswordErrorMessageList = newPasswordErrorMessageList;
	}

	public List<String> getReConfirmationNewPasswordErrorMessageList() {
		return reConfirmationNewPasswordErrorMessageList;
	}

	public void setReConfirmationNewPasswordErrorMessageList(List<String> reConfirmationNewPasswordErrorMessageList) {
		this.reConfirmationNewPasswordErrorMessageList = reConfirmationNewPasswordErrorMessageList;
	}

	public List<String> getNewPasswordIncorrectErrorMessageList() {
		return newPasswordIncorrectErrorMessageList;
	}

	public void setNewPasswordIncorrectErrorMessageList(List<String> newPasswordIncorrectErrorMessageList) {
		this.newPasswordIncorrectErrorMessageList = newPasswordIncorrectErrorMessageList;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String, Object> sessionMap){
		this.session = sessionMap;
	}

}
