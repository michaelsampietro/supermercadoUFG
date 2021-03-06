package br.com.Pessoa;

public class PessoaTO {

    private int    id;
    private String nome;
    private String telefone;
    private String sexo;
    private String cargo;

    public PessoaTO(int id, String nome, String telefone, String sexo, String cargo) {
        this.id       = id;
        this.nome     = nome;
        this.telefone = telefone;
        this.sexo     = sexo;
        this.cargo    = cargo;
    }

    
    /*
     * GETTERS AND SETTERS
     */
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
