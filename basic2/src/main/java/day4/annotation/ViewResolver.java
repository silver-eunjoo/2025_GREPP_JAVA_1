package day4.annotation;

public class ViewResolver {

    // index
    // /templates/ .html

    public final String prefix = "/templates";
    public final String suffix = ".html";

    public String getTemplatePath(String templateName) {
        if(templateName.startsWith("/") ) {
            return prefix + templateName + suffix;
        } else {
            return prefix + "/" + templateName + suffix;
        }
    }


}
