<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
    <script type="text/javascript">
        $(function(){
            $("button").click(function(){
                $.ajax({
                    type:"POST",
                    url:"${pageContext.request.contextPath}/some/third",
                    data:{
                        name:"张三",
                        age:18
                    },
                    success:function (data) {
                        alert(data.name+":"+data.age);
                    }

                });

            });
        });
    </script>
</head>
<body>
<button>Ajax请求</button>

</body>
</html>
