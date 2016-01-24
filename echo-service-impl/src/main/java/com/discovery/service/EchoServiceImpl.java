package com.discovery.service;

import com.discovery.service.ifc.EchoService;

public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String message) {
        return "### Echo: " + message;
    }
}
