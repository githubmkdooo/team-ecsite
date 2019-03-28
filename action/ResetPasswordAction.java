package com.internousdev.neptune.action;
import com.opensymphony.xwork2.ActionSupport;
public class ResetPasswordAction extends ActionSupport{
	private String categoryId;
	public String execute(){
		String result = ERROR;

		result = SUCCESS;
		return result;
	}
	public String getCategoryId(){
		return categoryId;
	}
	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}

}
