# SpringSecurityCh01_01 프로젝트

Spring Boot와 Spring Security를 활용하여 보안 필터, 인증 핸들러, 인터셉터, 인증 제공자 등의 보안 기능을 구현한 프로젝트입니다.

---

## 프로젝트 구조
```
SpringSecurityCh01_01/
├── SpringSecurityCh0101Application.java       # 메인 애플리케이션 진입점
├── config/
│   ├── AppConfig.java                         # 애플리케이션 전반 설정
│   ├── CustomEntryPoint.java                  # 인증되지 않은 요청에 대한 커스텀 진입점
├── controller/
│   ├── HelloController.java                   # API 엔드포인트를 처리하는 REST 컨트롤러
├── filter/
│   ├── AuthenticationLoggingFilter.java       # 인증 이벤트를 로깅
│   ├── RequestValidationFilter.java           # 들어오는 HTTP 요청 검증
├── handler/
│   ├── CustomAuthenticationFailureHandler.java # 인증 실패 처리 핸들러
│   ├── CustomAuthenticationSuccessHandler.java # 인증 성공 처리 핸들러
├── interceptor/
│   ├── CustomInterceptor.java                 # 요청에 대한 커스텀 인터셉터
└── security/
    ├── CustomAuthenticationProvider.java      # 사용자 인증을 위한 커스텀 로직
```

---

## 주요 기능

### 1. **커스텀 보안 필터**
- **AuthenticationLoggingFilter**: 인증 시도와 결과를 로깅하여 모니터링합니다.
- **RequestValidationFilter**: 들어오는 요청이 정의된 보안 기준을 충족하는지 검증합니다.

### 2. **커스텀 인증 핸들러**
- **CustomAuthenticationFailureHandler**: 인증 실패 시 실행되는 동작을 정의합니다.
- **CustomAuthenticationSuccessHandler**: 인증 성공 시 실행되는 동작을 정의합니다.

### 3. **커스텀 보안 구성 요소**
- **CustomEntryPoint**: 인증되지 않은 접근에 대해 커스텀 로직을 처리합니다.
- **CustomAuthenticationProvider**: 사용자 인증을 위한 커스텀 로직을 구현합니다.

### 4. **컨트롤러**
- **HelloController**: 보안이 적용된 API 엔드포인트를 제공하는 간단한 REST 컨트롤러입니다.

### 5. **인터셉터**
- **CustomInterceptor**: 컨트롤러에 도달하기 전/후에 요청을 처리하는 추가 로직을 구현합니다.

---

## 실행 방법

### 1. **필수 조건**
- **Java**: 17 이상
- **Spring Boot**: 3.0 이상
- **Maven 또는 Gradle**: 프로젝트 빌드 및 종속성 관리

### 2. **빌드 및 실행**
1. IDE (IntelliJ, Eclipse 등)에서 프로젝트를 엽니다.
2. `SpringSecurityCh0101Application.java`를 실행하여 애플리케이션을 시작합니다.
3. `application.yml` 또는 `application.properties` 파일에서 설정을 확인합니다.

### 3. **애플리케이션 접속**
- Postman, 브라우저, 또는 기타 HTTP 클라이언트를 사용하여 API 테스트:
  - **GET /hello**: 인증 성공 시 환영 메시지를 반환.

---

## 엔드포인트

| 엔드포인트 | 메서드 | 설명                     |
|------------|--------|-------------------------|
| `/hello`   | GET    | 환영 메시지를 반환합니다. |

---

## 주요 구성

### 1. **보안 설정**
- **필터**: 요청 검증 및 로깅을 위해 필터 체인에 커스텀 필터를 등록.
- **핸들러**: 성공 및 실패 핸들러를 인증 프로세스에 통합.
- **프로바이더**: 커스텀 인증 프로바이더를 사용하여 사용자 인증 로직 처리.

### 2. **애플리케이션 설정**
- **AppConfig.java**: 애플리케이션 전반적인 설정을 관리.

---

## 프로젝트 목적

이 프로젝트는 Spring Security의 핵심 기능을 학습하고, 실제 애플리케이션에서의 보안 설정 방법을 이해하기 위해 설계되었습니다. 이를 통해 보안 필터, 인증 핸들러, 커스텀 인증 제공자 구현을 경험할 수 있습니다.
