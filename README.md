# Mapstruct

---

객체 변환을 용이하게 하는 dependency

## Ref

---

https://mapstruct.org/

https://mapstruct.org/documentation/stable/reference/html/



## 요약

---

1. ObjectMapper와 같이 직렬화/역직렬화 관련 로직을 따름.
   1. from에 해당하는 객체는 getter가 존재해야 하며, to에 해당하는 객체는 setter와 NoArgConstructor를 필요로 함.

2. Animal 객체로 실험 해 보고, generated 된 코드 살펴보니 Nested Object나 List에 대해서도 ~이름만 같으면~ 정상적으로 잘 작동하는것을 확인함.

## MapStruct with Spring

---

https://bepoz-study-diary.tistory.com/412
https://mapstruct.org/documentation/stable/reference/html/#using-dependency-injection

Mapper의 Instance를 static으로 선언할 수도 있지만, Component로 등록할 수도 있다.

@Mapper(componentModel = "spring") 으로 등록한다.

---
# 작업로그

2022-08-23 부분집합의 합으로 집합을 만들 수 있는지 확인