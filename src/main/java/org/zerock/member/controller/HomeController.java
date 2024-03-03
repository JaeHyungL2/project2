package org.zerock.member.controller;

//패키지 만들고, 클래스만들어주고,

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  //라는 어노테이션을 추가해주자.
public class HomeController {
    //보통 웹사이트가면 기본페이지 열리는걸 구현해볼것.
    // : 다른말로, 기본페이지를 요청하는 메소드를 정의한다고함.

    //기본주소를 표현해주기위한,
    @GetMapping("/") //이런 주소요청이오면 메소드가 호출된다는 뜻.
    public String jh() {  //string이라고해주는것도, html파일이 문자로나오니까인가?
        return "jj8"; //이코드는 templates의 파일과 연결됨.
    }
    //이게 가장 기본요청이군..ㅋ 오면은 인덱스라는 html파일을
    //브라우저에 띄우는 코드는 이렇게짜는거고.
    //이렇게 get요청시, 매핑해주는거지 메소드호출로까지..
//이런게 스프링프레임워크를 짜놓은 덕분ㅋ 쉽게되니 틀은만들어졌다.]
    //이 위에서 놀아라!!., 이거거든.. 거문고소리로가야하네..
}


//클래스 안에 메소드..참.ㅋ

//이렇게 컨트롤러와 html연결은 뷰의 리졸브가하는데, 브라우저로 접속해봐야함.ㅋ결과는
//스프링은 자동으로 브라우저가 실행되진않고, localhost포트번호로 접속해줘야함.
//이런과정은 현재 내 pc가 서버가된거임 ㅋ
//현재 도메인주소가있는것도아니라 localhost포트번호(8080)으로.
//어플리얌 파일에서 포트번호도 잡아놨으니.


