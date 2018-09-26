package com.youxin.apidoc.demo.dto;

/**
 * @apiDefine UserDTO
 * @apiSuccess {Number} id   Users unique ID.
 * @apiSuccess {String} name   User name.
 * @apiSuccessExample Success-Response:
 *   HTTP/1.1 200 OK
 *   {
 *      "id": 1,
 *      "name": "johny"
 *   }
 */
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
