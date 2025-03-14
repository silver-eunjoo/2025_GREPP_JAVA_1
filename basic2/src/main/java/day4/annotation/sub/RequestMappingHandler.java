package day4.annotation.sub;

import day4.annotation.ViewResolver;
import day4.annotation.sub.annotation.GetMapping;
import java.lang.reflect.Method;

public class RequestMappingHandler {

    public static void main(String[] args) throws Exception{

        Request request = new Request();

        ViewResolver viewResolver = new ViewResolver();
        MockController mockController = new MockController();

        Class<? extends MockController> mockControllerClass = mockController.getClass();

        Method[] methods = mockControllerClass.getMethods();

        for(Method method : methods) { // MockController라는 클래스에 있는 모든 메소드 반복문
            if(method.isAnnotationPresent(GetMapping.class)) { // 메소드에 GetMapping이라는 클래스가 있다면
                String templateTarget = method.invoke(mockController).toString(); //어떤 클래스에 있는 메소드를 호출할 거냐 index 반환
                String templatePath = viewResolver.getTemplatePath(templateTarget);
                request.templatePath = templatePath;
                request.targetPath = templateTarget;

                GetMapping annotation = method.getAnnotation(GetMapping.class);
                String httpMethod = annotation.httpMethod();
                request.method = httpMethod;
//                System.out.println("templatePath = " + templatePath);
            }
        }
        System.out.println("request = " + request);
    }
    private static class Request {

        private String method;
        private String templatePath;
        private String targetPath;

        @Override
        public String toString() {
            return "Request{" +
                    "method='" + method + '\'' +
                    ", templatePath='" + templatePath + '\'' +
                    ", targetPath='" + targetPath + '\'' +
                    '}';
        }
    }
}
