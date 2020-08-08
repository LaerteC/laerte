/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Super;

/**
 *
 * @author laerte
 */
public class Pessoa {
    
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String telefoneCelular;
    
    protected String nomeVisibilidade;
    
    public Pessoa(){
        
    }
    
    
    public Pessoa(String nome,String endereco,String telefone){
        super();
        this.nome=nome;
        this.endereco=endereco;
        this.telefone=telefone;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefoneCelular(){
        return this.telefoneCelular;
    }
    public void setTelefoneCelular(String telefoneCelular){
        this.telefoneCelular=telefoneCelular;
    }
   
    public String obterEtiqueta(){
        
        return endereco;
    }
            
}
