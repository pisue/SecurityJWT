package com.pisue.securityjwt.controller;

import com.pisue.securityjwt.dto.JoinDTO;
import com.pisue.securityjwt.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @PostMapping("/join")
    public String joinProcess(JoinDTO joinDTO) {
        return joinService.joinProcess(joinDTO) ? "OK":"NOT OK";
    }
}
