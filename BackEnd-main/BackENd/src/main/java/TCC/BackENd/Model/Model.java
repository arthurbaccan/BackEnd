package TCC.BackENd.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false,unique = true)
    private String nome;

    @Column(nullable = false)
    private int tipo_antibiotico;

    @Column(nullable = false)
    private boolean gram_positiva;

    @Column(nullable = false)
    private boolean gram_negativa;

    @Column(nullable = false)
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
