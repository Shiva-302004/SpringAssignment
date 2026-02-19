package com.gevernova.services;

import com.gevernova.entity.UserDTO;
import com.gevernova.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;
    /**
     * UC1
     * Returns a simple hello message.
     *
     * @return Hello message from BridgeLabz
     */
    public String sayHello() {
        return userRepository.sayHello();
    }

    /**
     * UC2
     * Returns a hello message using a query parameter.
     *
     * @param name Name passed as query parameter
     * @return Personalized hello message
     */
    public String sayHelloQuery(String name) {
        return userRepository.sayHelloQuery(name);
    }

    /**
     * UC3
     * Returns a hello message using a path variable.
     *
     * @param name Name passed as path variable
     * @return Personalized hello message
     */
    public String sayHelloPath(String name) {
        return userRepository.sayHelloPath(name);
    }

    /**
     * UC4
     * Returns a hello message using POST request body data.
     *
     * @param user UserDTO containing firstName and lastName
     * @return Personalized hello message
     */
    public String sayHelloPost(UserDTO user) {
        return userRepository.sayHelloPost(user);
    }

    /**
     * UC5
     * Returns a hello message using PUT request with
     * path variable and query parameter.
     *
     * @param firstName First name passed as path variable
     * @param lastName  Last name passed as query parameter
     * @return Personalized hello message
     */
    public String sayHelloPut(String firstName, String lastName) {
        return userRepository.sayHelloPut(firstName,lastName);
    }
}
