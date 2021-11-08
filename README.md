# Creating a custom spring boot starter

## Introduction

This is an example about how create a spring boot starter. Our example will calculate 
the total time in process a method. 

If you want more information about generate spring boot starters you can take a 
look into: https://refactorizando.com/creacion-starter-spring-boot

## How does it work?

To use the starter you have to add it in your pom.xml, after generate a dependency.

        <dependency>
            <groupId>com.refactorizando.example</groupId>
            <artifactId>spring-boot-starter-time-logging</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>

So to see the total time you can run this url: localhost:8080


## How does it run

To run it you have to generate the dependency, add it, and run the project as a normal 
Spring Boot project. From the project with the dependency.

    mvn spring-boot:run
