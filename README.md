# Netflix OSS Eureka Example (넷플릭스 오픈소스 Eureka 예제)

## <B>Micro Service Architecture</B>
  - ## <b>Service Discovery</b>
    - MSA 기반의 서비스들 각각의 네트워크 정보 (IP, PORT 등) 를 가진다.
      이 정보는 클라우드 환경에서 동적으로 바뀔수도 있고, 예기치 못한 장애로 특정 네트워크의 위치 정보를 사용할 수 없을 수도 있다.
      따라서 MSA 환경에서 각 서비스들의 네트워크 정보를 관리하고 가용상태를 확인해줄 수 있는 기능이 필요한데 이때 사용할 수 있는게 서비스 디스커버리
    - Service A, B, C 가 존재
    - Register to Service Registry
    - <b>Client Side Service Discovery</b>
      - Client 에서 Service Registry 를 호출
    - <b>Server Side Service Discovery</b>
      - Client 와 서비스 사이에 LoadBalancer 를 두고 LoadBalancer 에서 Service Registry 로 접근하는 방식
    - 일반적으로 서버 사이드 디스커버리로 구현
    - <b>Eureka</b>
      - Client Side Service Discovery