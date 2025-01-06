## 실행 전 추가 파일

**src/resources/** 아래 아래 2개 파일을 생성하고 아래 내용을 넣어주세요!

### src/resources/application-naverMail.yml

``` yml
spring:
  mail:
    host: smtp.naver.com
    port: 465
    username: ${naver.Id}@naver.com  # 네이버 아이디
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

### src/resources/application-googleMail.yml

``` yml
spring:
  mail:
    host: smtp.gmail.com
    port: 587
    username: ${google.id}@gmail.com  # 구글 아이디
    password: ${google.Password}  # 구글 비밀번호
    properties:
      mail:
        smtp:
          auth: true
          starttls:
            enable: true
        debug: true
```

- 참고 : https://www.notion.so/SMTP-154508b5a5a8808a887dc9b755f7e66f