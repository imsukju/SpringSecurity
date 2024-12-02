
# My08_01 프로젝트

Spring Boot를 사용하여 다양한 컨트롤러와 기능(이메일, 비디오, 제품 관리)을 구현한 프로젝트입니다. 이 프로젝트는 RESTful API를 통해 여러 기능을 제공합니다.

---

## 프로젝트 구조
```
my08_01/
├── src/
│   ├── main/
│   │   ├── java/com/my08_01/my08_01/
│   │   │   ├── My0801Application.java         # 메인 애플리케이션 클래스. Spring Boot 실행 지점.
│   │   │   ├── config/
│   │   │   │   └── AppConfig.java             # 애플리케이션 설정
│   │   │   ├── controller/
│   │   │   │   ├── EmailController.java       # 이메일 전송 및 관리 API
│   │   │   │   ├── MainController.java        # 기본 요청 처리 컨트롤러
│   │   │   │   ├── ProductController.java     # 제품 관리 API
│   │   │   │   └── VideoController.java       # 비디오 관리 API
│   ├── resources/
│   │   ├── application.properties             # 애플리케이션 설정 파일
├── pom.xml                                    # Maven 프로젝트 설정 파일
├── mvnw, mvnw.cmd                             # Maven Wrapper 스크립트
```

---

## 주요 기능

### 1. **이메일 관리**
- **EmailController**
  - 이메일 전송 API를 제공합니다.
  - SMTP 서버와 연동하여 메일 발송 기능 구현.
  - 주요 엔드포인트:
    - **POST /email/send**: 이메일을 발송합니다.

### 2. **제품 관리**
- **ProductController**
  - 제품 추가, 수정, 삭제 및 조회를 위한 RESTful API를 제공합니다.
  - CRUD 작업 지원:
    - **GET /products**: 모든 제품 조회.
    - **POST /products**: 새 제품 추가.
    - **PUT /products/{id}**: 기존 제품 수정.
    - **DELETE /products/{id}**: 제품 삭제.

### 3. **비디오 관리**
- **VideoController**
  - 비디오 업로드 및 관리를 위한 API를 제공합니다.
  - 파일 업로드 처리와 데이터베이스 연동.
  - 주요 엔드포인트:
    - **POST /videos/upload**: 비디오 업로드.
    - **GET /videos/{id}**: 특정 비디오 조회.

---

## 실행 방법

### 1. **필수 요건**
- **Java**: 17 이상
- **Spring Boot**: 3.0 이상
- **Maven**: 프로젝트 빌드 및 종속성 관리

### 2. **빌드 및 실행**
1. IDE (IntelliJ, Eclipse 등)로 프로젝트를 엽니다.
2. `My0801Application.java`를 실행하여 애플리케이션을 시작합니다.
3. `application.properties` 파일에서 서버 포트와 데이터베이스 설정을 확인합니다.

### 3. **API 테스트**
1. **Postman** 또는 **cURL**을 사용하여 API를 테스트합니다.
2. 이메일, 제품, 비디오 관련 엔드포인트를 호출하여 각 기능이 제대로 동작하는지 확인합니다.

---

## 프로젝트 목적

이 프로젝트는 다음과 같은 목적을 가지고 있습니다:
1. **RESTful API 학습**: Spring Boot를 활용한 REST API 설계와 구현 방법을 학습합니다.
2. **다양한 컨트롤러 활용**: 여러 컨트롤러를 통해 애플리케이션 기능을 모듈화합니다.
3. **파일 업로드 처리**: 비디오 파일 업로드와 데이터베이스 연동을 통해 파일 처리를 학습합니다.
