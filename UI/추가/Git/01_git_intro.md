---
# 목차
1. git 소개
2. git 설치
3. git 기초
---


# 1. git 소개
1. git란
  - git : 버전 관리 시스템(VCS - Version Control System), 특정 시점에서의 파일들의 상태를, 저장하고 보여주는 소프트웨어
  - 버전 관리 시스템 : 파일 변화를 시간에 따라 기록했다가 나중에 특정 시점의 버전을 다시 꺼내올 수 있는 시스템.

2. git 특징
  - 빠르다
    - 다른 버전 관리 시스템과 달리 git은 데이터를 파일 시스템 스냅샷으로 취급하고 크기가 아주 작다.
      - 스냅샷(snapshot) : 컴퓨터 파일 시스템에서 과거의 한 때 존재하고 유지시킨 컴퓨터 파일과 디렉터리의 모임이다.
      - 읽기만 가능한 특정 시간의 가상 복제 파일시스템
    - 파일이 달라지지 않았다면 성능을 위해 파일을 새로 저장하지 않는다. 단지 이전 상태의 파일에 대한 링크만 저장한다.
    
  - 거의 모든 명령을 로컬에서 실행한다.
    - 거의 모든 명령이 로컬의 파일과 데이터만 사용한다.
    - 프로젝트의 히스토리 조회 시 서버 없이 로컬에서 조회하고, 오프라인 상태에서도 작업이 가능하다.
  - 무결성
    - 파일을 이름으로 저장하지 않고 파일의 내용이나 디렉터리 구조를 이용하여 체크섬을 구하고, SHA-1 해시를 사용하여 40자 길이의 16진수 문자열로 저장한다.
      - 체크섬
        - 오류 정정을 통해, 공간(전자 통신)이나 시간(기억 장치) 속에서 송신된 자료의 무결성을 보호하는 단순한 방법
        - 기본적인 메시지 구성요소(bit)를 추가하여 결과 값을 저장함으로써 동작한다.
        - 나중에 누구나 데이터에 같은 작업을 수행할 수 있고, 무결성 검사에 대한 결과를 비교할 수 있으며, (체크섬이 맞아 떨어지는지 확인해 봄으로써) 메시지가 손상되지 않았다고 결론을 내릴 수 있다.
        
      - SHA-1 : 안전한 해시 알고리즘으로, 서로 관련된 암호학적 해시 함수들의 모음이다.
# 2. git 설치
- git 설치 확인 명령어 : ```git --version```
- 환경 설정 명령어
  ```
  git config --global user.name "joohee.moon"
  git config --global user.email "joohee.moon&nts-corp.com"
  ```
- 환경 설정 확인 명령어 : ```git config --list```

## zsh 설치
- zsh : 터미널의 가독성을 높여 주고, tab 키로 자동 완성 기능을 제공한다.
- zsh 설치 위해선 homebrew(brew)를 먼저 설치한다.

## 우리는 git + sourcetree 사용 예정
# 3. git 기초
- 저장소 만들기
- git 저장소를 만드는 방법 : 기존 프로젝트나 디렉토리를 git 저장소로 만드는 방법 / 다른 서버에 있는 저장소를 복제(clone)하는 방법
- 실습 진행을 위해 폴더 생성 후, git 저장소로 만들자.
  ```
  mkdir git-base-education
  cd git-basic-education
  git init
  ```
  - mkdir : MakeDiRectory
  - cd : Change Directorey
  - init 명령 : .git이란 하위 디렉터리를 만들고, .git 디렉터리에는 저장소에 필요한 뼈대 파일이 들어 있다.
  - 기존 저장소를 clone 하기
    - ```git clone <remote-url>```
    - git 저장소를 복사하고 싶을 때, clone 명령을 실행하면 프로젝트 히스토리를 전부 받아온다.
  - 원격 저장소 추가
    - ```git remote add origin <remote-url>``` : 로컬 저장소를 원격 저장소와 연결하는 방법
    - ```git remote set-url origin <remote-url>``` : 만약, 원격 저장소 url을 변경하고 싶을 때 작성

- 공간 : [Working Directory], [Staging Area], [.git directory (Responsitory)]
  - working directory : 작업 디렉터리
    - 파일을 추가/수정/삭제하는 공간
    - .git 디렉터리를 제외한 프로젝트 디렉터리 내의 모든 공간이 Working Directory이다.

  - staging area : 인덱스
    - 보통 index라고 한다, 저장소와 작업 디렉터리 중간에 있는 공간이고, 준비 영역의 역할을 한다.
    - 파일들이 커밋 되기 전에 모여 있는 임시 저장 공간, 모든 파일은 이 공간을 거쳐 저장소로 옮겨지게 된다.

  - git directory(Repository) (저장소)
    - git이 프로젝트의 메타 데이터와 객체 

