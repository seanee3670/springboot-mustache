package com.mustache.springbootmustache.service;

import com.mustache.springbootmustache.domain.dto.ArticleResponseDto;
import com.mustache.springbootmustache.domain.entity.Article;
import com.mustache.springbootmustache.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleResponseDto getArticle(Long id) {
        Optional<Article> findArticle = articleRepository.findById(id);
        Article article = findArticle.get();
        ArticleResponseDto articleResponseDto = Article.toDto(article);
        return articleResponseDto;
    }
}
