package com.controller;

import com.Swagger2.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@Api(tags = "用户数据接口")
public class SwaggerController {

    @ApiOperation(value = "查询用户",notes = "根据id查询用户")
    @ApiImplicitParam(paramType = "path",name = "id",value = "用户id",required = true)
    @GetMapping("/user/id")
    public String getUseById(@PathVariable Integer id){
        return "/user/"+id;
    }

    @ApiResponses({
            @ApiResponse(code=200,message = "删除成功!"),
            @ApiResponse(code=500,message ="删除失败!")})
    @ApiOperation(value = "删除用户",notes = "通过id删除用户")
    @DeleteMapping("/user/{id}")
    public Integer deleteUserById(@PathVariable Integer id){
        return id;
    }

    @ApiOperation(value = "添加用户",notes = "添加一个用户,传入用户名和地址")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "username",value = "用户名",required = true,defaultValue = "sang"),
            @ApiImplicitParam(paramType = "query",name = "address",value = "用户地址",required = true,defaultValue = "shenzhen")
    })
    @PostMapping("/user")
    public String addUser(@RequestParam String username,@RequestParam String address){
        return username+":"+address;
    }
    @ApiOperation(value = "修改用户",notes = "修改用户,传入用户信息")
    @PutMapping("/user")
    public String updateUser(@RequestBody User user){
        return user.toString();
    }
    @GetMapping("/ignore")
    @ApiIgnore
    public void ingoreMethod(){
    }

}
