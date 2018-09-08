package Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("hi")
public class ExampleController {





    @RequestMapping("/Example/{id}")
    @ResponseBody
    public   String asd(@PathVariable("id") Integer id){




        return id.toString();
    }



    @RequestMapping("/upload")
    @ResponseBody
    public  String upload(HttpServletRequest request, @RequestParam("file") MultipartFile file, Model model){
        return file.getOriginalFilename();
//        String path = request.getServletContext().getRealPath("/images/");
    }


}
