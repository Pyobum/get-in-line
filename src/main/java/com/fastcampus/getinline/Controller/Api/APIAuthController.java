package com.fastcampus.getinline.Controller.Api;

import com.fastcampus.getinline.Dto.APIDataResponse;
import com.fastcampus.getinline.Dto.AdminRequest;
import com.fastcampus.getinline.Dto.LoginRequest;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class APIAuthController {

    @PostMapping("/sign-up")
    public APIDataResponse<String> signUp(@RequestBody AdminRequest adminRequest) {
        return APIDataResponse.empty();
    }

    @PostMapping("/login")
    public APIDataResponse<String> login(@RequestBody LoginRequest loginRequest) {
        return APIDataResponse.empty();
    }
}
