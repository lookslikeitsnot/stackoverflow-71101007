package com.stackoverflow.answers.repositories;

import com.stackoverflow.answers.entities.Name;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends CrudRepository<Name, Long> {
  // @Query(value = "SELECT CURRENT VALUE FOR hibernate_sequence", nativeQuery = true)
  // Long getHibernateSequence();
}
