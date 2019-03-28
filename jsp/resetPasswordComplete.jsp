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
<!-- <!-- 3秒後ホーム画面に飛ばす --!> -->
<meta http-equiv="refresh" content="3; URL=http://localhost:8080/neptune/HomeAction">
<link rel="stylesheet" type="text/css" href="./css/style.css" >
<link href="https://fonts.googleapis.com/css?family=Roboto:300" rel="stylesheet"/>
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+JP" rel="stylesheet"/>
<link href="https://fonts.googleapis.com/css?family=Codystar" rel="stylesheet"/>
<meta name="description" content="">
<meta name="keywords" content=""/>
<title>neptune | パスワード再設定完了画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="main">
	  <div id="navigater"><h2>パスワード再設定完了画面</h2></div>
      <div id="container">

<!-- ここに担当のページ編集をお願いいたいます。-->

	パスワード再設定が完了しました。
	</div>


<s:include  value = "footer.jsp"/>
</div>
</body>
</html>