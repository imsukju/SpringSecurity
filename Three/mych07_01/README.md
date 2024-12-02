# Mych07_01 프로젝트

Spring Boot와 JPA를 사용하여 사용자, 제품, 권한 관리를 구현한 프로젝트입니다. 이 프로젝트는 엔티티와 데이터베이스 연동, 권한 관리, HTML 템플릿을 활용한 간단한 UI를 포함하고 있습니다.

---

## 프로젝트 구조
```
mych07_01/
├── src/
│   ├── main/
│   │   ├── java/com/mych07_01/mych07_01/
│   │   │   ├── Mych0701Application.java       # 메인 애플리케이션 클래스 (Spring Boot 실행 지점)
│   │   │   ├── config/
│   │   │   │   └── AppConfig.java            # 애플리케이션 설정
│   │   │   ├── controller/
│   │   │   │   └── HelloController.java       # 기본 요청 처리 REST 컨트롤러
│   │   │   ├── entity/
│   │   │   │   ├── Authority.java            # 권한 엔티티
│   │   │   │   ├── Product.java              # 제품 엔티티
│   │   │   │   ├── User.java                 # 사용자 엔티티
│   │   │   │   └── enums/
│   │   │   │       ├── Currency.java         # 통화 열거형
│   │   │   │       └── EncryptionAlgorithm.java # 암호화 알고리즘 열거형
│   ├── resources/
│   │   ├── application.yml                   # 애플리케이션 설정 파일
│   │   ├── templates/
│   │   │   └── main.html                     # 메인 HTML 템플릿
├── pom.xml                                   # Maven 프로젝트 설정 파일
├── mvnw, mvnw.cmd                            # Maven Wrapper 스크립트
```

---

## 주요 기능

### 1. **엔티티 관리**
- **User, Product, Authority 엔티티**:
  - 데이터베이스와 매핑되는 사용자, 제품, 권한 정보를 정의.
  - JPA를 활용하여 CRUD 작업 지원.
- **Enums (Currency, EncryptionAlgorithm)**:
  - 사용자 및 제품과 관련된 추가 속성을 열거형으로 관리.

### 2. **권한 관리**
- **Authority 엔티티**:
  - 사용자의 권한 정보를 관리.
  - 다양한 역할(Role)을 설정 및 관리 가능.
- **암호화 알고리즘 설정**:
  - `EncryptionAlgorithm` 열거형을 사용하여 데이터 보안을 강화.

### 3. **RESTful API**
- **HelloController**:
  - 간단한 RESTful API 제공.
  - 엔드포인트:
    - **GET /hello**: "Hello, World!" 메시지를 반환.

### 4. **HTML 템플릿**
- **main.html**:
  - 간단한 UI로 사용자에게 기본 정보를 제공합니다.

---

## 실행 방법

### 1. **필수 요건**
- **Java**: 17 이상
- **Spring Boot**: 3.0 이상
- **Maven**: 프로젝트 빌드 및 종속성 관리

### 2. **빌드 및 실행**
1. IDE (IntelliJ, Eclipse 등)에서 프로젝트를 엽니다.
2. `Mych0701Application.java`를 실행하여 애플리케이션을 시작합니다.
3. `application.yml` 파일에서 데이터베이스 설정을 확인하거나 수정합니다.

### 3. **테스트**
1. **Postman** 또는 **브라우저**를 사용하여 다음 엔드포인트를 테스트합니다:
   - **GET /hello**: "Hello, World!" 메시지를 반환.
2. **HTML 템플릿**:
   - 브라우저에서 `main.html` 페이지를 열어 UI를 확인합니다.
3. 데이터베이스에 직접 접근하여 User, Product, Authority 데이터 조작 및 확인.

---

## 프로젝트 목적

이 프로젝트는 다음과 같은 학습 목표를 가지고 있습니다:
1. Spring Boot와 JPA를 사용하여 **데이터베이스와의 연동**을 학습.
2. 권한 관리와 암호화 로직을 통해 **보안 관련 설정**을 구현.
3. 간단한 **HTML 템플릿**을 통해 UI와 데이터베이스 데이터를 통합.
