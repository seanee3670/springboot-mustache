package com.mustache.springbootmustache.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ArticleResponseDto {
    private Long id;
    private String title;
    private String content;

    @Builder
    public ArticleResponseDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
