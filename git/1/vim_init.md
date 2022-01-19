- 설정하기
```
cd ~
$ vim .vimrc

if has("syntax")
	syntax on
endif

set hlsearch
set nu
set autoindent

colorscheme desert

set ts=4
set sts=4
set cindent
set laststatus=2
set shiftwidth=4
set showmatch
set smartcase
set smarttab
set smartindent
set ruler
set fileencodings=utf8,euc-kr

```

- ```cd ~``` : 홈 디렉터리 이동
- ```$ vim .vimrc``` : .vimrc 파일 생성하여 설정 값 넣기

```
if has("syntax")
	syntax on
endif   : 문법이 존재한다면 하이라이트를 켜기
```
```set hlsearch``` : ?, /로 vim 내의 특정한 문자열을 **검색할 때 매칭되는 문자열을 하이라이트**해주는 기능
  - 위와 같이... 검색 시 한 눈에 잘 보이기 때문에 매우 유용!!
- ```set nu``` : **라인 넘버**가 출력됨

```
set autoindent
set cindent    - 문법에 따라서 자동으로 들여쓰기 해줌
```
- ```colorscheme desert``` : vim 에디터 테마 바꾸기

```
// tab 너비에 관련된 설정 값
set ts=4     - 문서의 '\t' 값을 출력 시 몇 개의 스페이스로 보여줄지에 대한 설정 값
set sts=4    - tab 키를 눌렀을 때 몇 개의 스페이스를 보여줄지에 대한 설정값
set shiftwidth=4   - 자동 들여쓰기를 할 때의 스페이스 설정 값
```

- ```set laststatus=2``` : 마지막 창에 **statusline**을 보여주는 설정 값
  - 0 : 출력 안함
  - 1 : 창이 2개 이상일 때 출력
  - 2 : 항상 출력

- ```set showmatch``` : 닫는 괄호를 입력 시 짝이 되는 **괄호를 하이라이트**를 해줌
```
// 위 설정값은 검색, 탭, 들여쓰기 시 자동으로 설정해 줌
set smartcase    - no automatic ignore case switch
set smarttab     - ts, sts, sw 값을 참조하여, 탭과 백스페이스의 동작을 보조
set smartindent  - 자동 들여쓰기 시 #include와 같은 전처리 구문을 판단하여 들여쓰기를 하지 않는다.
```
- ```set ruler``` : **현재 커서 위치**의 줄 번호와 행 번호를 출력해줌
- ```set fileencodings=utf8,euc-kr```
  - 위 설정을 하면, vim으로 파일을 열 때, 그 파일의 인코딩 방식에 따라 맞춰서 연다.
  - 보통 원도우 메모장에서 작성된 텍스트는 기본값으로 euc-kr 인코딩을 갖고 있을 것임
  - 따라서 윈도우에서 작성된 파일을 vim으로 열면, 리눅스 터미널은 utf-8 형식을 기본적으로 사용하고 있기 때문에, 글씨가 깨질 수 있다.
  - 이런 상황을 방지하기 위해 utf8, euc-kr을 명시해 주면...**인코딩 방식이 달라도 정상적인 출력을 보장**한다.

- 출처 : [heyhyo님의 블로그 -(Vim)vim 설정하기](https://hyoje420.tistory.com/51)
