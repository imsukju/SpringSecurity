# Mych09_01 프로젝트

Spring Security의 필터와 설정을 다룬 예제 프로젝트입니다. 이 프로젝트는 Spring Security의 커스텀 필터와 로깅 기능, 인증 메커니즘을 구현하며 간단한 UI 템플릿도 포함되어 있습니다.

---

## 프로젝트 구조
```
mych09_01/
├── src/
│   ├── main/
│   │   ├── java/com/mych09_01/mych09_01/
│   │   │   ├── Mych0901Application.java           # 메인 애플리케이션 클래스
│   │   │   ├── config/
│   │   │   │   └── AppConfig.java                # 애플리케이션 보안 설정
│   │   │   ├── controller/
│   │   │   │   ├── HelloController.java          # REST 컨트롤러 (간단한 엔드포인트 제공)
│   │   │   ├── filter/
│   │   │   │   ├── AuthenticationLoggingFilter.java # 인증 이벤트 로깅 필터
│   │   │   │   ├── LoggingFilter.java            # 요청 로깅 필터
│   │   │   │   ├── RequestValidationFilter.java  # 요청 유효성 검사 필터
│   │   │   │   ├── StaticKeyAuthenticationFilter.java # 키 기반 인증 필터
│   │   │   ├── init/
│   │   │   │   └── CustomServletContext.java     # ServletContext 초기화
│   ├── resources/
│   │   ├── application.properties                # 애플리케이션 설정 파일
│   │   ├── templates/
│   │   │   └── main.html                         # HTML 템플릿 파일
├── pom.xml                                       # Maven 프로젝트 설정 파일
├── mvnw, mvnw.cmd                                # Maven Wrapper 스크립트
```

---

## 주요 기능

### 1. **다양한 인증 필터**
- **StaticKeyAuthenticationFilter**: 고정 키 기반 인증 처리.
- **LoggingFilter**: 요청을 로깅하여 애플리케이션의 요청 흐름을 추적.
- **AuthenticationLoggingFilter**: 인증 이벤트(성공/실패)를 로깅.
- **RequestValidationFilter**: 들어오는 HTTP 요청을 유효성 검증.

### 2. **RESTful 컨트롤러**
- **HelloController**
  - 간단한 엔드포인트를 제공하며 보안 설정이 적용된 상태에서 요청 처리.
  - 주요 엔드포인트:
    - **GET /hello**: "Hello, World!" 메시지를 반환.

### 3. **HTML 템플릿**
- 간단한 HTML 템플릿을 통해 사용자에게 기본적인 응답을 렌더링.
- **templates/main.html**: 예제 템플릿 파일.

---

## 실행 방법

### 1. **필수 요건**
- **Java**: 17 이상
- **Spring Boot**: 3.0 이상
- **Maven**: 프로젝트 빌드 및 종속성 관리

### 2. **빌드 및 실행**
1. IDE (IntelliJ, Eclipse 등)에서 프로젝트를 엽니다.
2. `Mych0901Application.java`를 실행하여 애플리케이션을 시작합니다.
3. `application.properties` 파일을 통해 서버 포트와 보안 설정을 확인합니다.

### 3. **테스트**
1. **Postman** 또는 **cURL**을 사용하여 다음 엔드포인트를 테스트합니다:
   - **GET /hello**: 인증 후 "Hello, World!" 메시지를 반환.
2. 필터를 거치는 요청의 동작을 확인합니다:
   - 요청 및 인증 로깅 확인.
   - 잘못된 요청이 `RequestValidationFilter`에서 차단되는지 테스트.
3. 브라우저에서 `main.html`을 열어 HTML 템플릿 동작 확인.

---

## 프로젝트 목적

이 프로젝트는 다음과 같은 학습 목표를 가지고 있습니다:
1. **Spring Security의 필터 체인 활용**: 커스텀 필터를 추가하여 인증 및 요청 처리 논리를 구현.
2. **RESTful API 보안 설정**: Spring Security 설정을 통해 보안이 적용된 API 설계.
3. **간단한 UI 템플릿 제공**: 템플릿 엔진을 활용하여 사용자 인터페이스를 추가.
