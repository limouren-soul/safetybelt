<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>新增设备</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${pageContext.request.contextPath }/resource/layui/css/layui.css"  media="all">
</head>
<body>
          

<form class="layui-form" action="" id="addDevcieForm">
  <div class="layui-form-item">
    <label class="layui-form-label">设备编号</label>
    <div class="layui-input-inline">
      <input type="text" name="deviceId" lay-verify="deviceId" autocomplete="off" placeholder="请输入设备编号" class="layui-input">
    </div>
     <div style="color:red ">**</div>
  </div>
  
  
  <div class="layui-form-item">
    <label class="layui-form-label">用        户 id</label>
    <div class="layui-input-inline">
      <input type="text" name="userId"  placeholder="请输入绑定用户的id" autocomplete="off" class="layui-input">
    </div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">用户姓名</label>
    <div class="layui-input-inline">
      <input type="text" name="username"  placeholder="请输入绑定用户的姓名" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>
 

          
<script src="${pageContext.request.contextPath }/resource/layui/layui.js" charset="utf-8"></script>
<script>
layui.use(['form', 'layedit', 'laydate','jquery'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate
  ,$ = layui.$;
  

  //自定义验证规则
  form.verify({
	  deviceId: function(value){
      if(value.length < 5){
        return '编号至少得5个字符啊';
      }
    }
  });
  
 
  
  //监听提交
  form.on('submit(demo1)', function(data){
	  $.ajax({
		  type:'post',
		  url:'${pageContext.request.contextPath}/device/addDeviceSubmit',
		  data:data.field,
		  success:function(data){
			  if(data=='success'){
				  layer.msg("添加成功",{icon:6})
			  }else{
				  layer.msg("添加失败，设备可能已经存在",{icon:5})
			  }
		  },
		   error:function(res){
			   layer.msg('添加失败',{icon:5})
		   }
		  
	  })
  
    return false;
	  
  });
 
  
});
</script>

</body>
</html>