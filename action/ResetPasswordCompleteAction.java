package com.internousdev.neptune.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.neptune.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordCompleteAction extends ActionSupport implements SessionAware{
	private String categoryId;
	private String userId;
	private String password;
	private Map<String, Object> session;


	public String execute(){
		String result = ERROR;
		UserInfoDAO userInfoDAO = new UserInfoDAO();
		int count = userInfoDAO.resetPassword(String.valueOf(session.get("userId")), String.valueOf(session.get("newPassword")));
		if (count > 0){
			result = SUCCESS;
		}else{
			result = ERROR;
		}
		return result;
	}


	public String getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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


	public Map<String, Object> getSession() {
		return session;
	}


	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.session = sessionMap;
	}

}
