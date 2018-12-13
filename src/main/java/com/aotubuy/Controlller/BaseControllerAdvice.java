package com.aotubuy.Controlller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by luke on 18-5-3.
 */
@ControllerAdvice
public class BaseControllerAdvice {
    @Value("${site.staticUrl}")
    String staticUrl;
    @Value("${site.publicSource}")
    String publicSource;
    @Value("${site.publicDomain}")
    String publicDomain;

    @ModelAttribute(name = "StaticUrl")
    public String staticUrlfunc() {
        return staticUrl;
    }

    @ModelAttribute(name = "publicSource")
    public String getPublicSource() {
        return publicSource;
    }

    @ModelAttribute(name = "publicDomain")
    public String getpublicDomain(){return publicDomain;}

}
