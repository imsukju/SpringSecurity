# Mych07_01 프로젝트

Spring Boot와 JPA를 사용하여 사용자, 제품, 권한 관리를 구현한 프로젝트입니다.

---

## 프로젝트 구조
mych07_01/ ├── src/main/java/com/mych07_01/mych07_01/Mych0701Application.java │ # 메인 애플리케이션 클래스. Spring Boot 애플리케이션 실행 지점. ├── src/main/java/com/mych07_01/mych07_01/config/AppConfig.java │ # 애플리케이션 설정. ├── src/main/java/com/mych07_01/mych07_01/controller/HelloController.java │ # 기본 요청 처리 컨트롤러. ├── src/main/java/com/mych07_01/mych07_01/entity/Authority.java │ # 권한 엔티티. ├── src/main/java/com/mych07_01/mych07_01/entity/Product.java │ # 제품 엔티티. ├── src/main/java/com/mych07_01/mych07_01/entity/User.java │ # 사용자 엔티티. ├── src/main/resources/application.yml │ # 애플리케이션 설정 파일. ├── src/main/resources/templates/main.html │ # HTML 템플릿 파일.


---

## 주요 기능

### 1. **엔티티 관리**
- `User`, `Product`, `Authority` 엔티티를 통해 데이터베이스와 연동.
- JPA를 사용하여 CRUD 작업 지원.

### 2. **권한 관리**
- 사용자의 권한과 암호화 알고리즘 설정.
- 다양한 역할(Role)을 관리.

---

## 실행 방법

1. **필수 요건**:
   - Java 17 이상
   - Spring Boot 3.0 이상
   - Maven 또는 Gradle 빌드 도구

2. **빌드 및 실행**:
   - IDE에서 `Mych0701Application.java`를 실행합니다.
   - `application.yml` 파일에서 데이터베이스 설정을 확인합니다.

3. **테스트**:
   - HTML 템플릿을 확인하고 엔티티 데이터 조작을 테스트합니다.
