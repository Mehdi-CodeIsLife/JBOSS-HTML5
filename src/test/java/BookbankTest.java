import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;

import rt.beans.Bookbank;


public class BookbankTest {

	@Test
	public void test() {
		EntityManager em = Persistence.createEntityManagerFactory("JpaTest1").createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		t.begin();
		Bookbank book = new Bookbank();
		book.setTitle("test title");
		book.setAuthor("test author");
		book.setPrice(123.567);
		
		em.persist(book);
		t.commit();
		
		t.begin();
		Bookbank resultBook = (Bookbank) em.createQuery("select b from Bookbank b order by b.id asc").setMaxResults(1).getSingleResult();
		
		System.out.println("Query result:");
		System.out.println("Id: " + resultBook.getId() 
				+ ", title: "+ resultBook.getTitle()
				+ ", author: " + resultBook.getAuthor()
				+ ", price: " + resultBook.getPrice());
		
		t.commit();
		
		em.close();
	}

}
