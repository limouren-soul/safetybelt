<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
	<c:set var="root" value="${pageContext.request.contextPath}" /> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <title>设备列表</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  
  <link rel="stylesheet" href="${root }/resource/layui/css/layui.css"  media="all">
</head>
<body> 
 
<div class="demoTable">
  搜索关键字：
  <div class="layui-inline">
    <input class="layui-input" name="keyWord" id="keyWord" autocomplete="off" placeholder="用户名或ID">
  </div>
  <button class="layui-btn" data-type="reload">搜索</button>
</div>
 
<table class="layui-hide" id="device" lay-filter="device"></table> 
      

<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="bind">绑定用户</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="unbind">解除绑定</a>
</script>           
          
<script src="${root }/resource/layui/layui.js" charset="utf-8"></script>

<script>
layui.use(['table','layer'], function(){
  var table = layui.table;
  var layer=layui.layer;
 
  
  //方法级渲染
  table.render({
    elem: '#device'
    ,url: '${pageContext.request.contextPath}/device/devicePageList'
    ,toolbar: '#toolbarDemo'
    ,id: 'testReload'
    ,cellMinWidth: 30 
    ,cols: [[
      {checkbox: true, fixed: true}
      ,{field:'id', title: '设备编号', sort: true,align:"center" }
      ,{field:'userId', title: '用户ID',align:"center"}
      ,{field:'user', title: '用户姓名',align:"center",
    	  templet: function(d){
    		  if(d.userId!=null && d.userId!=''){
    			  
    			//return  'ID：'+ d.id +'，标题：<span style="color: #c00;">'+ d.title +'</span>'
    			 return '<div>'+ d.user.name +'</div>';
    		  }
    		  else{
    			  return '';
    		  }
    	  }   
      }
      ,{field:'state0', title: '是否上线',align:"center",
    	  templet:function(d){
    		 return transferState(d.state0);
    	  }
      }
      ,{field:'state1', title: '是否穿戴',align:"center",
    	  templet:function(d){
     		 return transferState(d.state1);
     	  }
      }
      ,{field:'state2', title: '是否系上',align:"center",
    	  templet:function(d){
     		 return transferState(d.state2);
     	  }
      }
      ,{field:'state3', title: '是否挂上',align:"center",
    	  templet:function(d){
     		 return transferState(d.state3);
     	  }
      }
      ,{field:'height', title: '高度', sort: true,align:"center"}
      ,{field:'power', title: '电量',align:"center"}
      ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:210}
    ]]
  
    ,page: true
    ,limit: 6
    ,limits:[6,10,20,30,40,50,60,70,80,90]
    //,height: 315
    
  });
  
	function transferState(state){
		 if(state== '0'){
			  return '<div style="color:red">否</div>';
		  }
		  if(state=='1'){
			  return '<div style="color:green">是</div>';
		  }
  
	};
  
	
	//监听工具行事件
	table.on('tool(device)',function(obj){
		var data=obj.data;
		if(obj.event==='del'){
			layer.confirm('真的删除id为{'+data.id+'}的设备吗',function(index){
				$.ajax({
					type:'post',
					url:'${pageContext.request.contextPath}/device/deleteDevice',
					data:{"deviceId":data.id},
					success:function(data){
						if(data=='success'){
							//关闭layer
							layer.close(index);
							//删除记录
							obj.del();
							//弹出删除成功
							layer.msg('删除成功',{icon:6})
						}else{
							layer.msg("删除失败...",{icon:5})
						}
					},
					error:function(data){
						layer.msg( "删除失败",{icon: 5});
					}	
				});
			});
		}
		if(obj.event==='unbind'){
			if(data.userId!=null){
				layer.confirm("确定解绑吗",function(index){
					$.ajax({
						type:'post',
						url:'${pageContext.request.contextPath}/device/unbindUser',
						data:{"deviceId":data.id,"userId":data.user.id},
						success:function(data){
							if(data=='success'){
								//更新行
								obj.update({
									userId:''
									,user:'{}'
								});
								//关闭layer
								layer.close(index);
								//弹出删除成功
								layer.msg('解绑成功',{icon:6})
							}else{
								layer.msg("解绑失败...",{icon:5})
							}
						},
						error:function(data){
							layer.msg( "解绑失败",{icon: 5});
						}	
					});	
				});
			}
		}
	});	
	 var $ = layui.$,active = {
    reload: function(){
      var keyWord = $('#keyWord');
      //执行重载
      table.reload('testReload', {
    	  method:'post'
          ,page: {
          curr: 1 //重新从第 1 页开始
          }
          ,where: { 
            keyWord: keyWord.val()
          }
      });
    },
  };
  $('.demoTable .layui-btn').on('click', function(){
    var type = $(this).data('type');
    active[type] ? active[type].call(this) : '';
  });
});
</script>


</body>
</html>