package br.com.api.produtos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.produtos.models.ProdutoModel;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutoModel, Long> {
}