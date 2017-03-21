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
        <h1>JavaBase Spring Framework</h1>
    </div>

    <div class="main">
        <div class="main--container">
            <div class="fluid-box-left">
                <h2>Introduction</h2>
                <p> SpringFrameworkのサンプルアプリケーション</p>

                <h2>Contents</h2>
                <div class="list">
                <ul>
                    <li>Document
                        <ul>
                            <li>Dependency Injection</li>
                            <li>Aspect Oriented Programming</li>
                            <li>Bean Configration</li>
                            <li>Annotation</li>
                            <li>Java Configration</li>
                            <li>Spring JDBC</li>
                            <li>Spring Data JPA</li>
                            <li>Validator</li>
                        </ul>
                    </li>
                    <li>Tutorial
                        <ul>
                            <li>Spring MVC (xml based)</li>
                            <li>Spring MVC (Java based)</li>
                            <li>Spring AOP</li>
                            <li>Spring JDBC</li>
                            <li>Spring Data JPA</li>
                            <li>Validator</li>
                        </ul>
                    </li>
                </ul>
                </div>

                <h2>Commons</h2>
                <h3>pom.xml</h3>
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

                <%--
                // JDBC 実行メソッド
                <h2>Spring JDBC Sample</h2>
                <a href="/query">JDBC sample request</a>
                <p>
                    ${jdbc}
                </p>
                --%>

                <h2>Spring Data JPA Sample</h2>
                <a href="/jpa">Get Data</a>
                <p>
                    ${jpa}
                </p>

            </div>
            <div class="fluid-box-right">

                <div class="box-title">Management</div>
                <div class="count-container">
                    <table>
                        <tr>
                            <th>Version</th>
                            <td>:</td>
                            <td><a href="https://github.com/web-dmn">GitHub</a></td>
                        </tr>
                        <tr>
                            <th>Build</th>
                            <td>:</td>
                            <td><a href="http://qiita.com/PixModule">Qiita</a></td>
                        </tr>
                        <tr>
                            <th>Build</th>
                            <td>:</td>
                            <td><a href="http://qiita.com/PixModule">Qiita</a></td>
                        </tr>
                    </table>
                </div>
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
