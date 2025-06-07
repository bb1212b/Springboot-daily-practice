# Day 1 - Hello API 

📅 1일 1백엔드 프로젝트  
📌 목표: Spring Boot 기반으로 가장 기본적인 API 구조를 익히기

## 기능 소개

| 메서드 | 경로       | 설명                       |
|--------|------------|----------------------------|
| GET    | /hello     | "Hello, 백엔더 주원이의 첫 API 만들기!!" 반환 |
| GET    | /ping      | "pong" 반환 (헬스체크용)   |

- Spring Boot 프로젝트 구조 이해
- `@RestController`, `@GetMapping` 역할
- URL 구성 원리 (`localhost:8080/hello`)

## Day 2 - 명언 랜덤 API
- `/quote` → 명언 1개 랜덤 JSON 응답

## Day 3 - 메모 API
- `POST /memo` → content 받기
- `GET /memos` → 저장된 메모 리스트
