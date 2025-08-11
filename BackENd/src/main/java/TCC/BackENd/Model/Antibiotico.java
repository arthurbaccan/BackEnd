package TCC.BackENd.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Antibiotico")
public class Antibiotico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false,unique = true,name = "nome")
    private String nome;

    @Column(nullable = false,name = "tipo_antibiotico")
    private int tipo_antibiotico;

    @Column(nullable = false,name = "gram_positiva")
    private boolean gram_positiva;

    @Column(nullable = false,name = "gram_negativa")
    private boolean gram_negativa;

    @Column(nullable = false,name = "morfologia")
    private int morfologia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo_antibiotico() {
        return tipo_antibiotico;
    }

    public void setTipo_antibiotico(int tipo_antibiotico) {
        this.tipo_antibiotico = tipo_antibiotico;
    }

    public boolean isGram_positiva() {
        return gram_positiva;
    }

    public void setGram_positiva(boolean gram_positiva) {
        this.gram_positiva = gram_positiva;
    }

    public boolean isGram_negativa() {
        return gram_negativa;
    }

    public void setGram_negativa(boolean gram_negativa) {
        this.gram_negativa = gram_negativa;
    }

    public int getMorfologia() {
        return morfologia;
    }

    public void setMorfologia(int morfologia) {
        this.morfologia = morfologia;
    }
}
