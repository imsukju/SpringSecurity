## 프로젝트 구조
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
- **HelloController**: 보안이 적용된 API 엔드포인트를 시연하는 간단한 REST 컨트롤러입니다.

### 5. **인터셉터**
- **CustomInterceptor**: 컨트롤러에 도달하기 전/후에 요청을 처리하는 추가 로직을 구현합니다.

---

## 실행 방법

1. **필수 조건**:
   - Java 17 이상
   - Spring Boot 3.0+
   - Maven 또는 Gradle 빌드 도구

2. **실행 방법**:
   - 이 저장소를 클론합니다.
   - 프로젝트를 IDE(e.g., IntelliJ IDEA 또는 Eclipse)로 가져옵니다.
   - Maven 또는 Gradle을 사용하여 의존성을 해결합니다.
   - `SpringSecurityCh0101Application.java`를 실행하여 애플리케이션을 구동합니다.

3. **애플리케이션 접속**:
   - 웹 브라우저 또는 Postman과 같은 API 클라이언트를 사용하여 보안 엔드포인트를 테스트합니다.

---

## 엔드포인트

| 엔드포인트      | 메서드 | 설명                  |
|----------------|--------|----------------------|
| `/hello`       | GET    | 환영 메시지를 반환합니다.|

---

## 주요 구성

### 보안 설정
- **필터**: 요청 검증 및 로깅을 위해 필터 체인에 커스텀 필터를 등록합니다.
- **핸들러**: 성공 및 실패 핸들러를 인증 프로세스에 통합합니다.
- **프로바이더**: 커스텀 인증 프로바이더를 사용하여 사용자 인증을 처리합니다.

### 애플리케이션 설정
- **AppConfig.java**: 애플리케이션의 일반적인 설정을 포함합니다.

---

## 라이선스

이 프로젝트는 MIT License에 따라 라이선스가 부여됩니다.
