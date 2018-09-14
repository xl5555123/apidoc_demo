package com.youxin.apidoc.demo.dto;

public class UserDTO {
    private int id;

    private String name;

    public UserDTO() {

    }

    public UserDTO(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
