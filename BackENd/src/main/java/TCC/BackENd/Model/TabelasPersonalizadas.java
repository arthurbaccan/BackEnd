package TCC.BackENd.Model;

import jakarta.persistence.*;

@Entity
@Table(name="TabelaPersonalizada")
public class TabelasPersonalizadas {

    public int getId() {
        return id;
    }

    public int getIdAnt() {
        return idAnt;
    }

    public int getIdUSuario() {
        return idUSuario;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String getNomeTabela() {
        return nomeTabela;
    }

    @Column(nullable = false,name = "idAntibiotico")
    private int idAnt;

    @Column(nullable = false,name="idUsuario")
    private int idUSuario;

    @Column(nullable = false,name="nomeTabela")
    private String nomeTabela;

    public void setId(int id) {
        this.id = id;
    }

    public void setIdAnt(int idAnt) {
        this.idAnt = idAnt;
    }

    public void setIdUSuario(int idUSuario) {
        this.idUSuario = idUSuario;
    }

    public void setNomeTabela(String nomeTabela) {
        this.nomeTabela = nomeTabela;
    }
}
