# Git & GitHub 이란?

- Git -버전 관리 시스템(개발 히스토리)

  - 지금까지 어떻게 개발을 해왔는지 확인이 가능하고, 원하는 파일로 다시 롤백이 가능함

  - 하지만 해당 파일이나, 저장해두고 있는 컴퓨터를 사용 못 하게 되었을 때
    복구할 수 있는 방법이 없음

  - 이를 GitHub라는 서버에 올려두면 다시 히스토리 그대로 복구 가능

$\therefore$ GitHub란 개발 버전 히스토리를 서버에 원격으로 가다 보관할 수 있는 보관 장소

# 기본 사용법(github)

## 기본셋팅

먼저 GitHub에 가입하기 위해 <a href="https://github.com">github.com</a> 해당 사이트에 방문해 회원 가입을 해준다.(이때 회원 가입 시 입력하는 칸에 이메일이 있는데 기억해두기, 또 이메일은 나중에 다시 setting에 들어가면 바꿀 수 있다.)
이메일 인증까지 끝내면
![git1](screenshot/git1.PNG)
해당 페이지가 나오는데, 왼쪽부터 저장소 생성, 오거니제이션 생성, GitHub 학습 이다.

그 다음으로 Git이라는 인스톨러를 사용해야 하기 때문에 각 컴퓨터에 맞는 os를 설치해 줘야한다.

[window에서 Git 설치및 셋팅]

https://git-scm.com/ Git 공식 웹사이트에 접속해 Git을 다운로드한다.

다운이 끝나고 환경설정을 위해 Git Bash를 실행시켜 준다.
![git2](screenshot/git2.png)
실행을 하면 나오는 터미널에
`git config --global user.name "사용자 이름"`
`git config --global user.email github가입 시 사용한 이메일주소`
해당 코드를 입력해주고, `git config --list`를 입력해 'user.name','user.email'를 확인해봐서 방금 입력한 게 입력되어있으면 성공이다.
![git5](screenshot/git5.PNG)

## Github에 파일 업로드하기

먼저 업로드하기 전 먼저 생성한 Repository로 이동하여 HTTPS에 해당하는 url을 복사해줍니다.
![git3](screenshot/git3.png)

이제 업로드하려고 하는 파일 위치에서 Git Bashf를 실행하고 다음 코드를 입력한다.

1. `git init`:맨 처음에 프로젝트를 올릴때 꼭 해줘야함 파일 업로드를 하고 다음 파일을 올릴땐 사용X
   이것을 입력하면 해당 디렉터리 안에 .git이라는 폴더가 생성된다. (숨김항목을 체크해야 보임)
   ![git4](screenshot/git4.png)

2. `git add `:어떤 파일을 추가할지 찾아봄(마지막에 .을 추가하면 해당 디렉토리에 있는 파일 전부를 추가함)

3. `git commit -m "파일이름"`: 파일 히스토리를 만들어줌(수정 계속 가능)

4. `git remote add origin 아까 복사한 url 붙여넣기`
   입력후 `git remote -v`를 입력해 github에 자신이 만든 저장소 이름이 나오면 성공

5. `git push origin main`: 아까 `git commit -m "파일이름"` 했던 파일들을 github에 업로드를 시작함

- tip) 다음 업로드부터는 2,3,5번만 하면 업로드 됨

- tip) 회사에선 `git push origin main` 대신 `git checkout -b 원하는 이름`를 사용 해당 코드를 입력하면 main의 파일에는 어떠한 영향을 미치지 않고, "원하는 이름"이라는 저장공간이 따로 생겨 최고 관리자가 검토후 수락을 해야 main의 파일에 해당 파일이 저장됨
  <br></br>

## Visual Studio Code에서 git 사용하기

명령 프로토콜에서 사용할 폴더위치를 `cd 파일이름`를 사용해 폴더위치를 이동한다. 해당 폴더로 이동했으면 `code .`를 입력하면 Visual Studio Code가 열리면서 사용할수 있고 해당 터미널에서 git을 사용할수있다.

![git6](screenshot/git6.png)
![git7](screenshot/git7.png)

- GitHub Desktop를 사용해 더욱 편리하게 사용할수있다.

  <a href="https://desktop.github.com/">GitHub Desktop</a> 해당 링크에 들어가 GitHub Desktop를 다운 받고 일전에 가입한 계정으로 로그인 하면 된다.

  자세한 방법은 <a href="https://youtu.be/0YsMEPxi_wc?si=N-JTIvSxAKd4AKCo&t=146">CODE GEAR - 프로그래밍</a> 참고

## GitHub에 있는 파일 가지고 오기

![git8](screenshot/git8.png)
해당 사진처럼 가지고올 github파일에 접속한 후 Code에서 해당 동그라미 표시를 누르면 복사가 된다. 이걸 컴퓨터 명령 프로토콜을 열어
`git clone 복사한거 붙여넣기`를 사용하면 github에 있는 파일이 다운로드 된다.
(파일은 프로토콜의 위치에 저장된다. ex C:\Users\sklee\Desktop 이면 바탕화면에 파일이 저장됨)

회사에서 주로 사용법은 아래 링크를 참조

<a href="https://youtu.be/cwC8t9dno2s?t=227">youtube『코딩알려주는누나』</a>
<br></br>

# 오류및 해결방안

git을 사용해 gihub에 파일을 업로드할 때
`git commit -m "이름" `해당 코드에서 `-m`을 빼먹음으로써
.git 파일 안에 있는 index.lock 파일에 오류가 발생했음
그럼으로 인해 아래와 같은 사진이 출력됨
![error1](screenshot/error1.PNG)
해당 오류가 나오면 `git commit -m "~~"`및 `git push origin main`명령어가 실행되지 X

- [해결 방법]

1. 문제가 생긴 Git 저장소 폴더 상단으로 이동

2. 해당 폴더를 루트로 하여 Terminal 및 컨맨트 툴을 이용해 `cd "git 저장소 폴더 경로"` 이 명령어를 통해 해당 폴더로 이동 후
   (.git 파일이 있는 곳에서 터미널을 여는것이 더 편함)

3. 문제가 되는 index.lock 파일을 `rm -f ./.git/index.lock`를 통해 삭제

4. 다시 `commit`및 `push`명령어를 실행하면 해결되어있음
