package com.stackoverflow.answers.services;

import com.stackoverflow.answers.entities.Name;
import com.stackoverflow.answers.repositories.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NameService {
  @Autowired
  private NameRepository nameRepository;

  public void trigger() {
    // System.out.println("Hibernate sequence : " + nameRepository.getHibernateSequence());

    Name newName = new Name("Chris");
    // EntityManager em = emf.createEntityManager();
    // em.getTransaction().begin();;
    // em.persist(newName);
    // em.getTransaction().commit();
    // em.close();
    nameRepository.save(newName);

  }
}
