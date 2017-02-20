package boot.hei.demo.controller;

import boot.hei.demo.prop.HEIProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPropertiesController {

    @Autowired
    private HEIProperties heiProperties;

    @GetMapping("/hei")
    private HEIProperties getHeiProps(){
        return heiProperties;
    }

}
