module hexagon.spring.web.adapter {
    requires spring.context;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires hexagon.application;
    exports pl.hexagon.api;
    opens pl.hexagon.api;
}
