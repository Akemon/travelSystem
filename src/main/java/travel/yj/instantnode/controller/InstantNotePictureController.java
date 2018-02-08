package travel.yj.instantnode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import travel.yj.instantnode.service.InstantNotePictureService;

/**
 * @author 杨景
 */
@Controller
@RequestMapping("instantNotePicture")
public class InstantNotePictureController {

    @Autowired
    private InstantNotePictureService instantNotePictureService;
    @RequestMapping(value="downloadPicture",method = RequestMethod.GET,produces="text/html;charset=UTF-8")
    @ResponseBody
    public ResponseEntity<byte[]> downloadPicture(Integer instantNotePictureId){
        return instantNotePictureService.downloadPicture(instantNotePictureId);
    }

}
