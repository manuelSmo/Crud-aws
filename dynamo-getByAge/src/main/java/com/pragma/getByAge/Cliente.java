package com.pragma.getByAge;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "cliente")
public class Cliente {


    @DynamoDBHashKey
    private int id;

    @DynamoDBAttribute
    private String nombre;

    @DynamoDBAttribute
    private String apellido;

    @DynamoDBAttribute
    private String tipoId;

    @DynamoDBAttribute
    private int edad;

    @DynamoDBAttribute
    private String ciudad;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellido, String tipoId, int edad, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoId = tipoId;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
