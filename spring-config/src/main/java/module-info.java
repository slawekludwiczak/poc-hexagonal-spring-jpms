module hexagon.spring.config {
    requires spring.context;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires hexagon.application;
    requires hexagon.persistence.adapter;
    requires hexagon.spring.web.adapter;

    opens pl.hexagon;
}
