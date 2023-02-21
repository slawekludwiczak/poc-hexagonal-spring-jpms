module hexagon.application {
    requires hexagon.domain;

    exports pl.hexagon.application.port.in to hexagon.spring.config, hexagon.spring.web.adapter;
    exports pl.hexagon.application.port.out to hexagon.persistence.adapter, hexagon.spring.config;
}
