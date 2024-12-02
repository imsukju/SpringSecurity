# SSIA Chapter 6 Example 1 (SSIA-CH6-EX1 프로젝트)

Spring Security In Action 책의 Chapter 6 예제 프로젝트입니다. 이 프로젝트는 사용자 정의 인증 로직, 엔티티 관리, 데이터베이스 초기화, 그리고 간단한 템플릿 기반 UI를 포함하고 있습니다.

---

## 프로젝트 구조
```
ssia-ch6-ex1/
├── src/
│   ├── main/
│   │   ├── java/com/laurentiuspilca/ssia/
│   │   │   ├── Main.java                                 # 메인 애플리케이션 클래스
│   │   │   ├── config/
│   │   │   │   └── ProjectConfig.java                   # Spring Security 및 애플리케이션 설정
│   │   │   ├── controllers/
│   │   │   │   └── MainPageController.java              # 메인 페이지 컨트롤러
│   │   │   ├── entities/
│   │   │   │   ├── Authority.java                       # 권한 엔티티
│   │   │   │   ├── Product.java                         # 제품 엔티티
│   │   │   │   ├── User.java                            # 사용자 엔티티
│   │   │   │   └── enums/
│   │   │   │       ├── Currency.java                   # 통화 열거형
│   │   │   │       └── EncryptionAlgorithm.java        # 암호화 알고리즘 열거형
│   │   │   ├── handler/
│   │   │   │   ├── CustomAuthenticationFailureHandler.java # 인증 실패 핸들러
│   │   │   │   └── CustomAuthenticationSuccessHandler.java # 인증 성공 핸들러
│   │   │   ├── model/
│   │   │   │   └── CustomUserDetails.java               # 사용자 정의 UserDetails
│   │   │   ├── repositories/
│   │   │   │   ├── ProductRepository.java               # 제품 데이터 접근 레이어
│   │   │   │   └── UserRepository.java                  # 사용자 데이터 접근 레이어
│   │   │   ├── services/
│   │   │   │   ├── AuthenticationProviderService.java   # 사용자 정의 인증 제공자
│   │   │   │   ├── JpaUserDetailsService.java           # JPA 기반 사용자 세부 정보 서비스
│   │   │   │   └── ProductService.java                  # 제품 서비스
│   ├── resources/
│   │   ├── application.yml                              # 애플리케이션 설정
│   │   ├── data.sql                                     # 초기 데이터 스크립트
│   │   ├── schema.sql                                   # 데이터베이스 스키마 스크립트
│   │   ├── templates/
│   │   │   └── main.html                                # 메인 페이지 HTML 템플릿
├── pom.xml                                              # Maven 프로젝트 설정
├── mvnw, mvnw.cmd                                       # Maven Wrapper 스크립트
```

---

## 주요 기능

### 1. **사용자 정의 인증**
- **AuthenticationProviderService**:
  - Spring Security의 `AuthenticationProvider`를 구현.
  - 사용자 이름과 암호를 검증하는 커스텀 인증 로직.
- **CustomAuthenticationSuccessHandler & FailureHandler**:
  - 로그인 성공 및 실패 이벤트 처리.

### 2. **엔티티 관리**
- **User, Product, Authority 엔티티**:
  - 데이터베이스에 매핑되는 사용자, 제품, 권한 정보를 정의.
- **JPA 리포지토리**:
  - 사용자 및 제품 정보를 관리하는 JPA 기반 리포지토리.

### 3. **데이터베이스 초기화**
- **schema.sql & data.sql**:
  - 데이터베이스 테이블 생성 및 초기 데이터 로드.

### 4. **HTML 템플릿**
- **main.html**:
  - 간단한 UI 제공.
  - 인증된 사용자만 접근 가능.

---

## 실행 방법

### 1. **필수 요건**
- **Java**: 17 이상
- **Spring Boot**: 3.0 이상
- **Maven**: 프로젝트 빌드 및 종속성 관리

### 2. **빌드 및 실행**
1. IDE (IntelliJ, Eclipse 등)에서 프로젝트를 엽니다.
2. `Main.java`를 실행하여 애플리케이션을 시작합니다.
3. `application.yml` 파일에서 데이터베이스 설정을 확인하거나 수정합니다.

### 3. **테스트**
1. 웹 브라우저에서 애플리케이션의 기본 URL로 접속합니다.
2. 로그인 폼을 사용하여 인증을 테스트합니다.
3. 인증 성공/실패에 따른 로직 및 UI 확인.
4. CSRF 방어와 데이터베이스 CRUD 동작 테스트.

---

## 프로젝트 목적

이 프로젝트는 다음을 학습하기 위한 예제입니다:
1. Spring Security의 **AuthenticationProvider**와 사용자 정의 인증 로직.
2. Spring JPA를 사용한 엔티티와 데이터베이스 관리.
3. CSRF 방어 및 HTML 템플릿 활용.
