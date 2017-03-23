<%--
  Created by IntelliJ IDEA.
  User: Java
  Date: 2017/03/22
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link href="<c:url value="resources/css/style.css" />" rel="stylesheet">
    <title>Newly Entry Page</title>
</head>
<body>
<div class="wapper">
    <div class="header">
        <h1>Spring Framework</h1>
    </div>

    <div class="main">
        <div class="main--container">
            <div class="fluid-box-left">
                <div class="entry-form">
                    <h2>ユーザ登録</h2>
                    <form:form modelAttribute="entryForm" action="/entry" method="post">
                        <table>
                            <tr>
                                <th><form:label path="name" >名前</form:label></th>
                                <td><form:input path="name" /></td>
                            </tr>
                            <tr>
                                <th><form:label path="kana">カナ</form:label></th>
                                <td><form:input path="kana" /></td>
                            </tr>
                            <tr>
                                <th><form:label path="email">E-MAIL</form:label></th>
                                <td><form:input path="email" /></td>
                            </tr>
                            <tr>
                                <td><form:button name="back">戻る</form:button> </td>
                                <td><form:button name="conf">確認</form:button> </td>
                            </tr>
                        </table>
                    </form:form>
                </div>
            </div>
            <div class="fluid-box-right">

            </div>
        </div>
    </div>

    <div class="footer">
        <div class="footer-menu">
            <p>規約</p>
            <div class="copyright">Copyright © 2017 MYu All Rights Reserved.<br>ver.1.0.0</div>
        </div>
    </div>

</div>
</body>
</html>
