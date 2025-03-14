package org.example.repositories;

import org.example.entities.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryContato extends JpaRepository <Contato, Long> {
}
