package com.SpringPractice.springboot.domain.posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter //롬복 어노테이션
//클래스 내 모든 필드의 Getter메서드를 자동 생성
@NoArgsConstructor  //롬복 어노테이션
//기본 생성자 자동 추가
//public Posts(){}와 같은 효과
@Entity //JPA의 어노테이션
//테이블과 링크될 클래스임을 나타낸다.
//기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍(_)으로 테이블 이름을 매칭한다.
//ex) SalesManager.java -> sales_manager table
public class Posts {
    //Entity 메서드에서는 절대 Setter 메서드를 만들지 않는다.
    //대신 해당 필드의 값 변경이 필요하면 명확히 그 목적과 의도를 나타낼 수 있는 메서드를 추가해야만 한다.

    @Id //해당 테이블의 PK필트를 나타낸다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //PK의 생성 규칙을 나타낸다
    //스프링 부트 2.0버전에서는 GenerationType.IDENTITY 옵션을 추가해야만 auto_increment가 된다.
    private Long id;

    @Column(length = 500, nullable = false)
    //테이블의 칼럼을 나타내며 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 칼럼이 된다.
    //사용하는 이유는 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용한다.
    //문자열의 경우 VARCHAR(255)가 기본값인데, 사이즈를 500으로 늘리고 싶거나, 타입을 TEXT로 변경하고 싶거나 등의 경우에 사용된다.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //롬복 어노테이션
    //해당 클래스의 빌더 패턴 클래스를 생성
    //생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
