package com.mustache.springbootmustache.domain.dto;

import lombok.Getter;

@Getter
public class ArticleDto {
    private Long id;
    private String title;
    private String content;

    public ArticleDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleDto{" +
                "title='" + title + '\'' + ", content='" + content + '\'' + '}';
    }
}
