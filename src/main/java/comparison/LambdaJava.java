// https://www.freecodecamp.org/news/learn-these-4-things-and-working-with-lambda-expressions-b0ab36e0fffc/
package comparison;

import java.util.function.BiConsumer;

public class LambdaJava {

    private static class RequestJava {
    }

    private static class ResponseJava {
    }

//    Functional Interface
    private interface RouteHandlerJava {
        void handler(RequestJava requestJava, ResponseJava responseJava);
    }

    private static void get(String path, RouteHandlerJava handler) {
    }

    private static void getAlt(String path, BiConsumer<RequestJava, ResponseJava> handler) {
    }

    public static void main(String[] args) {

        get("/home", (requestJava, responseJava) -> {} );

        getAlt("/dashboard", ((requestJava, responseJava) -> {}));
    }
}
