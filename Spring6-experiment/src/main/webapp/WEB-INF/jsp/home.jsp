<%--
  Created by IntelliJ IDEA.
  User: czg
  Date: 2024/5/15
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<h1>简易设备资产管理系统</h1>
<p style="color: black;">欢迎[<span>${userName}</span>][<span>${status}]使用设备管理系统</span></p>
<c:if test="${status == '管理员'}">
    <h1>添加设备信息</h1>
    <form action="addEquipment" method="post">
        <label for="name">设备名:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="code">资产编码:</label>
        <input type="text" id="code" name="code" required><br><br>

        <label for="price">价格:</label>
        <input type="number" step="0.01" id="price" name="price" required><br><br>

        <label for="description">描述:</label>
        <textarea id="description" name="description" required></textarea><br><br>

        <label for="userId">领用人:</label>
        <select id="userId" name="userId" required>
            <c:forEach var="user" items="${userList}">
                <option value="${user.id}">${user.userName}</option>
            </c:forEach>
        </select><br><br>

        <label for="place">存放地点:</label>
        <input type="text" id="place" name="place" required><br><br>

        <button type="submit">提交</button>
    </form>
</c:if>
<h1>设备信息列表</h1>
<c:if test="${empty equipmentVos}">
    <p>您目前没有可使用的设备。</p>
</c:if>
<c:if test="${not empty equipmentVos}">
    <table border="1">
        <tr>
            <th>ID</th>
            <th>设备名</th>
            <th>描述</th>
            <th>资产编码</th>
            <th>添加时间</th>
            <th>价格</th>
            <th>存放地点</th>
            <th>领用人姓名</th>
        </tr>
        <c:forEach var="equipment" items="${equipmentVos}">
            <tr>
                <td>${equipment.id}</td>
                <td>${equipment.name}</td>
                <td>${equipment.description}</td>
                <td>${equipment.code}</td>
                <td><fmt:formatDate value="${equipment.addTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                <td>${equipment.price}</td>
                <td>${equipment.place}</td>
                <td>${equipment.userName}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
