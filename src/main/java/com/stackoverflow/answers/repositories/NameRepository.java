package com.stackoverflow.answers.repositories;

import com.stackoverflow.answers.entities.Name;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends CrudRepository<Name, Long> {}
