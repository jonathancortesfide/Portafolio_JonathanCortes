package TiendaJonathanCortes.demo.dao;

import TiendaJonathanCortes.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria,Long> {
    
}