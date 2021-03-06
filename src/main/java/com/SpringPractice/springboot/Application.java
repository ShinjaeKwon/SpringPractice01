package com.SpringPractice.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication //이 어노테이션으로 스피릉 부트의 자동설정, 스프링 Bean읽기와 생성을 자동으로 설정
//@SpringBootApplication이 있는 위치부터 설정을 읽어 나가기 때문에 이 클래스는 항상 프로젝트의
//최상단에 위치해야 한다.
public class Application { //Application 클래스는 앞으로 만들 프로젝트의 메인 클래스가 된다.
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); //내장 WAS(Web Application Server)를 실행
        //내장 WAS란 별도로 외부에 WAS를 두지 않고 애플리케이션을 실행할 때 내부에서 WAS를 실행하는 것을 이야기한다.
        //이렇게 하면 항상 서버에 톰캣을 설치할 필요가 없게 되고,
        //스트링 부트로 만들어진 Jar파일(실행 가능한 Java 패키징 파일)로 실행하면 된다.
    }
}
