# Proxy Server
This implementation uses spring cloud netflix zuul and netflix ribbon load balancing  
Modified to detect msstack services which are registered in zookeeper cluster.

## How to setup
- Clone proxy-server github repository
```
git clone https://github.com/randilfernando/proxy-server
```
- Change configuration
Here is a sample configuration which
```yaml
server:
  port: 4000

spring:
  cloud:
    zookeeper:
      connect-string: localhost:2181

zuul:
  routes:
    order-service:
      path: /order-service/**
      serviceId: order-service
```

## Configuration
1. server.port : port use when starting proxy server
2. spring.cloud.zookeeper.connectionString : zookeeper connection string
3. zuul.routes : routes definitions

## Route definition
1. path : path which route matched to
2. serviceId : service name used when registering msstack application
>Note: check service.name entry in application.yml inside your msstacck service

#### example: order-service route definition  
1. path /order-service/** is mapped to order-service  
2. assume under order-service tag two servers are registered  [localhost:8080, localhost:8081]
3. every request start with /order-service will mapped to one of the above mentioned two services
>Note: ribbon load balancer will select service from above list according to the load balancing algorithm provided

##### example route mappings
1. localhost:4000/order-service/order/create-order -> localhost:8081/orders/create
2. localhost:4000/order-service/order/create-order -> localhost:8082/orders/create