# Mych09_04 프로젝트

Spring Boot와 Spring Security를 활용하여 사용자 정의 패스워드 인코더와 보안 설정을 다룬 프로젝트입니다. 이 프로젝트는 Spring Security의 **PasswordEncoder**를 확장하여 보안 강화와 맞춤형 패스워드 암호화를 구현하는 방법을 보여줍니다.

---

## 프로젝트 구조
```
mych09_04/
├── src/
│   ├── main/
│   │   ├── java/com/mych09_04/mych09_04/
│   │   │   ├── Mych0904Application.java                 # 메인 애플리케이션 클래스 (Spring Boot 실행 지점)
│   │   │   ├── config/
│   │   │   │   └── AppConfig.java                       # 보안 및 애플리케이션 설정
│   │   │   ├── encoder/
│   │   │   │   ├── MyCustomDelegatePasswordEncoder.java # 커스텀 패스워드 인코더
│   │   │   │   └── PasswordEncoders.java               # PasswordEncoder 유틸리티
│   │   │   ├── entity/
│   │   │   │   └── Users.java                           # 사용자 정보를 관리하는 엔티티
│   ├── resources/
│   │   ├── application.yml                              # 애플리케이션 설정 파일
├── pom.xml                                              # Maven 프로젝트 설정 파일
├── mvnw, mvnw.cmd                                       # Maven Wrapper 스크립트
```

---

## 주요 기능

### 1. **커스텀 패스워드 인코더**
- **MyCustomDelegatePasswordEncoder**: Spring Security의 PasswordEncoder를 확장하여 여러 암호화 방식을 조합한 커스텀 인코더입니다.
  - 다양한 암호화 알고리즘 지원 (e.g., BCrypt, Pbkdf2).
  - 기존 암호화 알고리즘과의 호환성 유지.
- **PasswordEncoders**: 암호화 방식을 동적으로 생성하는 유틸리티 클래스입니다.

### 2. **Spring Security 설정**
- **AppConfig**: Spring Security 설정을 정의합니다.
  - 인증 프로바이더 설정.
  - 암호화 방식을 설정하여 사용자 인증 처리.

### 3. **사용자 관리**
- **Users 엔티티**: 사용자 데이터를 관리하기 위한 클래스입니다.
  - ID, username, password 등의 속성 포함.
  - 데이터베이스와 연동하여 사용자 정보 저장 및 검색.

---

## 실행 방법

### 1. 필수 요건
- **Java**: 17 이상
- **Spring Boot**: 3.0 이상
- **Maven**: 프로젝트 빌드 및 종속성 관리

### 2. 빌드 및 실행
1. IDE (IntelliJ, Eclipse 등)로 프로젝트를 엽니다.
2. `Mych0904Application.java`를 실행하여 애플리케이션을 시작합니다.
3. `application.yml` 파일에서 데이터베이스 설정 및 보안 구성을 확인합니다.

### 3. 테스트
1. **사용자 등록**:
   - REST API를 통해 사용자 정보를 등록합니다.
   - 비밀번호가 암호화되어 데이터베이스에 저장되는지 확인합니다.
2. **사용자 인증**:
   - 등록된 사용자 정보를 기반으로 인증 테스트를 진행합니다.
   - 올바른 암호와 잘못된 암호에 대해 인증 결과를 확인합니다.

---

## 프로젝트 목적

이 프로젝트는 다음과 같은 목적을 가지고 있습니다:
1. **Spring Security의 PasswordEncoder 확장**: 커스터마이징된 패스워드 암호화를 구현하고, 기존 암호화 알고리즘과의 호환성을 유지합니다.
2. **보안 강화를 위한 설정**: 사용자 인증과 암호화 로직을 분리하여 보안 설정의 유연성을 제공합니다.
3. **실제 애플리케이션에서의 활용**: 커스텀 인코더를 통해 애플리케이션의 비밀번호 처리와 보안을 강화하는 방법을 학습합니다.

---

위 내용을 참고하여 다른 프로젝트의 README.md도 동일한 형식으로 자세히 작성하겠습니다. 추가 요청 사항이 있다면 말씀해주세요!