# 세모봉 - 장애우 및 사회적 약자 대상 봉사 매칭 플랫폼

> 기관 등록이 어려워 봉사를 받기 힘든 사회적 약자를 위한 **자율 봉사 매칭 서비스**입니다.

![GitHub last commit](https://img.shields.io/github/last-commit/choijiwoong/molly)
[![YouTube Demo](https://img.shields.io/badge/시연영상-YouTube-red)](https://youtu.be/AmDD8p8jcVs)

---

## 🔍 개요

**세모봉**은 장애인, 고령자, 독거노인 등 **사회적 약자**들이 스스로 요청을 등록하고, 인근 봉사자가 해당 요청을 **지도 기반**으로 탐색 및 수락할 수 있는 **자율 봉사 매칭 플랫폼**입니다.  
기존 복지기관의 한계를 넘어서는 **비공식 봉사 매칭**이라는 사회적 문제 해결을 목표로 합니다.

---

## 🚀 주요 기능

- **지도 기반 봉사 요청 등록 및 탐색** (Kakao Map API)
- **거리 기준 가까운 봉사요청 필터링**
- **비회원 접근 제한 / 로그인 기반 위치 추적**
- **요청 수락 및 수락자·요청자 자동 구분 처리**
- **봉사 진행 상태 변경 및 완료 처리**
- **봉사 리뷰 및 댓글 기능**
- **긴급상황 자동 이메일 알림 서비스**
- **비동기 요청 처리 및 테스트 코드 포함**
- **Request/Accept 상태 기반 동기화 로직 구현**
- **지도 클릭 시 요청 상세 팝업 및 거리 표기 (km)**

---

## 🛠️ 기술 스택

| 영역            | 사용 기술                        |
|-----------------|----------------------------------|
| Backend         | Java 11, Spring Boot, JPA, QueryDSL |
| Frontend        | HTML, CSS, JavaScript, jQuery   |
| Database        | H2 / MySQL                      |
| API             | Kakao Map API, Gmail SMTP       |
| Build/Deploy    | Gradle                          |
| Test            | JUnit, MockMVC                  |

---

## 📁 프로젝트 구조
```
molly/
├── domain/
├── controller/
├── service/
├── repository/
├── dto/
├── async/
└── templates/
```

---

## 🧪 커밋 이력 주요 포인트

- `RestAPI기능 틀 구현 완료`, jQuery 스크립트 연동 문제 해결
- `AsyncService 동작`, 봉사자의 단일 객체 처리
- `위도/경도 좌표 오차 조정`, 거리 정규화 적용
- `Request/Accept`, 리뷰 및 댓글 기능 구현
- `RequestService`, 거리 기반 필터 로직 및 위치 계산
- `비동기 메일 알림 서비스`, 긴급상황 자동 대응

---

## 📹 시연 영상

👉 [세모봉 시연 영상 보러가기](https://youtu.be/AmDD8p8jcVs)

---

## 💻 GitHub

🔗 [https://github.com/choijiwoong/molly](https://github.com/choijiwoong/molly)

---

## ✍️ 개발자

- **최지웅** (choijiwoong)

---
