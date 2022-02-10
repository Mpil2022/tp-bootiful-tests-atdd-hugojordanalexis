package com.JoAlHu;

import net.serenitybdd.jbehave.SerenityStories;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;


public class AcceptanceTestSuite extends SerenityStories {

  public static final DockerImageName FRONT_IMAGE = DockerImageName.parse("scherringj/angular_front:latest");
  public static final DockerImageName BACK_IMAGE = DockerImageName.parse("scherringj/test-api:latest");

    public AcceptanceTestSuite() {
        /*
         System.out.println("----------------------TESTT---------------------------");
         GenericContainer<?> front = new GenericContainer<>(FRONT_IMAGE).withExposedPorts(4200);
         GenericContainer<?> back = new GenericContainer<>(BACK_IMAGE).withExposedPorts(8080);
         */
    }
}
