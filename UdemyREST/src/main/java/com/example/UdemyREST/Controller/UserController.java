package com.example.UdemyREST.Controller;

import com.example.UdemyREST.Model.response.UserRest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "limit", defaultValue = "20") int limit)
    {
        return "Get Users called with page = " + page + " and limit = " + limit;
    }

    @GetMapping(path = "/{userId}")
    public UserRest getUser(@PathVariable String userId)
    {
        UserRest userRest = new UserRest();
        userRest.setName("Bharath");
        userRest.setEmailId("bharathr6362@gmail.com");
        userRest.setUserID("22");
        return userRest;
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
