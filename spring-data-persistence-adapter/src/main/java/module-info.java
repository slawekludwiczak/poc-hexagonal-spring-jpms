module hexagon.persistence.adapter {
    requires hexagon.domain;
    requires hexagon.application;

    requires spring.context;
    requires spring.data.jpa;
    requires spring.data.commons;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;

    exports pl.hexagon.adapter.persistence to hexagon.spring.config;
    opens pl.hexagon.adapter.persistence;
}
