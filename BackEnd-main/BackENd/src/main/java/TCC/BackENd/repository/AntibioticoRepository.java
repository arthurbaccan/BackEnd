package TCC.BackENd.repository;

import TCC.BackENd.Model.Antibiotico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AntibioticoRepository extends JpaRepository<Antibiotico,Integer> {

@Query(value = "select a from Antibiotico a where a.nome like %?1%")
List<Antibiotico> findByNome (String nome);

    @Query(value = "select a from Antibiotico a where a.tipo_antibiotico = ?1")
    List<Antibiotico> findByTipo (int tipo_antibiotico);

    @Query(value = "select a from Antibiotico a where a.gram_negativa = ?1")
    List<Antibiotico> findByGram_neg (boolean gram_negativa);

    @Query(value = "select a from Antibiotico a where a.gram_positiva = ?1")
    List<Antibiotico> findByGram_pos (boolean gram_positiva);

    @Query(value = "select a from Antibiotico a where a.morfologia = ?1")
    List<Antibiotico> findByMorfologia (int morfologia);


}
