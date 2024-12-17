# SSIA Chapter 14 Example 2 (SSIA-CH14-EX2 프로젝트)

Spring Security In Action 책의 Chapter 14 예제 프로젝트입니다. 이 프로젝트는 고급 인증 및 인가 구성을 다루며, 사용자 정의 핸들러와 필터를 사용하는 방법을 시연합니다.

---

## 프로젝트 구조
ssia-ch14-ex2/ ├── src/ │ ├── main/ │ │ ├── java/com/example/ssia/ │ │ │ ├── Main.java # 메인 애플리케이션 클래스 │ │ │ ├── config/ │ │ │ │ └── SecurityConfig.java # Spring Security 설정 │ │ │ ├── controllers/ │ │ │ │ ├── AdminController.java # 관리자 페이지 컨트롤러 │ │ │ │ └── UserController.java # 사용자 페이지 컨트롤러 │ │ │ ├── handler/ │ │ │ │ ├── LoginSuccessHandler.java # 로그인 성공 핸들러 │ │ │ │ └── LoginFailureHandler.java # 로그인 실패 핸들러 │ ├── resources/ │ │ ├── application.yml # 애플리케이션 설정 │ │ ├── templates/ │ │ │ ├── admin.html # 관리자 페이지 HTML 템플릿 │ │ │ └── user.html # 사용자 페이지 HTML 템플릿 ├── pom.xml # Maven 프로젝트 설정 ├── mvnw, mvnw.cmd # Maven Wrapper 스크립트

---

## 주요 기능

### 1. **고급 Spring Security 구성**
- **SecurityConfig**:
  - 사용자 역할에 따라 페이지 접근 제어.
  - 커스텀 로그인 성공 및 실패 핸들러 등록.

### 2. **사용자 정의 핸들러**
- **LoginSuccessHandler**:
  - 로그인 성공 시 사용자 역할에 따라 리다이렉션.
- **LoginFailureHandler**:
  - 로그인 실패 시 사용자에게 오류 메시지 표시.

### 3. **HTML 템플릿**
- **admin.html**:
  - 관리자 전용 페이지.
  - ADMIN 권한을 가진 사용자만 접근 가능.
- **user.html**:
  - 일반 사용자 페이지.
  - USER 권한을 가진 사용자만 접근 가능.

---

## 실행 방법

### 1. **필수 요건**
- **Java**: 17 이상
- **Spring Boot**: 3.0 이상
- **Maven**: 프로젝트 빌드 및 종속성 관리

### 2. **빌드 및 실행**
1. 프로젝트를 IDE (IntelliJ, Eclipse 등)에서 엽니다.
2. `Main.java`를 실행하여 애플리케이션을 시작합니다.
3. `application.yml` 파일에서 포트 및 설정을 확인하거나 수정합니다.

### 3. **테스트**
1. 웹 브라우저에서 `http://localhost:8080`로 접속합니다.
2. 제공된 사용자 계정을 사용하여 로그인합니다:
   - ADMIN: 관리자 페이지에 접근 가능.
   - USER: 사용자 페이지에 접근 가능.
3. 잘못된 인증 시 실패 핸들러가 동작하는지 확인합니다.

---

## 프로젝트 목적

이 프로젝트는 다음을 학습하기 위한 예제입니다:
1. Spring Security의 **커스텀 인증 핸들러** 구현.
2. 역할 기반 **인가 및 리다이렉션** 구성.
3. Spring Security 필터를 활용한 **세부적인 인증 흐름 제어**.
