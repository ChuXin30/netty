package com.imooc.conttoller;


import com.imooc.pojo.Users;
import com.imooc.utils.IMoocJSONResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("u")

public class UserController {
    @PostMapping("/registOrLogin")
    public IMoocJSONResult registOrLogin(@RequestBody Users user) throws Exception {



        return IMoocJSONResult.ok();
    }
}
