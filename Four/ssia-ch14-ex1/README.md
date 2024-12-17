# SSIA Chapter 14 Example 1 (SSIA-CH14-EX1 프로젝트)

Spring Security In Action 책의 Chapter 14 예제 프로젝트입니다. 이 프로젝트는 Spring Security의 핵심 개념을 다루며, 인증 및 인가 구성의 기본을 시연합니다.

---

## 프로젝트 구조
```
ssia-ch14-ex1/
├── src/
│   ├── main/
│   │   ├── java/com/example/ssia/
│   │   │   ├── Main.java                                 # 메인 애플리케이션 클래스
│   │   │   ├── config/
│   │   │   │   └── SecurityConfig.java                  # Spring Security 설정
│   │   │   ├── controllers/
│   │   │   │   └── HomeController.java                  # 홈 페이지 컨트롤러
│   │   │   ├── services/
│   │   │   │   └── UserService.java                     # 사용자 서비스
│   ├── resources/
│   │   ├── application.properties                       # 애플리케이션 설정
│   │   ├── templates/
│   │   │   └── home.html                                # 홈 페이지 HTML 템플릿
├── pom.xml                                              # Maven 프로젝트 설정
├── mvnw, mvnw.cmd                                       # Maven Wrapper 스크립트
```
---

## 주요 기능

### 1. **Spring Security 기본 구성**
- **SecurityConfig**:
  - Spring Security의 기본 인증 및 인가 설정 포함.
  - HTTP 요청 필터 및 기본 사용자 계정 설정.

### 2. **간단한 컨트롤러**
- **HomeController**:
  - 홈 페이지 요청을 처리.
  - 인증된 사용자만 접근 가능.

### 3. **HTML 템플릿**
- **home.html**:
  - 간단한 UI 템플릿.
  - 인증 정보를 표시하며, 인증된 사용자만 접근 가능.

---

## 실행 방법

### 1. **필수 요건**
- **Java**: 17 이상
- **Spring Boot**: 3.0 이상
- **Maven**: 프로젝트 빌드 및 종속성 관리

### 2. **빌드 및 실행**
1. 프로젝트를 IDE (IntelliJ, Eclipse 등)에서 엽니다.
2. `Main.java`를 실행하여 애플리케이션을 시작합니다.
3. `application.properties` 파일에서 포트 및 설정을 확인하거나 수정합니다.

### 3. **테스트**
1. 웹 브라우저에서 `http://localhost:8080`로 접속합니다.
2. 인증된 사용자인 경우 홈 페이지에 접근 가능.
3. 인증되지 않은 사용자는 로그인 페이지로 리디렉션됩니다.

---

## 프로젝트 목적

이 프로젝트는 다음을 학습하기 위한 예제입니다:
1. Spring Security의 **기본 인증 및 인가 구성**.
2. **Controller**와 **HTML 템플릿**을 활용한 간단한 애플리케이션 구축.
3. 인증 상태에 따른 리소스 접근 제어.
