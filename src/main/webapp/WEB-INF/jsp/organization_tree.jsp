<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach var="menu" items="${menu.childList}">
    <li>
        <span>
            <c:if test="${menu.current.parentId==null}" >
                <c:set var="attr" value="icon-folder-open" scope="request" />
            </c:if>
            <c:if test="${menu.current.parentId!=null}" >
                <c:set var="attr" value="icon-minus-sign" scope="request" />
            </c:if>
            <c:if test="${empty menu.childList}" >
                <c:set var="attr" value="icon-leaf" scope="request" />
            </c:if>
            <i class="<c:out value="${attr}" default="icon-leaf" />"></i>
            <c:out value="${menu.current.organizationName}"></c:out>
        </span>
        <a href="#myModal" data-toggle="modal">添加/删除</a>
        <ul>
        <c:set var="menu" value="${menu}" scope="request"></c:set>
        <c:import url="organization_tree.jsp"></c:import>
        </ul>
    </li>
</c:forEach>