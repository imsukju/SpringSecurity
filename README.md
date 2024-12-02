# Spring Security

이 저장소는 Spring Security In Action 교재를 기반으로 작성된 예제 코드와 보안 로직 구현을 포함하고 있습니다.  
Spring Security의 기본 개념부터 UserDetails, PasswordEncoder, 인증 토큰(JWT) 생성까지 다양한 보안 기능을 실습하고 확장한 프로젝트들로 구성되어 있습니다.

---

## 참고자료

- 교재: **Spring Security In Action (로텐티우 스필카)**  
- 추가 학습 자료:
  - [Spring Security PasswordEncoder](https://github.com/imsukju/MyStudyNote/blob/main/SpringSecurity/PasswordEncoder.md)
  - [JWT 토큰 개념](https://github.com/imsukju/MyStudyNote/blob/main/SpringSecurity/JWT%ED%86%A0%ED%81%B0.md)

---

## One

### securitydemo1
- **기능**:  
  - `spring-boot-starter-security` 라이브러리를 활용하여 Spring Boot 애플리케이션에서 기본 로그인 화면을 출력하는 실습.
- **목적**:  
  - Spring Security의 기본 동작 이해.
- **주요 기술**: Spring Security, 기본 보안 설정.

---

### springsecurity2
- **기능**:  
  - `UserDetails`와 `PasswordEncoder`를 활용하여 간단한 로그인 로직 구현.
  - 로그인 후 `UsernamePasswordAuthenticationToken`을 발급하는 로직 포함.
- **목적**:  
  - Spring Security를 통해 사용자 인증 및 인코딩된 비밀번호 검증 실습.
- **주요 기술**: UserDetails, PasswordEncoder, JWT 토큰.

---

## Two

### SpringSecurityCh01_01
- **설명**:  
  - Spring Security의 기본 설정과 필터 체인을 학습하기 위한 프로젝트.  
  - [자세한 내용](./Two/SpringSecurityCh01_01/README.md)

---

## Three

### mych07_01
- **설명**:  
  - 사용자, 권한, 제품 엔티티를 다루는 기본 JPA 연동 프로젝트.  
  - [자세한 내용](./Three/mych07_01/README.md)

### my08_01
- **설명**:  
  - 이메일 전송, 비디오 관리 등 다양한 컨트롤러를 포함한 프로젝트.  
  - [자세한 내용](./Three/my08_01/README.md)

### mych09_01
- **설명**:  
  - Spring Security 필터와 보안 설정을 학습하기 위한 예제 프로젝트.  
  - [자세한 내용](./Three/mych09_01/README.md)

### mych09_03
- **설명**:  
  - CSRF 토큰 로깅과 사용자 정의 인증 제공자를 다룬 프로젝트.  
  - [자세한 내용](./Three/mych09_03/README.md)

### mych09_04
- **설명**:  
  - 사용자 정의 패스워드 인코더와 보안 설정을 구현한 프로젝트.  
  - [자세한 내용](./Three/mych09_04/README.md)

---

## ssia-ch6-ex1

- **설명**:  
  - Spring Security In Action 교재의 Chapter 6 예제. 사용자 정의 인증 로직, 데이터베이스 연동, 그리고 HTML 템플릿 UI를 포함.  
  - [자세한 내용](./ssia-ch6-ex1/README.md)

---

## 사용 기술

- **Spring Security**
- **Spring Boot**
- **Spring Data JPA**
- **JWT (JSON Web Token)**
- **Thymeleaf, JSP** (템플릿 엔진)
