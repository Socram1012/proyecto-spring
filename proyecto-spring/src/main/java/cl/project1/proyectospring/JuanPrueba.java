package cl.project1.proyectospring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JuanPrueba {
@RequestMapping("/")
    @ResponseBody
    String Home(){
    return "hola mundo";
}
}
