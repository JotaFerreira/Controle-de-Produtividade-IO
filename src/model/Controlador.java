package model;

/**
 *
 * @author joao.oliveira
 */
public class Controlador {
    
    private String nome;
    private int matricula;
    private String segmento;
    private String username;
    private String senha;

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getSegmento() {
        return segmento;
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
