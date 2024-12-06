package com.example.smtp.controller;

import com.example.smtp.service.RegisterMail;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mail")
@RequiredArgsConstructor
@Slf4j
public class SmtpController {

    private final RegisterMail registerMail;

    @PostMapping("/confirm.json")
    public String mailConfirm(@RequestParam("email") String email) throws Exception {
        String code = registerMail.sendSimpleMessage(email);
        log.info("사용자에게 발송한 인증코드 : {}", code);
        return code;
    }

}
