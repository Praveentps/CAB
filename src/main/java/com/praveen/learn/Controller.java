package com.praveen.learn;

import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String registerCabs(HttpEntity<String> httpEntity) {
        String json = httpEntity.getBody();
        System.out.println(json);
        return json;
    }

    @RequestMapping(value = "cabs", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String allocateCabs(HttpEntity<String> httpEntity) {
        String json = httpEntity.getBody();
        System.out.println(json);
        return json;
    }

    @RequestMapping(value = "drop_points", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String dropPoints(HttpEntity<String> httpEntity) {
        String json = httpEntity.getBody();
        System.out.println(json);
        return json;
    }
    @RequestMapping(value = "route_plan", method = RequestMethod.GET)
    @ResponseBody
    public String getPlans(HttpEntity<String> httpEntity) {
        String json = httpEntity.getBody();
        System.out.println(json);
        return "OK";
    }
}
