<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <title>用户</title>
    <!-- Bootstrap -->
    <link href="<c:url value='/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet" media="screen">
    <link href="<c:url value='/bootstrap/css/bootstrap-responsive.min.css'/>" rel="stylesheet" media="screen">
    <link href="<c:url value='/assets/styles.css'/>" rel="stylesheet" media="screen">
    <link href="<c:url value='/assets/DT_bootstrap.css'/>" rel="stylesheet" media="screen">
    <!--[if lte IE 8]><script language="javascript" type="text/javascript" src="<c:url value='/vendors/flot/excanvas.min.js'/>"></script><![endif]-->
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <script src="<c:url value='/vendors/modernizr-2.6.2-respond-1.1.0.min.js'/>"></script>
</head>

<body>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <a class="brand" href="#">Admin Panel</a>
            <div class="nav-collapse collapse">
                <ul class="nav pull-right">
                    <li class="dropdown">
                        <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown"> <i class="icon-user"></i> Vincent Gabriel <i class="caret"></i>

                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <a tabindex="-1" href="#">Profile</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a tabindex="-1" href="login.html">Logout</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav">
                    <li class="active">
                        <a href="#">Dashboard</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" data-toggle="dropdown" class="dropdown-toggle">Settings <b class="caret"></b>

                        </a>
                        <ul class="dropdown-menu" id="menu1">
                            <li>
                                <a href="#">Tools <i class="icon-arrow-right"></i>

                                </a>
                                <ul class="dropdown-menu sub-menu">
                                    <li>
                                        <a href="#">Reports</a>
                                    </li>
                                    <li>
                                        <a href="#">Logs</a>
                                    </li>
                                    <li>
                                        <a href="#">Errors</a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="#">SEO Settings</a>
                            </li>
                            <li>
                                <a href="#">Other Link</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">Other Link</a>
                            </li>
                            <li>
                                <a href="#">Other Link</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">Content <i class="caret"></i>

                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <a tabindex="-1" href="#">Blog</a>
                            </li>
                            <li>
                                <a tabindex="-1" href="#">News</a>
                            </li>
                            <li>
                                <a tabindex="-1" href="#">Custom Pages</a>
                            </li>
                            <li>
                                <a tabindex="-1" href="#">Calendar</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a tabindex="-1" href="#">FAQ</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">Users <i class="caret"></i>

                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <a tabindex="-1" href="#">User List</a>
                            </li>
                            <li>
                                <a tabindex="-1" href="#">Search</a>
                            </li>
                            <li>
                                <a tabindex="-1" href="#">Permissions</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!--/.nav-collapse -->
        </div>
    </div>
</div>
<div class="container-fluid">
<div class="row-fluid">
<div class="span3" id="sidebar">
    <ul class="nav nav-list bs-docs-sidenav nav-collapse collapse">
        <li>
            <a href="<%=request.getContextPath()%>/home"><i class="icon-chevron-right"></i> Dashboard</a>
        </li>
        <li>
            <a href="calendar.html"><i class="icon-chevron-right"></i> Calendar</a>
        </li>
        <li>
            <a href="stats.html"><i class="icon-chevron-right"></i> Statistics (Charts)</a>
        </li>
        <li>
            <a href="form.html"><i class="icon-chevron-right"></i> Forms</a>
        </li>
        <li class="active">
            <a href="<%=request.getContextPath()%>/user"><i class="icon-chevron-right"></i> 用户</a>
        </li>
        <li>
            <a href="buttons.html"><i class="icon-chevron-right"></i> Buttons & Icons</a>
        </li>
        <li>
            <a href="interface.html"><i class="icon-chevron-right"></i> UI & Interface</a>
        </li>
        <li>
            <a href="<%=request.getContextPath()%>/organizations"><span class="badge badge-success pull-right">731</span> 组织</a>
        </li>
        <li>
            <a href="#"><span class="badge badge-success pull-right">812</span> Invoices</a>
        </li>
        <li>
            <a href="#"><span class="badge badge-info pull-right">27</span> Clients</a>
        </li>
        <li>
            <a href="#"><span class="badge badge-info pull-right">1,234</span> Users</a>
        </li>
        <li>
            <a href="#"><span class="badge badge-info pull-right">2,221</span> Messages</a>
        </li>
        <li>
            <a href="#"><span class="badge badge-info pull-right">11</span> Reports</a>
        </li>
        <li>
            <a href="#"><span class="badge badge-important pull-right">83</span> Errors</a>
        </li>
        <li>
            <a href="#"><span class="badge badge-warning pull-right">4,231</span> Logs</a>
        </li>
    </ul>
</div>
<!--/span-->
<div class="span9" id="content">

<div class="row-fluid">
<!-- block -->
<div class="block">
<div class="navbar navbar-inner block-header">
    <div class="muted pull-left">用户列表</div>
</div>
<div class="block-content collapse in">
<div class="span12">
<div class="table-toolbar">
    <div class="btn-group">
        <a href="#myModal" data-toggle="modal"><button class="btn btn-success">操作 <i class="icon-edit icon-white"></i></button></a>
    </div>
    <div class="btn-group pull-right">
        <button data-toggle="dropdown" class="btn dropdown-toggle">Tools <span class="caret"></span></button>
        <ul class="dropdown-menu">
            <li><a href="#">打印</a></li>
            <li><a href="#">导出PDF</a></li>
            <li><a href="#">导出Excel</a></li>
        </ul>
    </div>
</div>

<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="example2">
<thead>
<tr>
    <th>ID</th>
    <th>姓名</th>
    <th>性别</th>
    <th>部门ID</th>
    <th>职位ID</th>
    <th>手机号码</th>
    <th>办公号码</th>
    <th>邮箱</th>
    <th>微信ID</th>
    <th>是否禁用</th>
</tr>
</thead>
<tbody>
    <c:forEach var="user" items="${users}">
    <tr class="gradeA">
        <td><c:out value="${user.id}" /></td>
        <td><c:out value="${user.name}" /></td>
        <td><c:out value="${user.gender}"/></td>
        <td><c:out value="${user.departmentId}"/></td>
        <td class="center"><c:out value="${user.positionId}"/></td>
        <td class="center"><c:out value="${user.mobile}"/></td>
        <td class="center"><c:out value="${user.tel}"/></td>
        <td class="center"><c:out value="${user.email}"/></td>
        <td class="center"><c:out value="${user.weixinId}"/></td>
        <td class="center"><c:out value="${user.enable}"/></td>
    </tr>
    </c:forEach>

</tbody>
</table>

<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 id="myModalLabel">添加/更新/删除人员</h3>
    </div>
    <div class="modal-body">
        <ul class="nav nav-tabs" id="mytab">
            <li><a href="#addtab" data-toggle="tab" id="add">添加</a></li>
            <li><a href="#updatetab" data-toggle="tab" id="update">更改</a></li>
            <li><a href="#deltab" data-toggle="tab" id="delete">删除</a></li>
        </ul>
        <div class="tab-content">
            <div class="tab-pane active" id="addtab">
                <div>
                    <label>姓名</label>
                    <input id="name" type="text" placeholder="请输入人员姓名...">
                </div>
                <div>
                    <label>性别</label>
                    <input id="gender" type="text" placeholder="男/女">
                </div>
                <div>
                    <label>部门</label>
                    <input id="department" type="text" placeholder="请输入部门名称...">
                </div>
                <div>
                    <label>职位</label>
                    <input id="position" type="text" placeholder="请输入职位名称...">
                </div>
                <div>
                    <label>手机号码</label>
                    <input id="mobile" type="text" placeholder="请输入手机号码...">
                </div>
                <div>
                    <label>办公号码</label>
                    <input id="tel" type="text" placeholder="请输入办公号码...">
                </div>
                <div>
                    <label>邮箱</label>
                    <input id="email" type="text" placeholder="请输入邮箱地址...">
                </div>
                <div>
                    <label>禁用</label>
                    <input id="use" type="number" placeholder="禁用为1，不禁用为0">
                </div>
            </div>
            <div class="tab-pane active" id="updatetab">
                <div>
                    <label>姓名</label>
                    <input id="name1" type="text" placeholder="请输入人员姓名...">
                </div>
                <div>
                    <label>性别</label>
                    <input id="gender1" type="text" placeholder="男/女">
                </div>
                <div>
                    <label>部门</label>
                    <input id="department1" type="text" placeholder="请输入部门名称...">
                </div>
                <div>
                    <label>职位</label>
                    <input id="position1" type="text" placeholder="请输入职位名称...">
                </div>
                <div>
                    <label>手机号码</label>
                    <input id="mobile1" type="tel" placeholder="请输入手机号码...">
                </div>
                <div>
                    <label>办公号码</label>
                    <input id="tel1" type="tel" placeholder="请输入办公号码...">
                </div>
                <div>
                    <label>邮箱</label>
                    <input id="email1" type="email" placeholder="请输入邮箱地址...">
                </div>
                <div>
                    <label>禁用</label>
                    <input id="use1" type="number" placeholder="禁用为1，不禁用为0">
                </div>
            </div>
            <div class="tab-pane" id="deltab">点击确认则删除选中的人员</div>
        </div>
    </div>
    <div class="modal-footer">
        <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
        <button class="btn btn-primary" id="confirm">确认</button>
    </div>
</div>

</div>
</div>
</div>
<!-- /block -->
</div>
</div>
</div>
<hr>
<footer>
    <p>&copy; chenghang 2014</p>
</footer>
</div>
<!--/.fluid-container-->

<basePath value = "<%=request.getContextPath()%>" id = "basePath"></basePath>

<script src="<c:url value='/vendors/jquery-1.9.1.js'/>"></script>
<script src="<c:url value='/bootstrap/js/bootstrap.min.js'/>"></script>
<script src="<c:url value='/vendors/datatables/js/jquery.dataTables.min.js'/>"></script>
<script src="<c:url value='/dev/js/users.js'/>"></script>

<script src="<c:url value='/assets/scripts.js'/>"></script>
<script src="<c:url value='/assets/DT_bootstrap.js'/>"></script>
</body>

</html>
