package TCC.BackENd.repository;

import TCC.BackENd.Model.Antibiotico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AntibioticoRepository extends JpaRepository<Antibiotico,Integer> {

@Query(value = "select a from Antibiotico a where a.nome like %?1%")
List<Antibiotico> findByNome (String nome);

    @Query(value = "select a from Antibiotico a where a.tipo_antibiotic like %?1%")
    List<Antibiotico> findByTipo (int a);

    @Query(value = "select a from Antibiotico a where a.gram_negativa like %?1%")
    List<Antibiotico> findByGram_neg (boolean a);

    @Query(value = "select a from Antibiotico a where a.gram_positiva like %?1%")
    List<Antibiotico> findByGram_pos (boolean a);

    @Query(value = "select a from Antibiotico a where a.morfologia like %?1%")
    List<Antibiotico> findByMorfologia (int a);


}
