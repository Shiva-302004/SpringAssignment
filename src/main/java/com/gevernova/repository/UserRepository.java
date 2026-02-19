package com.gevernova.repository;

import com.gevernova.entity.UserDTO;
import org.springframework.stereotype.Repository;

/**
 * Repository class that handles all Hello message operations.
 * This class contains methods corresponding to UC1–UC5
 * of the BridgeLabz Hello REST API assignment.
 */
@Repository
public class UserRepository {

    /**
     * UC1
     * Returns a simple hello message.
     *
     * @return Hello message from BridgeLabz
     */
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    /**
     * UC2
     * Returns a hello message using a query parameter.
     *
     * @param name Name passed as query parameter
     * @return Personalized hello message
     */
    public String sayHelloQuery(String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    /**
     * UC3
     * Returns a hello message using a path variable.
     *
     * @param name Name passed as path variable
     * @return Personalized hello message
     */
    public String sayHelloPath(String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    /**
     * UC4
     * Returns a hello message using POST request body data.
     *
     * @param user UserDTO containing firstName and lastName
     * @return Personalized hello message
     */
    public String sayHelloPost(UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
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
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
