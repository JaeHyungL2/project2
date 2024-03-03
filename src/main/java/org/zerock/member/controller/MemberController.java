package org.zerock.member.controller;
/* --파트3
이렇게 html로 요청-> 컨트롤러가 받아주니

요청처리해주는 컨트롤러를 만들어보자!- ※ 그러려면 컨트롤러를 - 스프링 bean으로 등록시켜줘야하나봐? -아~ @Controller 어노테이션붙인이유
                                        (스프링-> 스프링부트) 였으니..

    <!--html에서 먼가를 하면, 보통 클라이언트(사용자가 웹브라우저로 뭔가하는걸의미) 요청(Request)이 발생했다 라함 -->
    <!-- 이 Request 요청을 가장먼저 받아주는 부분이 컨트롤러다.. 그래서 쌍이었군..ㅋ 자주나오고.
            이제, dto, vo, dao 이런애들을 알아봐야하는데 이건 부트가아닌 스프링기본내용이려나..ㅋ 건너뛰어도될듯? 나중에채우잨.-->
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {


    //회원가입 페이지 출력 요청
    @GetMapping("haha/2save")  //여기서 member가 이 프로젝트이름인건지, 모르겟네 ㅋ
    //링크를 클릭한다는것은 뭐라고생각하면되냐면, http 에서 get메소드를 사용한 요청임! (PostMapping도 존재)
    //PutMapping, DeleteMapping, PatchMapping, RequestMapping 도 있고.  각각 사용이유가존재.

    //자 이제 회원가입페이지 띄워줘야하니, 메소드를..ㅋ  뭐 restfull한api가 아니니, 대부분 리턴은 string이라고보면됨
    // 단순한 화면리턴방식이라 ㅋ
    public String saveForm() {
        //메소드이름 정해주고..  협업을위한거구나 진짜..ㅋ 공통분모로 팀웍을 누가 잘 조율하고 넓게보느냐..맞네;;ㅋ
        // 새로운걸 잘 해석해서 알려주는것도 필요하고.. <--이게 가~장 한국에서 안된다 생각 ㅋ
        //겟매핑 어노테이션덕분에 주소요청하면 해당 연결딘 메소드가 호출된다는 의미가 부여되어서 작동이되네 한쌍
        return "1save";

        // 이 주소로 요청이오면,
        //흠..컨트롤러를 메소드라봐도되나?ㅋ
    }






}
