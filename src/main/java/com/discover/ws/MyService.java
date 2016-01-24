package com.discover.ws;

import javax.jws.WebService;

@WebService
public interface MyService {
    void echo(String message);
}
