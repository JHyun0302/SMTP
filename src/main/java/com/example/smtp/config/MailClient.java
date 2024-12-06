package com.example.smtp.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class MailClient {

    @Value("${spring.mail.host}")
    public String host;

    @Value("${spring.mail.port}")
    public int port;

    @Value("${spring.mail.username}")
    public String username;

    @Value("${spring.mail.password}")
    public String password;
}
