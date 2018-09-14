package com.youxin.apidoc.demo.api;

import com.youxin.apidoc.demo.dto.UserDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usersV2")
public class DemoControllerV2 {
    /**
     * @apiDefine UserNotFoundError
     *
     * @apiError UserNotFound 用户id未找到
     *
     * @apiErrorExample Error-Response:
     *     HTTP/1.1 404 Not Found
     *     {
     *       "error": "UserNotFound"
     *     }
     */


    /**
     *
     * @api {get} /usersV2/:id 根据id请求用户信息
     * @apiName getUser
     * @apiGroup 用户
     *
     * @apiParam {Number} id Users unique ID.
     *
     * @apiSuccess {Number} id   Users unique ID.
     * @apiSuccess {String} name   User name.
     *
     * @apiSuccessExample Success-Response:
     *  HTTP/1.1 200 OK
     *  {
     *      "id": 1,
     *      "name": "johny"
     *  }
     *
     * @apiUse UserNotFoundError
     *
     * @apiVersion 2.0.0
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserDTO getUser(@PathVariable int id) {
        return new UserDTO(id);
    }

    /**
     *
     * @api {post} /usersV2 增加用户
     * @apiName addUser
     * @apiGroup 用户
     *
     * @apiParam {String} id 用户名,长度0-100
     * @apiParamExample {json} Request-Example:
     * {
     *     "name": "johny"
     * }
     *
     * @apiSuccess {Number} id   Users unique ID.
     * @apiSuccess {String} name   User name.
     *
     * @apiSuccessExample Success-Response:
     *  HTTP/1.1 200 OK
     *  {
     *      "id": 1,
     *      "name": "johny"
     *  }
     *
     * @apiVersion 2.0.0
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public UserDTO addUser(UserDTO userDTO) {
        return userDTO;
    }

    /**
     *
     * @api {post} /usersV2/:id 修改用户
     * @apiName addUser
     * @apiGroup 用户
     *
     * @apiParam {String} [name] 新的用户名，长度0-100
     * @apiParam {Number} [id] 待修改的用户id
     * @apiParamExample {json} Request-Example:
     *  url：/users/1
     *  请求体:
     *  {
     *      "name" : "johny1"
     *  }
     *
     * @apiSuccess {Number} [id]   新的用户id
     * @apiSuccess {String} [name]   新的用户名
     *
     * @apiSuccessExample Success-Response:
     *  HTTP/1.1 200 OK
     *  {
     *      "id": 1,
     *      "name": "johny1"
     *  }
     *
     * @apiUse UserNotFoundError
     *
     * @apiVersion 2.0.0
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public UserDTO updateUser(UserDTO userDTO, @PathVariable int id) {
        userDTO.setId(id);
        return userDTO;
    }

    /**
     *
     * @api {post} /usersV2/:id 删除用户
     * @apiName removeUser
     * @apiGroup 用户
     *
     * @apiParam {Number} [id] 待删除用户Id
     *
     * @apiSuccessExample Success-Response:
     *  HTTP/1.1 200 OK
     *
     * @apiUse UserNotFoundError
     *
     * @apiVersion 2.0.0
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeUser(@PathVariable int id) {

    }
}
