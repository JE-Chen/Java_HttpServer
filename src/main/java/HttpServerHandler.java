import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class HttpServerHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String request = null;
        if("GET".equals(exchange.getRequestMethod())){

        }else if("POST".equals(exchange)){

        }
    }
    private String handleGetRequest(HttpExchange exchange){

    }
}
