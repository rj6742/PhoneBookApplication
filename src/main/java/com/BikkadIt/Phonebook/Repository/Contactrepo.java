package com.BikkadIt.Phonebook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIt.Phonebook.Model.Contactt;

@Repository
public interface Contactrepo extends JpaRepository<Contactt, Integer>{

}
