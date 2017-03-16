<%--
  Created by IntelliJ IDEA.
  User: Java
  Date: 2017/03/01
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link href="<c:url value="resources/css/style.css" />" rel="stylesheet">
    <title>HOME</title>
</head>
<body>
<div class="wapper">
    <div class="header">
        <h1>JavaBase </h1>
    </div>

    <div class="main">
        <div class="main--container">
            <div class="fluid-box-left">
                <h2>Introduction</h2>
                <p> JavaやSpringFrameworkを中心とした学習時のメモ＆進捗管理を実施。</p>

                <h2>Entity</h2>
                <p>Controller</p>

                <h2>pom.xml</h2>
                <table>
                    <tr>
                        <th>groupId</th>
                        <th>artifactId</th>
                        <th>version</th>
                    </tr>
                </table>

                <h2>Viewさんぷる</h2>
                <p>
                    ${msg}
                </p>

                <h2>Spring JDBC Sample</h2>
                <a href="/query">QueryString</a>
                <p>
                    ${jdbc}
                </p>

                <h2>動的に変わるリクエスト処理</h2>
                <a href="/query/hoge">hogehoge</a>

            </div>
            <div class="fluid-box-right">

                <div class="box-title">PROFILE</div>
                <div class="count-container">
                    <div class="pv-counter"><a href="/cms">time-now</a></div>
                </div>
            </div>
        </div>
    </div>

    <div class="footer">
        <div class="footer-menu">
            <p>規約</p>
            <div class="copyright">Copyright © 2017 pixmodule All Rights Reserved.<br>ver.1.0.0</div>
        </div>
    </div>

</div>

</body>
</html>
