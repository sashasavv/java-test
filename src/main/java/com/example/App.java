package com.example;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class App {
    public static void main(String[] args) {
        try {
            int port = 8000;
            HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
            System.out.println("Server started on port " + port);

            // Set up the HTTP handler to handle requests
            server.createContext("/", new PageHandler());

            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class PageHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String currentDir = System.getProperty("user.dir");
            String filePath = currentDir + "/src/main/resources/QE-index.html";
            Path path = Paths.get(filePath);
            byte[] data = Files.readAllBytes(path);
            exchange.sendResponseHeaders(200, data.length);
            exchange.getResponseHeaders().set("Content-Type", "text/html");
            exchange.getResponseBody().write(data);
            exchange.close();
        }
    }
}
