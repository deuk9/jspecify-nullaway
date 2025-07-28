## 프로젝트 개요
- spring boot 4 부터 기본으로 적용되는 jspecify에 대하여 알아본다.
- nullaway와 연동하여 null 빌드 시 null 체크를 한다.


## 간단히 정리
- null 관련 어노테이션이 많았으나 `jspecify` 의 어노테이션으로 통합
- spring 의 모든 null 관련 어노테이션이 하나로 통일.
- 해당 어노테이션을 이용하면 ide 단에서 warning 메시지를 볼 수 있음.
- nullaway를 이용하면 빌드 시 null 관련 체크 가능.
- kotlin 과의 시너지도 좋을 것으로 보임.
