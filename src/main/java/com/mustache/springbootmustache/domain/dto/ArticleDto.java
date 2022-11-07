package com.mustache.springbootmustache.domain.dto;

import com.mustache.springbootmustache.domain.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ArticleDto {
    private Long id;
    private String title;
    private String content;


    public Article toEntity() {
        return new Article(title, content);
    }

    @Override
    public String toString() {
        return "ArticleDto{" +
                "title='" + title + '\'' + ", content='" + content + '\'' + '}';
    }
}
