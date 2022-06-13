package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

//CrudRepository 사용 시 Entity 값과 대표 타입 넣기
public interface ArticleRepository extends CrudRepository<Article, Long> {

}
