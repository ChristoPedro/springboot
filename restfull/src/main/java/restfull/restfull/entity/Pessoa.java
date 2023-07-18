package restfull.restfull.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer id;

    private String nome;

    private String email;

    public Integer getid(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNonme(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
    return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
