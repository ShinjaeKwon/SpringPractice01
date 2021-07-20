package com.SpringPractice.springboot.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 준다.
//과거 @ResponseBody를 각 메서드마다 선언했던 것을 한번에 사용할 수 있게 해준 것이다.
public class HelloController {

    @GetMapping
    //HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 준다.
    //과거 @RequestMapping으로 사용되었다. 이 프로젝트는 /hello로 요청이 오면 문자열 hello를 반환하는 기능을 가지게 된다.
    public String hello(){
        return "hello";
    }

}