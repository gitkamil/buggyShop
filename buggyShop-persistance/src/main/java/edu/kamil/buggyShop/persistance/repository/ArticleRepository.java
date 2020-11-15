package edu.kamil.buggyShop.persistance.repository;

import edu.kamil.buggyShop.persistance.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
