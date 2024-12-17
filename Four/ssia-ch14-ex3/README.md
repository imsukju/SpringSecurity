# SSIA Chapter 14 Example 3 (SSIA-CH14-EX3 프로젝트)

Spring Security In Action 책의 Chapter 14 예제 프로젝트입니다. 이 프로젝트는 커스텀 인증 필터와 사용자 세부 정보 서비스를 활용하여 고급 인증 흐름을 구현합니다.

---

## 프로젝트 구조
ssia-ch14-ex3/
├── src/
│   ├── main/
│   │   ├── java/com/example/ssia/
│   │   │   ├── Main.java                                 # 메인 애플리케이션 클래스
│   │   │   ├── config/
│   │   │   │   └── SecurityConfig.java                  # Spring Security 설정
│   │   │   ├── controllers/
│   │   │   │   ├── DashboardController.java             # 대시보드 컨트롤러
│   │   │   │   └── LoginController.java                 # 로그인 페이지 컨트롤러
│   │   │   ├── filters/
│   │   │   │   └── CustomAuthenticationFilter.java      # 사용자 정의 인증 필터
│   │   │   ├── services/
│   │   │   │   └── CustomUserDetailsService.java        # 사용자 정의 UserDetailsService
│   ├── resources/
│   │   ├── application.properties                       # 애플리케이션 설정
│   │   ├── templates/
│   │   │   ├── dashboard.html                           # 대시보드 HTML 템플릿
│   │   │   └── login.html                               # 로그인 페이지 HTML 템플릿
├── pom.xml                                              # Maven 프로젝트 설정
├── mvnw, mvnw.cmd                                       # Maven Wrapper 스크립트

---

## 주요 기능

### 1. **커스텀 인증 필터**
- **CustomAuthenticationFilter**:
  - 기존 UsernamePasswordAuthenticationFilter를 대체.
  - 요청 데이터에서 사용자 정보를 읽고 인증 처리.

### 2. **사용자 정의 UserDetailsService**
- **CustomUserDetailsService**:
  - 데이터베이스 또는 외부 서비스에서 사용자 정보를 로드.
  - Spring Security의 인증 매커니즘과 통합.

### 3. **HTML 템플릿**
- **login.html**:
  - 사용자 로그인 페이지.
  - 인증 실패 시 오류 메시지 표시.
- **dashboard.html**:
  - 인증된 사용자만 접근 가능한 대시보드.

---

## 실행 방법

### 1. **필수 요건**
- **Java**: 17 이상
- **Spring Boot**: 3.0 이상
- **Maven**: 프로젝트 빌드 및 종속성 관리

### 2. **빌드 및 실행**
1. 프로젝트를 IDE (IntelliJ, Eclipse 등)에서 엽니다.
2. `Main.java`를 실행하여 애플리케이션을 시작합니다.
3. `application.properties` 파일에서 포트 및 데이터베이스 설정을 확인하거나 수정합니다.

### 3. **테스트**
1. 웹 브라우저에서 `http://localhost:8080/login`으로 접속합니다.
2. 로그인 정보를 입력하여 인증 과정을 확인합니다.
3. 인증 성공 시 대시보드 페이지로 이동.
4. 인증되지 않은 사용자가 대시보드에 접근하려고 할 때 리다이렉션 동작 확인.

---

## 프로젝트 목적

이 프로젝트는 다음을 학습하기 위한 예제입니다:
1. Spring Security의 **커스텀 인증 필터** 작성 및 구성.
2. **UserDetailsService**를 사용하여 외부 사용자 데이터 소스와 통합.
3. 인증 흐름의 유연한 제어 및 보안 강화.
