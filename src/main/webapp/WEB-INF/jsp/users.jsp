<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>用户</title>
    <!-- Bootstrap -->
    <link href="<c:url value='/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet" media="screen">
    <%--<link href="<c:url value='/bootstrap/css/bootstrap-responsive.min.css'/>" rel="stylesheet" media="screen">--%>
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
            <a href="<%=request.getContextPath()%>/user/add"><i class="icon-chevron-right"></i> 新增用户</a>
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
        <a href="#myModal" data-toggle="modal"><button class="btn btn-info">新增<i class="icon-edit icon-white"></i></button></a>
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

<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="example">
<thead>
<tr>
    <th>ID</th>
    <th>姓名</th>
    <th>性别</th>
    <th>部门</th>
    <th>职位</th>
    <th style="display: none">微信ID</th>
    <th style="display: none">头像地址</th>
    <th>职级</th>
    <th>手机号码</th>
    <th style="display: none">办公号码</th>
    <th style="display: none">邮箱</th>
    <th>账号</th>
    <th>人员序号</th>
    <th style="display: none">出生年月</th>
    <th>警号</th>
    <th style="display: none">是否关注</th>
    <th>是否禁用</th>
    <th>详细</th>
    <th>更改</th>
    <th>删除</th>
</tr>
</thead>
<tbody>
    <c:forEach var="user" items="${users}">
    <tr class="gradeA">
        <td><c:out value="${user.id}" /></td>
        <td><c:out value="${user.name}" /></td>
        <td><c:out value="${user.gender}"/></td>
        <td><c:out value="${user.department}"/></td>
        <td class="center"><c:out value="${user.position}"/></td>
        <td class="center" style="display: none"><c:out value="${user.weixinId}"/></td>
        <td class="center" style="display: none"><c:out value="${user.avatar}"/></td>
        <td class="center"><c:out value="${user.rank}"/></td>
        <td class="center"><c:out value="${user.mobile}"/></td>
        <td class="center" style="display: none"><c:out value="${user.tel}"/></td>
        <td class="center" style="display: none"><c:out value="${user.email}"/></td>
        <td class="center"><c:out value="${user.account}"/></td>
        <td class="center"><c:out value="${user.personNumbers}"/></td>
        <td class="center" style="display: none"><c:out value="${user.dateofbirth}"/></td>
        <td class="center"><c:out value="${user.policeNumber}"/></td>
        <td class="center" style="display: none"><c:out value="${user.status}"/></td>
        <td class="center"><c:out value="${user.use}"/></td>
        <td><button class="btn btn-mini" onclick="ShowDetail(this)">详细...</button></td>
        <td><button class="btn btn-success btn-mini" onclick="ShowUpdate(this)">更改</button></td>
        <td><button class="btn btn-warning btn-mini" onclick="Delete(this)">删除</button></td>
    </tr>
    </c:forEach>

</tbody>
</table>

<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 id="myModalLabel">详细信息</h3>
    </div>
    <div class="modal-body">
        <form id="form_sample_1" class="form-horizontal">
          <fieldset>
            <div class="alert alert-error hide">
                <button class="close" data-dismiss="alert"></button>
                验证不通过，请检查您的输入是否正确
            </div>
            <div class="alert alert-success hide">
                <button class="close" data-dismiss="alert"></button>
                验证通过
            </div>
            <div class="control-group">
              <label class="control-label">ID</label>
              <div class="controls">
                  <input type="text" name="id" class="span6" disabled />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">姓名<span class="required">*</span></label>
              <div class="controls">
                  <input type="text" name="name" data-required="1" class="span6" />
              </div>
            </div>
            <div class="control-group">
                <label class="control-label">性别<span class="required">*</span></label>
                <div class="controls">
                    <select id="gender" class="span6" name="category">
                        <option>男</option>
                        <option>女</option>
                    </select>
                </div>
            </div>
            <div class="control-group">
              <label class="control-label">微信ID<span class="required">*</span></label>
              <div class="controls">
                  <input type="text" name="weixinId" data-required="1" class="span6"/>
              </div>
            </div>
            <div class="control-group">
                <label class="control-label">手机号码<span class="required">*</span></label>
                <div class="controls">
                    <input name="mobile" type="text" data-required="1" class="span6"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">办公号码</label>
                <div class="controls">
                    <input name="tel" type="text" class="span6"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">邮箱<span class="required">*</span></label>
                <div class="controls">
                    <input name="email" type="text" data-required="1" class="span6"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">账号</label>
                <div class="controls">
                    <input name="account" type="text" class="span6"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">人员序号</label>
                <div class="controls">
                    <input name="personNumbers" type="text" class="span6"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">警号</label>
                <div class="controls">
                    <input name="policeNumber" type="text" class="span6"/>
                </div>
            </div>
            <div class="control-group">
              <label class="control-label">出生年月</label>
              <div class="controls">
                <input type="text" name="dateofbirth" class="input-xlarge span6" value="2014-01-01">
              </div>
            </div>
            <div class="control-group">
                <label class="control-label">职位</label>
                <div class="controls">
                    <select class="span6" id="position">
                        <option>选择...</option>
                        <c:forEach var="position" items="${data.positions}">
                            <option><c:out value="${position.positionName}" /></option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">职级</label>
                <div class="controls">
                    <select class="span6" id="rank">
                        <option>选择...</option>
                        <c:forEach var="rank" items="${data.ranks}">
                            <option><c:out value="${rank.rankName}" /></option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="control-group">
              <label class="control-label">禁用</label>
              <div class="controls">
                <label class="uniform">
                  <input type="checkbox">
                </label>
              </div>
            </div>
            <div class="control-group">
               <label class="control-label">部门</label>
                <div class="controls">
                    <div class="content_wrap">
                    <div class="zTreeDemoBackground">
                        <ul class="list">
                            <input id="citySel" type="text" readonly value="" style="width:120px;" onclick="showMenu();" />
                        </ul>
                    </div>
                    </div>
                    <div id="menuContent" class="menuContent" style="display:none;">
                    <ul id="treeDemo" class="ztree" style="margin-top:0; width:180px; height: 300px;"></ul>
                    </div>
                </div>
            </div>
            <div class="form-actions">
              <button type="submit" class="btn btn-primary">保存</button>
              <button type="reset" class="btn">清空</button>
            </div>
          </fieldset>
        </form>
    </div>
</div>


<div id="myModal_1" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel_1" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 id="myModalLabel_1">详细信息</h3>
    </div>
    <div class="modal-body">
        <div class="form-actions">
            <button type="submit" class="btn btn-primary">保存</button>
        </div>
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

<link href="<c:url value='/vendors/zTree/demo.css' />" rel="stylesheet">
<link href="<c:url value='/vendors/zTree/zTreeStyle.css' />" rel="stylesheet">

<script src="<c:url value='/vendors/jquery-1.9.1.min.js'/>"></script>
<script src="<c:url value='/bootstrap/js/bootstrap.min.js'/>"></script>
<script src="<c:url value='/vendors/datatables/js/jquery.dataTables.min.js'/>"></script>
<script src="<c:url value='/assets/DT_bootstrap.js'/>"></script>
<script src="<c:url value='/assets/scripts.js'/>"></script>

<script src="<c:url value='/vendors/zTree/jquery.ztree.core-3.5.min.js' />"></script>
<script src="<c:url value='/vendors/zTree/jquery.ztree.excheck-3.5.min.js' />"></script>

<script src="<c:url value='/dev/js/users.js'/>"></script>
<script src="<c:url value='/dev/js/json.js'/>"></script></body>

<script type="text/javascript" src="<c:url value="/vendors/jquery-validation/dist/jquery.validate.min.js" />"></script>
<script src="<c:url value="/assets/form-validation-update.js" />"></script>
<script src="<c:url value="/vendors/jquery-validation/localization/messages_zh.js" />"></script>
<script>
    jQuery(document).ready(function() {
	   FormValidation.init();
	});
</script>

<SCRIPT type="text/javascript">
		<!--
        var setting = {
            check: {
				enable: true,
				chkboxType: {"Y":"", "N":""}
			},
            view: {
				dblClickExpand: false
			},
			data: {
				simpleData: {
					enable: true
				}
			},
			callback: {
				beforeClick: beforeClick,
				onCheck: onCheck
			},
			async: {
				enable: true,
				url:"/user/asyncdata",
				autoParam:["id", "name=n", "level=lv"],
				otherParam:{"otherParam":"zTreeAsyncTest"},
				dataFilter: filter
			}
		};

        function filter(treeId, parentNode, childNodes) {
			if (!childNodes) return null;
			for (var i=0, l=childNodes.length; i<l; i++) {
//				childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
                childNodes[i].name = childNodes[i].name;
			}
			return childNodes;
		}

		function beforeClick(treeId, treeNode) {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo");
			zTree.checkNode(treeNode, !treeNode.checked, null, true);
			return false;
		}

		function onCheck(e, treeId, treeNode) {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
			nodes = zTree.getCheckedNodes(true),
			v = "";
			for (var i=0, l=nodes.length; i<l; i++) {
				v += nodes[i].name + ",";
			}
			if (v.length > 0 ) v = v.substring(0, v.length-1);
			var cityObj = $("#citySel");
			cityObj.attr("value", v);
		}

		function showMenu() {
			var cityObj = $("#citySel");
			var cityOffset = $("#citySel").offset();
			$("#menuContent").css({left:cityOffset.left + "px", top:cityOffset.top + cityObj.outerHeight() + "px"}).slideDown("fast");

			$("body").bind("mousedown", onBodyDown);
		}
		function hideMenu() {
			$("#menuContent").fadeOut("fast");
			$("body").unbind("mousedown", onBodyDown);
		}
		function onBodyDown(event) {
			if (!(event.target.id == "menuBtn" || event.target.id == "citySel" || event.target.id == "menuContent" || $(event.target).parents("#menuContent").length>0)) {
				hideMenu();
			}
		}

		$(document).ready(function(){
            $.fn.zTree.init($("#treeDemo"), setting);
		});
		//-->
</SCRIPT>

</html>
