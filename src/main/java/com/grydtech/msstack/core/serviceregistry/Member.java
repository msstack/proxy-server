package com.grydtech.msstack.core.serviceregistry;

import org.springframework.cloud.zookeeper.discovery.ZookeeperInstance;

import java.util.Map;

public class Member extends ZookeeperInstance {

    private Member() {
        super(null, null, null);
    }

    public Member(String id, String name, Map<String, String> metadata) {
        super(id, name, metadata);
    }
}
