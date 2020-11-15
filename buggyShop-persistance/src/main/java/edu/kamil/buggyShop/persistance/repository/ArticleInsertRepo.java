package edu.kamil.buggyShop.persistance.repository;

import edu.kamil.buggyShop.persistance.model.Article;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class ArticleInsertRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertWithEntityManager(Article article) {
        this.entityManager.persist(article);
    }
}
