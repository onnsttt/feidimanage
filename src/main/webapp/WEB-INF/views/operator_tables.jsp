<%--
  Created by IntelliJ IDEA.
  User: 欧鹏程
  Date: 2018/8/5
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>飞涤科技</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="icon" type="image/png" href="../../resources/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="../../resources/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <script src="../../resources/js/echarts.min.js"></script>
    <link rel="stylesheet" href="../../resources/css/amazeui.min.css" />
    <link rel="stylesheet" href="../../resources/css/amazeui.datatables.min.css" />
    <link rel="stylesheet" href="../../resources/css/app.css">
    <script src="../../resources/js/jquery.min.js"></script>

</head>

<body data-type="widgets">
<script src="../../resources/js/theme.js"></script>
<script>
    $(function () {
        var list = ${machineinfolist};

        updatestate = function (id) {
            window.location.href="/operator/machinestatechange?machineid="+id;
            // window.reload();
        }
        // updatestate(10005);
        function machineinfo() {
            for(var i in list){
                var str = "<tr>";
                str+="<td>"+list[i].machineid+"</td>";
                str+="<td>"+list[i].operatorid+"</td>";
                // str+="<td>"+list[i].state+"</td>";
                if(list[i].state=="1")
                    str+="<td>运行中</td>";
                else
                    str+="<td>未运行</td>";
                str+="<td>"+list[i].foam+"</td>";
                str+="<td><button id=\"doc-single-toggle\" type=\"button\" class=\"am-btn am-btn-primary\" data-am-button onclick='updatestate("+list[i].machineid+");'>切换状态</button><td><tr>"
                $("#machineinfo").append(str);
            }
        }
        machineinfo();

    })
</script>
<div class="am-g tpl-g">
    <!-- 头部 -->
    <header>
        <!-- logo -->
        <div class="am-fl tpl-header-logo">
            <a href="javascript:;"><img src="../../resources/img/fdlogo.png" alt=""></a>
        </div>
        <!-- 右侧内容 -->
        <div class="tpl-header-fluid">
            <!-- 侧边切换 -->
            <div class="am-fl tpl-header-switch-button am-icon-list">
                    <span>

                </span>
            </div>
            <!-- 搜索 -->
            <div class="am-fl tpl-header-search">
                <form class="tpl-header-search-form" action="javascript:;">
                    <button class="tpl-header-search-btn am-icon-search"></button>
                    <input class="tpl-header-search-box" type="text" placeholder="搜索内容...">
                </form>
            </div>
            <!-- 其它功能-->
            <div class="am-fr tpl-header-navbar">
                <ul>
                    <!-- 欢迎语 -->
                    <li class="am-text-sm tpl-header-navbar-welcome">
                        <a href="javascript:;">欢迎您, <span><%=request.getSession().getAttribute("username")%></span> </a>
                    </li>

                    <!-- 退出 -->
                    <li class="am-text-sm">
                        <a href="/exit">
                            <span class="am-icon-sign-out"></span> 退出
                        </a>
                    </li>
                </ul>
            </div>
        </div>

    </header>
    <!-- 风格切换 -->
    <!-- 侧边导航栏 -->
    <div class="left-sidebar">
        <!-- 用户信息 -->
        <div class="tpl-sidebar-user-panel">
            <div class="tpl-user-panel-slide-toggleable">
                <div class="tpl-user-panel-profile-picture">
                    <img src="../../resources/img/images.png" alt="">
                </div>
                <span class="user-panel-logged-in-text">
              <i class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>
              <%=request.getSession().getAttribute("username")%>
          </span>
                <a href="javascript:;" class="tpl-user-panel-action-link"> <span class="am-icon-pencil"></span> 账号设置</a>
            </div>
        </div>


        <!-- 菜单 -->
        <ul class="sidebar-nav">
            <%--<li class="sidebar-nav-heading">Components <span class="sidebar-nav-heading-info"> 附加组件</span></li>--%>
            <li class="sidebar-nav-link">
                <a href="/operator/main">
                    <i class="am-icon-home sidebar-nav-link-logo"></i> 首页
                </a>
            </li>
            <li class="sidebar-nav-link">
                <a href="/operator/tables">
                    <i class="am-icon-table sidebar-nav-link-logo"></i> 机器管理
                </a>
            </li>
            <li class="sidebar-nav-link">
                <a href="/operator/consume">
                    <i class="am-icon-calendar sidebar-nav-link-logo"></i> 收入详情
                </a>
            </li>
            <li class="sidebar-nav-link">
                <a href="/operator/meal">
                    <i class="am-icon-calendar sidebar-nav-link-logo"></i> 套餐管理
                </a>
            </li>

        </ul>
    </div>



    <!-- 内容区域 -->
    <div class="tpl-content-wrapper">

        <div class="container-fluid am-cf">
            <div class="row">
                <div class="am-u-sm-12 am-u-md-12 am-u-lg-9">
                    <div class="page-header-heading"><span class="am-icon-home page-header-heading-icon"></span> 飞涤科技 <small></small></div>
                    <p class="page-header-description">欢迎使用飞涤科技后台管理系统</p>
                </div>
                <div class="am-u-lg-3 tpl-index-settings-button">
                    <button type="button" class="page-header-button"><span class="am-icon-paint-brush"></span> 设置</button>
                </div>
            </div>

        </div>

        <div class="row-content am-cf">
            <div class="row">

                <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                    <div class="widget am-cf">
                        <div class="widget-head am-cf">
                            <div class="widget-title am-fl">机器管理</div>
                            <div class="widget-function am-fr">
                                <a href="javascript:;" class="am-icon-cog"></a>
                            </div>
                        </div>
                        <div class="widget-body  widget-body-lg am-fr">

                            <table width="100%" class="am-table am-table-compact am-table-striped tpl-table-black " id="example-r">
                                <thead>
                                <tr>
                                    <th>机器id</th>
                                    <th>所属用户</th>
                                    <th>机器状态</th>
                                    <th>机器液位</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody id="machineinfo">

                                </tbody>
                            </table>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
<script src="../../resources/js/amazeui.min.js"></script>
<script src="../../resources/js/amazeui.datatables.min.js"></script>
<script src="../../resources/js/dataTables.responsive.min.js"></script>
<script src="../../resources/js/app.js"></script>

</body>

</html>