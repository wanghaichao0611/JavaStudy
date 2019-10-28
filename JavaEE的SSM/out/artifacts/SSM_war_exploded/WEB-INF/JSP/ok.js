$(document).read(function () {
    //JSON参数和类Pojo一一对应
    var  data = {
        roleName:'role',
        note:'note',
        //分页参数
        pageParams:
            {
                start:1,
                limit:20
            }
    };
    //Jquery的post请求
    $.post(
        {
            url:"findRoles.do",
            contentType:"application/json",
            //将JSON转化为字符串传递
            data:JSON.stringify(data),
            //成功后的方法
            success:function (result) {

            }
        });
});