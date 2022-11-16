package com.mustache.springbootmustache.domain.entity;

import com.mustache.springbootmustache.domain.dto.ArticleResponseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // JPA에서 객체로 다루겠다는 선언
@NoArgsConstructor
@Getter
public class Article {
    @Id // Primary Key를 의미
    @GeneratedValue // ID를 직접 생성하지 않고 자동으로 생성하도록 한 경우 붙입니다.
    private Long id;

    private String title;
    private String contents;

    public Article(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public static ArticleResponseDto toDto(Article article) {
        return new ArticleResponseDto(
                article.getId(), article.getTitle(), article.getContents());
    }

}
