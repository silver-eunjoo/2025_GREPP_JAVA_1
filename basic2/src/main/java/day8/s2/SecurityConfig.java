package day8.s2;

public class SecurityConfig {

    public static void main(String[] args) {
        HttpSecurity http = new HttpSecurity();

        // /posts/1 - MEMBER
        // /admin/index - ADMIN

        /*

        http.authorizeHttpRequest(
            a -> a.requestMatchers()
                    .hasRole()
        )

        Spring Security

        */

        http.authorizeHttpRequests(
                auth -> auth.requestMatchers("/posts/**")
                        .hasRole("MEMBER")
                        .requestMatchers("/admin/**")
                        .hasRole("ADMIN")
                        .anyRequest()
                        .hasRole("MEMBER")
        );

        http.printConfig();

//
//        http.requestMatchers("/posts/*")
//                .hasRole("MEMBER")
//                .requestMatchers("/admin/index")
//                .hasRole("ADMIN");
//
//        http.printConfig();

    }
}
