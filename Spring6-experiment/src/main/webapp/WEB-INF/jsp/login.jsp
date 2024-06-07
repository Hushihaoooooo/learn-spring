<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>登陆与注册界面</title>
    <script>
        function showLogin() {
            document.getElementById('loginForm').style.display = 'block';
            document.getElementById('registerForm').style.display = 'none';
        }

        function showRegister() {
            document.getElementById('loginForm').style.display = 'none';
            document.getElementById('registerForm').style.display = 'block';
        }
    </script>
</head>
<body onload="showLogin()">
<h1>简易设备资产管理系统</h1>
<h2>登陆</h2>
<form id="loginForm" action="login" method="post">
    <label for="loginUsername">用户名:</label>
    <input type="text" id="loginUsername" name="userName" required><br><br>
    <label for="loginPassword">密码:</label>
    <input type="password" id="loginPassword" name="password" required><br><br>
    <input type="submit" value="登陆">
    <button type="button" onclick="showRegister()">注册</button>
</form>
<c:if test="${not empty loginErrorMessage}">
    <p style="color: red;">${loginErrorMessage}</p>
</c:if>

<h2>注册</h2>
<form id="registerForm" action="register" method="post" style="display: none;">
    <label for="registerUsername">用户名:</label>
    <input type="text" id="registerUsername" name="userName" required><br><br>

    <label for="registerPassword">密码:</label>
    <input type="password" id="registerPassword" name="password" required><br><br>

    <label for="confirmRegisterPassword">密码确认:</label>
    <input type="password" id="confirmRegisterPassword" name="rePassword" required><br><br>

    <label for="realName">真实姓名:</label>
    <input type="text" id="realName" name="realName" required><br><br>

    <label for="mobile">联系电话:</label>
    <input type="text" id="mobile" name="mobile" required><br><br>

    <label for="email">电子邮箱:</label>
    <input type="text" id="email" name="email" required><br><br>




    <input type="submit" value="注册">
    <button type="button" onclick="showLogin()">返回</button>
</form>
<c:if test="${not empty registerErrorMessage}">
    <p style="color: red;">${registerErrorMessage}</p>
</c:if>
</body>
</html>
