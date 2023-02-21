POC project with Hexagonal architecture based on multi module maven project, Spring Boot 3.0.2 and JPMS modules.

Domain and application layers without Spring or Hibernate annotations.
There is clean separation between domain, application and infrastracture.

The benefit is that i.e. web-adapter cannot access persistence-adapter or domain directly. It has to use application layer.

**Notes:**

Required Maven compiler plugin >3.8

The order of dependencies in pom.xml does matter

Each module has its own configuration that are imported in spring-config by `spring.config.import` property

In Spring adapters you have to use `opens` directive, because of heavy reflection usage

In spring-config adapter you have to use `proxyBeanMethods = false` in `@Configuration` and `@SpringBootApplication`

**Running the application**
Go to spring-config module and run application.
