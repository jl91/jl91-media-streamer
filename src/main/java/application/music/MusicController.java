package application.music;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {

    @RequestMapping("/")
    public String index(){
        return "Hello From  Music";
    }

}
