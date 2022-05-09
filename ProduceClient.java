package com.mom;

public class ProduceClient {
    public static void main(String[] args) throws Exception {
        MQClient client = new MQClient();
        client.produce("Hello World4!!");
    }
}