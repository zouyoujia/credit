package com.smm;

import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        port(8080);

        get("/credit", ((request, response) -> {
            return "asdfzxcvzasdf";
        }));
    }
}
