package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Departement;
// COOMMIT TEST
@Repository
public interface DepartementRepository extends CrudRepository<Departement, Integer>{

}
