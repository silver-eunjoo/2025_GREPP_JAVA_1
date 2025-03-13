package day8.s2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HttpSecurity {

    // Configure
    // url 패턴 "/posts/1" -> MEMBER
    // "/admin/index" -> ADMIN

    private List<MvcRequestMatchers> requestMatchers = new ArrayList<>();

    public HttpSecurity requestMatchers(String path) {
//        for (String path : paths) {
//            requestMatchers.add(new MvcRequestMatchers(path));
//        }
        requestMatchers.add(new MvcRequestMatchers(path));
        return this;
    }

    public HttpSecurity hasRole(String role) {
//        MvcRequestMatchers mvcRequestMatchers = requestMatchers.get(
//                requestMatchers.size() - 1
//        );
//        mvcRequestMatchers.setRole(role);
        requestMatchers.get(
                requestMatchers.size() - 1
        ).setRole(role);
        return this;
    }

    // "/**"
    public HttpSecurity anyRequest() {
        requestMatchers.add(new MvcRequestMatchers("/**"));
        return this;
    }

    public HttpSecurity authorizeHttpRequests(Consumer<HttpSecurity> consumer) {
        consumer.accept(this);
        return this;
    }

    public void printConfig() {
        for (MvcRequestMatchers requestMatcher : requestMatchers) {
            System.out.println(requestMatcher);
        }
    }



}
