package jpabook.jpashop.service;


import jakarta.persistence.EntityManager;
import jpabook.jpashop.domain.item.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class ItemUpdateTest {
    @Autowired
    EntityManager em;


    @Test
    public void updateTest() throws Exception {
        Book book = em.find(Book.class, 1L);

        book.setName("asdasdasdA");

        //변경 감지 dirty checking
    }
}
