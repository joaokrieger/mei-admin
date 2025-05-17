package br.com.jek.data.dao;

import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;

public class PersonDTO implements Serializable {

    private Long id;

    @NotBlank(message = "The person name cannot be blank")
    private String name;

    @NotBlank(message = "The person CPF cannot be blank")
    private String cpf;

    private String phone;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
