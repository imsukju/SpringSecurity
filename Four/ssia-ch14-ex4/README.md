# SSIA Chapter 14 Example 4 (SSIA-CH14-EX4 프로젝트)

Spring Security In Action 책의 Chapter 14 예제 프로젝트입니다. 이 프로젝트는 JWT(Json Web Token)를 활용한 인증 및 인가 흐름을 구현합니다. RESTful API와 보안 토큰 관리를 다룹니다.

---

## 프로젝트 구조
ssia-ch14-ex4/ ├── src/ │ ├── main/ │ │ ├── java/com/example/ssia/ │ │ │ ├── Main.java # 메인 애플리케이션 클래스 │ │ │ ├── config/ │ │ │ │ └── SecurityConfig.java # Spring Security 및 JWT 설정 │ │ │ ├── controllers/ │ │ │ │ ├── AuthController.java # 인증 컨트롤러 │ │ │ │ └── UserController.java # 사용자 API 컨트롤러 │ │ │ ├── services/ │ │ │ │ └── JwtService.java # JWT 토큰 생성 및 검증 서비스 │ │ │ ├── utils/ │ │ │ │ └── JwtTokenUtil.java # JWT 유틸리티 클래스 │ ├── resources/ │ │ ├── application.yml # 애플리케이션 설정 ├── pom.xml # Maven 프로젝트 설정 ├── mvnw, mvnw.cmd # Maven Wrapper 스크립트


---

## 주요 기능

### 1. **JWT 기반 인증**
- **JwtService**:
  - 사용자 정보를 기반으로 JWT 생성.
  - 토큰 유효성 검증 및 만료 처리.

- **JwtTokenUtil**:
  - JWT 파싱 및 클레임 추출.

### 2. **RESTful API 보안**
- **AuthController**:
  - 사용자 로그인 및 JWT 발급 엔드포인트 제공.
- **UserController**:
  - 인증된 사용자만 접근 가능한 API 제공.

### 3. **Spring Security 구성**
- **SecurityConfig**:
  - JWT 필터를 포함한 Spring Security 구성.
  - Stateless 세션 관리.

---

## 실행 방법

### 1. **필수 요건**
- **Java**: 17 이상
- **Spring Boot**: 3.0 이상
- **Maven**: 프로젝트 빌드 및 종속성 관리

### 2. **빌드 및 실행**
1. 프로젝트를 IDE (IntelliJ, Eclipse 등)에서 엽니다.
2. `Main.java`를 실행하여 애플리케이션을 시작합니다.
3. `application.yml` 파일에서 포트 및 JWT 키 설정을 확인하거나 수정합니다.

### 3. **테스트**
1. REST API 클라이언트(Postman 등)를 사용하여 인증 엔드포인트 호출:
   - `POST /auth/login`으로 로그인 및 JWT 발급 확인.
2. 발급된 JWT를 사용하여 인증이 필요한 API 호출:
   - `GET /user/profile`로 사용자 프로필 데이터 요청.
3. 유효하지 않은 토큰 사용 시 오류 응답 확인.

---

## 프로젝트 목적

이 프로젝트는 다음을 학습하기 위한 예제입니다:
1. **JWT를 활용한 인증 및 인가** 흐름 구현.
2. Spring Security와 JWT의 통합.
3. RESTful API에서 **Stateless 세션 관리**와 보안 강화.
4. JWT 기반의 클레임과 토큰 검증.
