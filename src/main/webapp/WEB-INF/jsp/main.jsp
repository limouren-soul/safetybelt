<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
	<c:set var="root" value="${pageContext.request.contextPath}" /> 
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>智慧工地</title>
 <link rel="stylesheet" href="${pageContext.request.contextPath }/resource/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">智慧工地后台    监控系统</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
     <ul class="layui-nav layui-layout-left">
<!--       <li class="layui-nav-item"><a href="">控制台</a></li>
      <li class="layui-nav-item"><a href="">设备管理</a></li>
      <li class="layui-nav-item"><a href="">管理员</a></li> -->
      <li class="layui-nav-item">
        <a href="javascript:;">超级管理员</a>
        <dl class="layui-nav-child">
          <dd><a href="javascript:;" data-url="${root }/manager/managerList" data-id="managerList" data-title="管理员列表" class="site-demo-active" >管理员列表</a></dd>
          <dd><a href="javascript:;">新增管理员</a></dd>
          <dd><a href="">3</a></dd>
        </dl>
      </li>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="${root }/resource/img/2.png" class="layui-nav-img">
          ${managerName }
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="${root }/logout">退出</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
      <li class="layui-nav-item"><a href="javascript:;">实时监控</a></li>
        <li class="layui-nav-item">  <!-- layui-nav-itemed：默认展开 -->
          <a class="" href="javascript:;">设备</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;" data-url="${root }/device/deviceList" data-id="deviceList" data-title="设备列表" class="site-demo-active">设备列表</a></dd>
            <dd><a href="javascript:;" data-url="${root }/device/addDevice" data-id="addDevice" data-title="新增设备" class="site-demo-active">新增设备</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;">用户</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;" data-url="${root}/users/userList" data-id="userList" data-title="用户列表" class="site-demo-active">用户列表</a></dd>
            <dd><a href="javascript:;">新增用户</a></dd>
          </dl>
        </li>
        
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
	    <div class="layui-tab layui-tab-card" lay-filter="demo" lay-allowclose="true" style="margin-top: 0px;">
		    <ul class="layui-tab-title" ></ul>
		<!--     <ul class="rightmenu" style="display: none;position: absolute;">
                    <li data-type="closethis">关闭当前</li>
                    <li data-type="closeall">关闭所有</li>
                </ul> -->
		    <div class="layui-tab-content"></div>
		</div>
  </div>
  
  
  
  
  
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © cqupt.yf403.lsk.com
  </div>
</div>


<script src="${pageContext.request.contextPath }/resource/layui/layui.js" charset="utf-8"></script>

<script>
//JavaScript代码区域
layui.use('element', function(){
  var $ = layui.jquery;
  var element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块
  var layer = layui.layer;
  
  
//触发事件
  var active = {
      //在这里给active绑定几项事件，后面可通过active调用这些事件
      tabAdd: function(url,id,name) {
          //新增一个Tab项 传入三个参数，分别对应其标题，tab页面的地址，还有一个规定的id，是标签中data-id的属性值
          //关于tabAdd的方法所传入的参数可看layui的开发文档中基础方法部分
          element.tabAdd('demo', {
              title: name,
              content: '<iframe data-frameid="'+id+'" scrolling="auto" frameborder="0" src="'+url+'" style="width:100%;height:99%;"></iframe>',
              id: id //规定好的id
          })
           //CustomRightClick(id); //给tab绑定右击事件
           FrameWH();  //计算ifram层的大小
      },
      tabChange: function(id) {
          //切换到指定Tab项
          element.tabChange('demo', id); //根据传入的id传入到指定的tab项
      }, 
      tabDelete: function (id) {
      element.tabDelete("demo", id);//删除
      }, 
    /*   tabDeleteAll: function (ids) {//删除所有
          $.each(ids, function (i,item) {
              element.tabDelete("demo", item); //ids是一个数组，里面存放了多个id，调用tabDelete方法分别删除
          })
      }  */
  };


  //当点击有site-demo-active属性的标签时，即左侧菜单栏中内容 ，触发点击事件
  $('.site-demo-active').on('click', function() {
      var dataid = $(this);
      //这时会判断右侧.layui-tab-title属性下的有lay-id属性的li的数目，即已经打开的tab项数目
      if ($(".layui-tab-title li[lay-id]").length <= 0) {
          //如果比零小，则直接打开新的tab项
          active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"),dataid.attr("data-title"));
      } else {
          //否则判断该tab项是否已经存在
          var isData = false; //初始化一个标志，为false说明未打开该tab项 为true则说明已有
          $.each($(".layui-tab-title li[lay-id]"), function () {
              //如果点击左侧菜单栏所传入的id 在右侧tab项中的lay-id属性可以找到，则说明该tab项已经打开
              if ($(this).attr("lay-id") == dataid.attr("data-id")) {
                  //isData = true;
                  //关闭该标签后再打开，意为刷新
                  active.tabDelete(dataid.attr("data-id"));
              }
          })
          if (isData == false) {
              //标志为false 新增一个tab项
              active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"),dataid.attr("data-title"));
          }
      }
      //最后不管是否新增tab，最后都转到要打开的选项页面上
      active.tabChange(dataid.attr("data-id"));
  });
  
	  function FrameWH() {
	      var h = $(window).height() -41- 10 - 60 -10-44 -10;
	      $("iframe").css("height",h+"px");
	  }
	
	  $(window).resize(function () {
	      FrameWH();
	  })
});
</script>
</body>
</html>