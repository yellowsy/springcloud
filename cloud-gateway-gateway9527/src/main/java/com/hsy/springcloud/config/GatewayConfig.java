package com.hsy.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_baidu",
                r -> r.path("/guonei")  //lambda表达式(有输入有返回)，输入地址localhost:9527/guonei 定向到百度
                        .uri("http://news.baidu.com/guonei")).build();

        return routes.build();
    }
}
