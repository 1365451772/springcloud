package com.peng.springcloud.config;

import java.util.function.Function;
import org.springframework.cloud.gateway.route.Route.AsyncBuilder;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author sp
 * @Description
 * @create 2021-02-24 10:05
 * @Modified By:
 */
@Configuration
public class GateWayConfig {

  @Bean
  public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
    RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

    routes.route("path_route_atguigu",
        r -> r.path("/guonei")
            .uri("http://news.baidu.com/guonei")).build();


    /*
    public RouteLocatorBuilder.Builder route(String id, Function<PredicateSpec, AsyncBuilder> fn) {
        AsyncBuilder routeBuilder = (AsyncBuilder)fn.apply((new RouteLocatorBuilder.RouteSpec(this)).id(id));
        this.add(routeBuilder);
         return this;
    }
*/

    /*
    *
    *
    @FunctionalInterface
        public interface Function<T, R> {
         R apply(T t);}
    *
    * */
    routes.route("", new Function<PredicateSpec, AsyncBuilder>() {
      @Override
      public AsyncBuilder apply(PredicateSpec predicateSpec) {
        return predicateSpec.path("").uri("");
      }
    }).build();


    //表达式
    routes.route("", predicateSpec -> predicateSpec.path("").uri("")).build();

    return routes.build();
  }
}
