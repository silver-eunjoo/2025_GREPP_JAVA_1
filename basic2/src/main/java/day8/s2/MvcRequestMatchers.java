package day8.s2;

import java.util.ArrayList;
import java.util.List;

public class MvcRequestMatchers {

    // url 패턴 "/posts/1" -> MEMBER
    // "/admin/index" -> ADMIN
    private String path;
    private String role;

    public MvcRequestMatchers(String path) {
        this.path = path;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "MvcRequestMatchers{" +
                "path='" + path + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
