## 실행 전 추가 파일

**src/resources/application-mail.yml** 파일을 생성하고 아래 내용을 넣어주세요!

### applcication-mail.yml
```
spring:
  mail:
    host: smtp.naver.com
    port: 465
    username: ${naver.Id}  # 네이버 아이디
    password: ${naver.Password}  # 네이버 비밀번호
    properties:
      mail:
        transport:
          protocol: smtp
        smtp:
          auth: true
          starttls:
            enable: true
          ssl:
            trust: smtp.naver.com
            enable: true
        debug: true
```

- 참고 : https://www.notion.so/SMTP-154508b5a5a8808a887dc9b755f7e66f