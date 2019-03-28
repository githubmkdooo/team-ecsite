<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<script src="./js/neptune.js"></script>
<link rel="stylesheet" type="text/css" href="./css/style.css" >
<link href="https://fonts.googleapis.com/css?family=Roboto:300" rel="stylesheet"/>
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+JP" rel="stylesheet"/>
<link href="https://fonts.googleapis.com/css?family=Codystar" rel="stylesheet"/>
<meta name="description" content="">
<meta name="keywords" content=""/>
<title>neptune | パスワード再設定画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="main">
	  <div id="navigater"><h2>パスワード再設定画面</h2></div>
      <div id="container">

      <!-- ここに担当のページ編集をお願いいたいます。 -->

      <s:if test = "!userIdErrorMessageList.isEmpty()">
      <div class = "error">
      <div class = "error-message">
      	<s:iterator value = "userIdErrorMessageList"><s:property/>
      	<br></s:iterator>
      	</div>
      	</div>
      	</s:if>

      <s:if test = "!passwordErrorMessageList.isEmpty()">
      <div class = "error">
      <div class = "error-message">
      	<s:iterator value = "passwordErrorMessageList"><s:property/>
      	<br></s:iterator>
		</div>
		</div>
		</s:if>
      	<s:if test = "!passwordIncorrectErrorMessageList.isEmpty()">
      	<div class = "error">
      	<div class = "error-message">
      		<s:iterator value  = "passwordIncorrectErrorMessageList"><s:property/>
      		<br></s:iterator>
      		</div>
      		</div>
      		</s:if>

      	<s:if test = "!newPasswordErrorMessageList.isEmpty()">
      	<div class = "error">
      	<div class = "error-message">
      		<s:iterator value = "newPasswordErrorMessageList"><s:property/>
      		<br></s:iterator>
      		</div>
      		</div>
      		</s:if>

      	<s:if test = "!reConfirmationNewPasswordErrorMessageList.isEmpty()">
      	<div class = "error">
      	<div class = "error-message">
      		<s:iterator value = "reConfirmationNewPasswordErrorMessage"><s:property/>
      		<br></s:iterator>
      		</div>
      		</div>
      		</s:if>

      	<s:if test = "!newPasswordIncorrectErrorMessageList.isEmpty()">
      	<div class = "error">
      	<div class =  "error-message">
      		<s:iterator value = "newPasswordIncorrectErrorMessageList"><s:property/>
      		<br></s:iterator>
      		</div>
      		</div>
      		</s:if>

<s:form action = "ResetPasswordConfirmAction">
<!-- ↓何処のテーブル？ -->
	<table class = "vertical-list-table">
	<tr>
		<th scope = "row"><s:label value = "ユーザーID"/></th>
		<td><s:textfield name ="userId" placeholder= "ユーザーID" class = "txt" /></td>
	</tr>

	<tr>
		<th scope = "row"><s:label value = "現在のパスワード"/></th>
		<td><s:password name = "password" placeholder = "現在のパスワード" class = "txt" /></td>
	</tr>

	<tr>
		<th scope = "row"><s:label value = "新しいパスワード"/></th>
		<td><s:password name = "newPassword" placeholder = "新しいパスワード" class = "txt"/></td>
	<tr>
		<th scope = "row"><s:label value = "(再確認用)"></s:label></th>
		<td><s:password name = "reConfirmationPassword" placeholder = "新しいパスワード(再確認用)" class = "txt"/></td>
	</tr>
	</table>
	<s:submit value = "パスワード再設定" class = "submit_btn"/>
	</s:form>
	</div>
<s:include value = "footer.jsp"/>
</div>
</body>
</html>