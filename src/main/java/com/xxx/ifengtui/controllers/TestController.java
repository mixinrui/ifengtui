package com.xxx.ifengtui.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xxx.ifengtui.common.JsonResultModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;


/**
 * Created by mk .
 */
@RestController
@CrossOrigin
@RequestMapping("/test")
public class TestController {

    /**
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    @RequestMapping(value = "/tsp/list")
    public JsonResultModel queryOrderList() throws InvocationTargetException, IllegalAccessException, JsonProcessingException {
        return JsonResultModel.newJsonResultModel();
    }

}
