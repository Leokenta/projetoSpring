package org.example.repositories;

import org.example.entities.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryFornecedor extends JpaRepository<Fornecedor, Long> {
}
