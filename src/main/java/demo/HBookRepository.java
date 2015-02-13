package demo;

import java.util.List;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface HBookRepository extends JpaRepository<HBook, Integer> {

	List<HBook> findByAuthor(String author);
	
	@Query(value = "select * from Book b where b.author like %?1%", nativeQuery = true)
	List<HBook> findByAuthorLike(String author);
	
	@Query("select b from HBook b where b.author like %:author% and b.publisher like %:publisher% ")
	List<HBook> findByAuthorAndPublisher(@Param("author")String author, @Param("publisher")String publisher);
	
	@Modifying
	@Query("update HBook b set b.year = ?1 where b.publisher = ?2")
	List<HBook> setYearForPublisher(int year, String publsiher);
}
