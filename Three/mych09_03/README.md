# Mych09_03 프로젝트

Spring Security의 CSRF 토큰 로깅 및 사용자 정의 인증 제공자를 다룬 프로젝트입니다. CSRF 방어와 고급 인증 메커니즘을 구현하며, 간단한 HTML UI도 포함되어 있습니다.

---

## 프로젝트 구조
```
mych09_03/
├── src/
│   ├── main/
│   │   ├── java/com/mych09_03/mych09_03/
│   │   │   ├── Mych0903Application.java        # 메인 애플리케이션 클래스
│   │   │   ├── config/
│   │   │   │   └── AppConfig.java             # 애플리케이션 설정
│   │   │   ├── controller/
│   │   │   │   └── ProductController.java      # 제품 관리 API 컨트롤러
│   │   │   ├── filter/
│   │   │   │   ├── CsrfTokkenLogger.java       # CSRF 토큰 로깅 필터
│   │   │   │   ├── StaticKeyAuthenticationFilter.java # 고정 키 인증 필터
│   │   │   │   ├── MyFilter.java               # 사용자 정의 필터
│   │   │   ├── manager/
│   │   │   │   └── StaticKeyAuthenticationManager.java # 사용자 인증 관리자
│   │   │   ├── provider/
│   │   │   │   └── StaticKeyAuthenticationProvider.java # 사용자 정의 인증 제공자
│   │   │   ├── token/
│   │   │   │   └── StaticKeyAuthenticationToken.java # 인증 토큰 클래스
│   ├── resources/
│   │   ├── application.properties             # 애플리케이션 설정 파일
│   │   ├── templates/
│   │   │   └── main.html                      # HTML 템플릿 파일
├── pom.xml                                    # Maven 프로젝트 설정 파일
├── mvnw, mvnw.cmd                             # Maven Wrapper 스크립트
```

---

## 주요 기능

### 1. **CSRF 토큰 로깅**
- **CsrfTokkenLogger**:
  - Spring Security의 CSRF 토큰을 로깅하여 디버깅 및 보안 분석에 활용.
  - 모든 요청에서 CSRF 토큰을 캡처하고 로그로 기록.

### 2. **사용자 정의 인증 제공자**
- **StaticKeyAuthenticationProvider**:
  - 고정 키 기반 인증 메커니즘 구현.
  - 요청에 포함된 키 값을 검증하여 사용자를 인증.
- **StaticKeyAuthenticationManager**:
  - 사용자 정의 인증 로직을 관리.

### 3. **RESTful API**
- **ProductController**:
  - 제품 관련 CRUD API 제공.
  - 주요 엔드포인트:
    - **GET /products**: 모든 제품 조회.
    - **POST /products**: 새 제품 추가.
    - **PUT /products/{id}**: 특정 제품 업데이트.
    - **DELETE /products/{id}**: 특정 제품 삭제.

### 4. **HTML 템플릿**
- **templates/main.html**:
  - 간단한 UI를 통해 사용자에게 기본적인 정보를 제공합니다.

---

## 실행 방법

### 1. **필수 요건**
- **Java**: 17 이상
- **Spring Boot**: 3.0 이상
- **Maven**: 프로젝트 빌드 및 종속성 관리

### 2. **빌드 및 실행**
1. IDE (IntelliJ, Eclipse 등)에서 프로젝트를 엽니다.
2. `Mych0903Application.java`를 실행하여 애플리케이션을 시작합니다.
3. `application.properties` 파일에서 서버 포트와 보안 설정을 확인합니다.

### 3. **테스트**
1. **Postman** 또는 **cURL**을 사용하여 다음 엔드포인트를 테스트합니다:
   - **GET /products**: 제품 목록을 조회합니다.
   - **POST /products**: 새 제품을 등록합니다.
2. CSRF 토큰이 요청 헤더에 포함되었는지 확인합니다.
3. 잘못된 키 값으로 인증을 시도하여 오류 응답을 확인합니다.

---

## 프로젝트 목적

이 프로젝트는 다음과 같은 학습 목표를 가지고 있습니다:
1. **Spring Security의 CSRF 방어 이해**: CSRF 토큰의 사용과 로깅 방법을 학습합니다.
2. **사용자 정의 인증 제공자 구현**: 고정 키 기반 인증 메커니즘을 구축하고 Spring Security와 통합합니다.
3. **RESTful API 설계 및 보안 강화**: 제품 관리 API를 설계하고 인증 및 보안 로직을 추가합니다.
