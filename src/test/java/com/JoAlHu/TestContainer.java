package com.JoAlHu;

import net.serenitybdd.jbehave.SerenityStories;
import net.serenitybdd.jbehave.annotations.Metafilter;

import java.time.Duration;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;

import com.github.dockerjava.api.model.*;
import org.testcontainers.containers.wait.strategy.*;

public class TestContainer extends SerenityStories {

  public static final DockerImageName FRONT_IMAGE = DockerImageName.parse("scherringj/angular_front:latest");
  public static final DockerImageName BACK_IMAGE = DockerImageName.parse("scherringj/test-api:latest");

    public TestContainer() {
         GenericContainer<?> front = new GenericContainer<>("scherringj/angular_front:latest")
        .withCreateContainerCmdModifier(cmd -> cmd.withHostConfig(
                new HostConfig().withPortBindings(new PortBinding(Ports.Binding.bindPort(4200), new ExposedPort(80)))

        ));
    
         GenericContainer<?> back = new GenericContainer<>("scherringj/test-api:latest")
         .withExposedPorts(8080)
         .withCreateContainerCmdModifier(cmd -> cmd.withHostConfig(
                 new HostConfig().withPortBindings(new PortBinding(Ports.Binding.bindPort(8080), new ExposedPort(8080)))
         ));
         

         back.start();
         front.start();
    }
}