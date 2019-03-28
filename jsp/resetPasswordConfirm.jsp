<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<link rel="stylesheet" type="text/css" href="./css/style.css" >
<link href="https://fonts.googleapis.com/css?family=Roboto:300" rel="stylesheet"/>
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+JP" rel="stylesheet"/>
<link href="https://fonts.googleapis.com/css?family=Codystar" rel="stylesheet"/>
<meta name="description" content="">
<meta name="keywords" content=""/>
<title>neptune | パスワード再設定確認画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="main">
	  <div id="navigater"></div>
      <div id="container">

<!-- ここに担当のページ編集をお願いいたいます。 -->

<s:form action ="ResetPasswordCompleteAction">
	<s:property value = "#session.userId"/><br>
	<s:property value = "#session.concealedPassword"/><br>
	<s:submit value = "再設定" class = "submit_btn"/>
</s:form>

<s:form action = "ResetPasswordAction">
	<s:submit value = "戻る" class = "submit_btn"/>
	</s:form>
	</div>
<s:include value = "footer.jsp"/>
</div>
</body>
</html>