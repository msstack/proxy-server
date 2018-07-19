package com.grydtech.msstack.core.serviceregistry;

import org.springframework.cloud.zookeeper.discovery.ZookeeperInstance;

import java.util.Map;

@SuppressWarnings("all")
public class Member extends ZookeeperInstance {

    private String host;
    private Integer port;

    private Member() {
        super(null, null, null);
    }

    public Member(String id, String name, String host, Integer port, Map<String, String> metadata) {
        super(id, name, metadata);
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public Integer getPort() {
        return port;
    }
}
