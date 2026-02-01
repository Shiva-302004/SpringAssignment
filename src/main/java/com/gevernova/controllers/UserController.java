package com.gevernova.controllers;

import com.gevernova.entity.UserDTO;
import com.gevernova.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServices userServices;


    @GetMapping
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>(userServices.sayHello(), HttpStatus.OK);
    }

    // UC 2
    // curl localhost:8080/hello/query?name=Mark -w "\n"
    @GetMapping("/query")
    public ResponseEntity<String> sayHelloQuery(@RequestParam String name) {
        return new ResponseEntity<>(userServices.sayHelloQuery(name), HttpStatus.OK);
    }

    // UC 3
    // curl localhost:8080/hello/param/Mark -w "\n"
    @GetMapping("/param/{name}")
    public ResponseEntity<String> sayHelloPath(@PathVariable String name) {
        return new ResponseEntity<>(userServices.sayHelloPath(name), HttpStatus.OK);
    }

    // UC 4
    // curl -X POST -H "Content-Type: application/json" \
    // -d '{"firstName":"Mark","lastName":"Taylor"}' \
    // http://localhost:8080/hello/post -w "\n"
    @PostMapping("/post")
    public ResponseEntity<String> sayHelloPost(@RequestBody UserDTO user) {
        return new ResponseEntity<>(userServices.sayHelloPost(user), HttpStatus.OK);
    }

    // UC 5
    // curl -X PUT localhost:8080/hello/put/Mark?lastName=Taylor -w "\n"
    @PutMapping("/put/{firstName}")
    public ResponseEntity<String> sayHelloPut(@PathVariable String firstName,
                              @RequestParam String lastName) {
        return new ResponseEntity<>(userServices.sayHelloPut(firstName,lastName)
                , HttpStatus.OK);
    }
}
