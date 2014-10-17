<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>新增用户</title>
    <!-- Bootstrap -->
    <link href="<c:url value='/bootstrap/css/bootstrap.min.css' />" rel="stylesheet" media="screen">
    <link href="<c:url value='/assets/styles.css' />" rel="stylesheet" media="screen">
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
        <li>
            <a href="<%=request.getContextPath()%>/user"><i class="icon-chevron-right"></i> 用户</a>
        </li>
        <li class="active">
            <a href="<%=request.getContextPath()%>/user/add"><i class="icon-chevron-right"></i> 新增用户</a>
        </li>
        <li>
            <a href="editors.html"><i class="icon-chevron-right"></i> WYSIWYG Editors</a>
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
        <div class="muted pull-left">新增用户</div>
    </div>
    <div class="block-content collapse in">
        <div class="span12">
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
                  <label class="control-label">姓名<span class="required">*</span></label>
                  <div class="controls">
                      <input type="text" name="name" data-required="1" class="span6"/>
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
                    <input type="text" name="dateofbirth" class="input-xlarge datepicker span6" value="2014-01-01">
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
                  <label class="control-label" for="optionsCheckbox">禁用</label>
                  <div class="controls">
                    <label class="uniform">
                      <input class="uniform_on" type="checkbox" id="optionsCheckbox" value="option1">
                    </label>
                  </div>
                </div>
                <div class="control-group">
                   <label class="control-label">部门</label>
                    <div class="controls">
                        <div class="content_wrap">
	                    <div class="zTreeDemoBackground">
		                    <ul class="list">
			                    <input id="citySel" name="department" type="text" readonly value="" style="width:120px;" onclick="showMenu();" />
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
                  <button type="reset" class="btn">取消</button>
                </div>
              </fieldset>
            </form>

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

<basePath value = "<%=request.getContextPath()%>" id = "basePath"></basePath>

<link href="<c:url value="/vendors/datepicker.css" />" rel="stylesheet" media="screen">
<link href="<c:url value="/vendors/uniform.default.css" />" rel="stylesheet" media="screen">
<%--<link href="<c:url value="/vendors/chosen.min.css" />" rel="stylesheet" media="screen">--%>

<link href="<c:url value='/vendors/zTree/demo.css' />" rel="stylesheet">
<link href="<c:url value='/vendors/zTree/zTreeStyle.css' />" rel="stylesheet">

<!--/.fluid-container-->
<script src="<c:url value='/vendors/jquery-1.9.1.min.js' />"></script>
<script src="<c:url value='/bootstrap/js/bootstrap.min.js' />"></script>
<script src="<c:url value='/assets/scripts.js' />"></script>
<script src="<c:url value="/vendors/jquery.uniform.min.js" />"></script>
<%--<script src="<c:url value="/vendors/chosen.jquery.min.js" />"></script>--%>
<script src="<c:url value="/vendors/bootstrap-datepicker.js" />"></script>
<script type="text/javascript" src="<c:url value="/vendors/jquery-validation/dist/jquery.validate.min.js" />"></script>
<script src="<c:url value="/assets/form-validation.js" />"></script>
<script src="<c:url value="/vendors/jquery-validation/localization/messages_zh.js" />"></script>

<script src="<c:url value='/vendors/zTree/jquery.ztree.core-3.5.min.js' />"></script>
<script src="<c:url value='/vendors/zTree/jquery.ztree.excheck-3.5.min.js' />"></script>
<script src="<c:url value='/dev/js/json.js' />"></script>

<script>
    jQuery(document).ready(function() {
	   FormValidation.init();
	});
    jQuery.validator.addMethod("isOneChoice", function(value, element, param){
        var list = value.split(',');
        if (list.length > 1)
            return false;
        return true;
    }, jQuery.format("只能选择一个部门"));

    $(function(){
        $(".datepicker").datepicker({format: 'yyyy-mm-dd'});
        $(".uniform_on").uniform();
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

</body>
</html>
