package com.maprangsoft.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "<h1>hello ^__^</h1>";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Object> create(@RequestBody Payload payload) throws Exception {

        // System.out.println( payload.name);//
        // System.out.println( payload.score);//

        // JSONArray the_json_array = payload.getJSONArray("score");

        // System.out.println(payload.score);//

        // for(int i = 0; payload.score.length; i++) {
        // // System.out.println(i + 1);
        // System.out.println(score.get(i));
        // }

        return new ResponseEntity<Object>(payload, HttpStatus.OK);
        // return payload;

    }

    @GetMapping("/show/{id}/{name}")
    public String param(@PathVariable int id, @PathVariable String name) {
        return "show" + id + "/" + name;
    }
}
