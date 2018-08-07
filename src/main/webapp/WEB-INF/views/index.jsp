<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>长沙飞涤网络科技有限公司</title>
    <meta name="description" content="长沙飞涤网络科技有限公司">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="icon" type="image/png" href="resources/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="resources/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <link rel="stylesheet" href="resources/css/amazeui.min.css" />
    <link rel="stylesheet" href="resources/css/amazeui.datatables.min.css" />
    <link rel="stylesheet" href="resources/css/app.css">
    <script src="resources/js/jquery.min.js"></script>

</head>
<script type="text/javascript">

    $("#submit").click(function () {
        alert(${test});
    })
</script>

<body data-type="login">
<script src="resources/js/theme.js"></script>
<div class="am-g tpl-g">
    <!-- 风格切换 -->
    <div class="tpl-skiner">
        <div class="tpl-skiner-toggle am-icon-cog">
        </div>
        <div class="tpl-skiner-content">
            <div class="tpl-skiner-content-title">
                选择主题
            </div>
            <div class="tpl-skiner-content-bar">
                <span class="skiner-color skiner-white" data-color="theme-white"></span>
                <span class="skiner-color skiner-black" data-color="theme-black"></span>
            </div>
        </div>
    </div>
    <div class="tpl-login">
        <div class="tpl-login-content">
            <div class="tpl-login-logo">

            </div>



            <form class="am-form tpl-form-line-form" action="/login" method="post">
                <div class="am-form-group">
                    <input type="text" class="tpl-form-input" name="username" id="username" placeholder="请输入账号">

                </div>

                <div class="am-form-group">
                    <input type="password" class="tpl-form-input" name="password" id="password" placeholder="请输入密码">

                </div>
                <div class="am-form-group tpl-login-remember-me">
                    <input id="remember-me" type="checkbox">
                    <label for="remember-me">
                        记住密码
                    </label>

                </div>
                <div class="am-form-group">
                    <input id="submit" type="submit" value="登录" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn"/>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="resources/js/amazeui.min.js"></script>
<script src="resources/js/app.js"></script>

</body>

</html>
