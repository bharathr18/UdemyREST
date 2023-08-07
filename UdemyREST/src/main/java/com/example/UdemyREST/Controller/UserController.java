package com.example.UdemyREST.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser()
    {
        return "get User  called";
    }

    @PostMapping
    public String createUser()
    {
        return "create User  called";
    }

    @PutMapping
    public String updateUser()
    {
        return "Update User called";
    }

    @DeleteMapping
    public String deleteUser()
    {
        return "delete User called";
    }
}
