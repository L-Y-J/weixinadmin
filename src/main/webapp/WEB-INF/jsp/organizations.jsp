<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>部门管理</title>
    <meta charset="utf-8">
    <!-- Bootstrap -->
    <link href="<c:url value='/bootstrap/css/bootstrap.min.css' />" rel="stylesheet" media="screen">
    <link href="<c:url value='/bootstrap/css/bootstrap-responsive.min.css' />" rel="stylesheet" media="screen">
    <link rel="stylesheet" type="text/css" href="<c:url value='/vendors/tree/my.css' />">
    <link href="<c:url value='/assets/styles.css' />" rel="stylesheet" media="screen">
    <link href="<c:url value='/assets/DT_bootstrap.css' />" rel="stylesheet" media="screen">

    <!--[if lte IE 8]><script language="javascript" type="text/javascript" src="<c:url value='/vendors/flot/excanvas.min.js' />"></script><![endif]-->
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <script src="<c:url value='/vendors/modernizr-2.6.2-respond-1.1.0.min.js' />"></script>
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
                    <a href="/home"><i class="icon-chevron-right"></i> Dashboard</a>
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
                <li>
                    <a href="/users"><i class="icon-chevron-right"></i> 用户</a>
                </li>
                <li>
                    <a href="buttons.html"><i class="icon-chevron-right"></i> Buttons & Icons</a>
                </li>
                <li>
                    <a href="interface.html"><i class="icon-chevron-right"></i> UI & Interface</a>
                </li>
                <li class="active">
                    <a href="/organizations"><span class="badge badge-success pull-right">731</span> 组织</a>
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
                <div class="tree well">
                    <ul>
                        <li>
                            <span><i class="icon-folder-open"></i> Parent</span> <a href="#myModal" data-toggle="modal">添加/删除</a>
                            <ul>
                                <li>
                                    <span><i class="icon-minus-sign"></i> Child</span> <a href="">Goes somewhere</a>
                                    <ul>
                                        <li>
                                            <span><i class="icon-leaf"></i> Grand Child</span> <a href="">Goes somewhere</a>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <span><i class="icon-minus-sign"></i> Child</span> <a href="">Goes somewhere</a>
                                    <ul>
                                        <li>
                                            <span><i class="icon-leaf"></i> Grand Child</span> <a href="">Goes somewhere</a>
                                        </li>
                                        <li>
                                            <span><i class="icon-minus-sign"></i> Grand Child</span> <a href="">Goes somewhere</a>
                                            <ul>
                                                <li>
                                                    <span><i class="icon-minus-sign"></i> Great Grand Child</span> <a href="">Goes somewhere</a>
                                                    <ul>
                                                        <li>
                                                            <span><i class="icon-leaf"></i> Great great Grand Child</span> <a href="">Goes somewhere</a>
                                                        </li>
                                                        <li>
                                                            <span><i class="icon-leaf"></i> Great great Grand Child</span> <a href="">Goes somewhere</a>
                                                        </li>
                                                    </ul>
                                                </li>
                                                <li>
                                                    <span><i class="icon-leaf"></i> Great Grand Child</span> <a href="">Goes somewhere</a>
                                                </li>
                                                <li>
                                                    <span><i class="icon-leaf"></i> Great Grand Child</span> <a href="">Goes somewhere</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li>
                                            <span><i class="icon-leaf"></i> Grand Child</span> <a href="">Goes somewhere</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <span><i class="icon-folder-open"></i> Parent2</span> <a href="">Goes somewhere</a>
                            <ul>
                                <li>
                                    <span><i class="icon-leaf"></i> Child</span> <a href="">Goes somewhere</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <hr>
    <footer>
        <p>&copy; Vincent Gabriel 2013</p>
    </footer>
</div>
<!--/.fluid-container-->

<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 id="myModalLabel">添加/删除分类</h3>
    </div>
    <div class="modal-body">
        <ul class="nav nav-tabs" id="mytab">
            <li><a href="#addtab" data-toggle="tab">添加</a></li>
            <li><a href="#deltab" data-toggle="tab">删除</a></li>
        </ul>
        <div class="tab-content">
            <div class="tab-pane active" id="addtab">
                <div>
                    <label>类别名称</label>
                    <input id="className" type="text" placeholder="请输入新增的类别名称...">
                </div>
                <div>
                    <label class="radio">
                        <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
                        新增同级类别
                    </label>
                    <label class="radio">
                        <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
                        新增子类别
                    </label>
                </div>
            </div>
            <div class="tab-pane" id="deltab">点击确认则删除此类别</div>
        </div>
    </div>
    <div class="modal-footer">
        <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
        <button class="btn btn-primary" onclick="ChangeConfirm()">确认</button>
    </div>
</div>

<script src="<c:url value='/vendors/jquery-1.9.1.js' />"></script>
<script src="<c:url value='/bootstrap/js/bootstrap.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/vendors/tree/my.js' />"></script>

<script src="<c:url value='/assets/scripts.js' />"></script>
<script src="<c:url value='/assets/DT_bootstrap.js' />"></script>
<script src="<c:url value='/dev/js/organization.js' />"></script>
</body>
</html>
