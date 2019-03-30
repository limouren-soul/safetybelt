<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
	<c:set var="root" value="${pageContext.request.contextPath}" /> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <title>管理员列表</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  
  <link rel="stylesheet" href="${root }/resource/layui/css/layui.css"  media="all">
</head>
<body> 
 
<div class="demoSerach">
  搜索关键字：
  <div class="layui-inline">
    <input class="layui-input" name="keyWord" id="keyWord" autocomplete="off">
  </div>
  <button class="layui-btn" data-type="reload">搜索</button>
</div>
 
<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table> 
               
          
<script src="${root }/resource/layui/layui.js" charset="utf-8"></script>

<script>
layui.use('table', function(){
  var table = layui.table;
  
  //方法级渲染
  table.render({
    elem: '#LAY_table_user'
    ,url: '${pageContext.request.contextPath}/manager/managerPageList'
    ,cols: [[
      {checkbox: true, fixed: true}
      ,{field:'id', title: 'ID', width:80, sort: true, fixed: true}
      ,{field:'name', title: '用户名', width:80}
      ,{field:'gender', title: '性别', width:80, sort: true}
      ,{field:'city', title: '城市', width:80}
      ,{field:'sign', title: '签名'}
      ,{field:'experience', title: '积分', sort: true, width:80}
      ,{field:'score', title: '评分', sort: true, width:80}
      ,{field:'classify', title: '职业', width:80}
      ,{field:'wealth', title: '财富', sort: true, width:135}
    ]]
    ,id: 'tableReload'
    ,page: true
    ,limit: 5
    ,limits:[5,10,20,30,40,50,60,70,80,90]
    ,height: 315
  });
  
  var $ = layui.$, active = {
    reload: function(){
      var keyWord = $('#keyWord');
      
      //执行重载
      table.reload('tableReload', {
    	method:'post'
        page: {
          curr: 1 //重新从第 1 页开始
        }
        ,where: {
         	keyWord:keyWord.val()
        }
      });
    }
  };
  
  $('.demoSerach .layui-btn').on('click', function(){
    var type = $(this).data('type');
    active[type] ? active[type].call(this) : '';
  });
});
</script>

</body>
</html>