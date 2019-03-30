<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
  <meta charset="utf-8">
  <title>用户列表</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
 <link rel="stylesheet" href="${pageContext.request.contextPath }/resource/layui/css/layui.css"  media="all">
</head>
<body>
 
<div class="demoSerach">
  搜索关键字：
  <div class="layui-inline">
    <input class="layui-input" name="keyWord" id="keyWord" placeholder="用户名或ID" autocomplete="off">
  </div>
  <button class="layui-btn" data-type="reload">搜索</button>
</div>

<table class="layui-hide" id="test" lay-filter="test"></table>



<%--修改的弹框--%>
<form class="layui-form layui-form-pane1" id="form1" name="form1" style="display: none;" action="<%=request.getContextPath()%>/users/updateUser" method="post" lay-filter="first1">


    <div class="layui-form-item">
        <label class="layui-form-label">id</label>
        <div class="layui-input-inline">
            <input type="text" name="id" id="id" lay-verify="required|id" required placeholder="请输入账号"  readonly="readonly" autocomplete="off" class="layui-input">
        </div>
    </div>

     <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-inline">
            <input type="text" name="name" id="name" lay-verify="required|name" required placeholder="请输入用户名" autocomplete="off" class="layui-input">
        </div>
    </div>
    
    
    
      <div class="layui-form-item">
        <label class="layui-form-label">性别</label>
        <div class="layui-input-inline">
            <input type="text" name="gender" id="gender" lay-verify="required|" placeholder="性别" autocomplete="off" class="layui-input">
        </div>
    </div>
    
    
  
    <div class="layui-form-item">
        <label class="layui-form-label">照片</label>
        <div class="layui-input-inline">
            <input type="text" name="pic" id="pic" placeholder="照片" autocomplete="off" class="layui-input">
        </div>
    </div>
    
    <div class="layui-form-item">
        <label class="layui-form-label">手机</label>
        <div class="layui-input-inline">
            <input type="tel" name="tel" id="tel" lay-verify="required|number" placeholder="请输入使用者手机号码" lay-verType="tips" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="userUpdateSubmit">修改</button>
        </div>
    </div>
</form>
 

<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
              
          
<script src="${pageContext.request.contextPath }/resource/layui/layui.js" charset="utf-8"></script>
 
<script>
layui.use(['table','jquery','layer'], function(){
  var table = layui.table;
  var layer=layui.layer;
  
  table.render({
    elem: '#test'
    ,url:'${pageContext.request.contextPath }/users/userPageList'
    ,toolbar: '#toolbarDemo'
    ,id:'tableReload'
    ,cellMinWidth: 40
    ,title: '用户数据表'
    ,cols: [[
      {field:'id', title:'ID', sort: true}
      ,{field:'name', title:'用户名', edit: 'text'}
      ,{field:'gender', title:'性别', edit: 'text'}
      ,{field:'pic', title:'照片'}
      ,{field:'tel', title:'电话'}
      ,{fixed: 'right', title:'操作', toolbar: '#barDemo'}
    ]]
    ,page: true
    ,limit:5
    ,limits:[5,10,20,30,40,50,60,70,80,90]
    
  });
  
  
  //监听行工具事件
  table.on('tool(test)', function(obj){
    var data = obj.data;
    if(obj.event === 'del'){
      layer.confirm('真的删除ID为:{'+data.id+'}的用户吗?', function(index){
        $.ajax({
        	type: 'post',
        	url: '${pageContext.request.contextPath }/users/deleteUser'
        	,data:JSON.stringify({"id": data.id})
        	//,data:{"id":data.id}
        	//,dataType:"JSON"
        	,contentType:'application/json;charset=utf-8'
            ,success: function(data){
            	if(data=="success"){
            		 obj.del();
                     layer.close(index);
                     layer.msg("删除成功", {icon: 6});	 
            	}else{
            		 layer.msg("用户已绑定设备，无法删除", {icon: 5});
            	}		
            }
            ,error:function (data) {
                layer.msg("删除失败", {icon: 5});
            }
        });
 
      });
    } else if(obj.event === 'edit'){
    	EidtUv(data,obj)
    }
  });
  function  EidtUv(data,obj) {
      $("#id").val(data.id);
      $("#name").val(data.name);
      $("#gender").val(data.gender);
      $("#pic").val(data.pic);
      $("#tel").val(data.tel);
          layer.open({
          title:'修改用户信息',
          //layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
          type:1,
          maxmin: true, //开启最大化最小化按钮
          area:['500px','400px'],
          content:$("#form1")
      });
  }
  
  var $ = layui.jquery,active = {
		    reload:function(){
		      var keyWord=$("#keyWord").val();
		      //执行重载
		      table.reload('tableReload', {
		        method:'post'
		        ,where:{keyWord:keyWord } 
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