package com.example.smtp.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
@RequiredArgsConstructor
public class MailConfig {

    private final MailClient client;
    @Bean
    public JavaMailSender NaverMailService() {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

        javaMailSender.setHost(client.getHost());
        javaMailSender.setUsername(client.getUsername()); //네이버 아이디
        javaMailSender.setPassword(client.getPassword()); //네이버 비밀번호

        javaMailSender.setPort(client.getPort()); // SMTP port

        javaMailSender.setJavaMailProperties(getMailProperties()); //메일 인증서버 가져오기

        return javaMailSender;
    }

    private Properties getMailProperties() {
        Properties properties = new Properties();
        properties.setProperty("mail.transport.protocol", "smtp"); // 프로토콜 설정
        properties.setProperty("mail.smtp.auth", "true"); // smtp 인증
        properties.setProperty("mail.smtp.starttls.enable", "true"); // smtp strattles 사용
        properties.setProperty("mail.debug", "true"); // 디버그 사용
        properties.setProperty("mail.smtp.ssl.trust", "smtp.naver.com"); // ssl 인증 서버 (smtp 서버명)
        properties.setProperty("mail.smtp.ssl.enable", "true"); // ssl 사용

        return properties;
    }
}
