package com.pragma.getByAge;

public class Request {


    private int id;

    private int edad;

    private String httpMethod;

    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
