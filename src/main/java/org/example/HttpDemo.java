package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class HttpDemo {

    private static  String BASE_URL = "https://jsonplaceholder.typicode.com/posts";

    private HttpClient httpClient;
    HttpDemo(){
        httpClient =HttpClient.newHttpClient() ;
    }

   public String  getAllPosts() throws IOException, InterruptedException {

       HttpRequest httpRequest = HttpRequest.newBuilder()
               .uri(URI.create(BASE_URL))
               .GET()
               .build();
    HttpResponse<String>  response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
    return response.body();
   }


    }


