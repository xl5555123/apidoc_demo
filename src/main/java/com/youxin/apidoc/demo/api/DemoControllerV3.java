package com.youxin.apidoc.demo.api;

import com.youxin.apidoc.demo.dto.UserDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usersV2")
public class DemoControllerV3 {

    /**
     *
     * @api {post} /usersV3 增加用户
     * @apiName addUser
     * @apiGroup 用户
     *
     * @apiParam {String} id 用户名,长度0-100
     * @apiParamExample {json} Request-Example:
     * {
     *     "name": "johny",
     *     "age": 24
     * }
     *
     * @apiSuccess {Number} id   Users unique ID.
     * @apiSuccess {String} name   User name.
     * @apiSuccess {Number} age   User age.
     *
     * @apiSuccessExample Success-Response:
     *  HTTP/1.1 200 OK
     *  {
     *      "id": 1,
     *      "name": "johny",
     *      "age": 24
     *  }
     *
     * @apiVersion 0.0.3
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public UserDTO addUser(UserDTO userDTO) {
        return userDTO;
    }
}
