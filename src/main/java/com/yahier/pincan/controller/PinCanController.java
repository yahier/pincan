package com.yahier.pincan.controller;

import com.yahier.pincan.table.Pincan;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pincan")
public class PinCanController extends BaseController {

    //发起
    @RequestMapping(value = "/post", produces = "application/json;charset=UTF-8")
    public @ResponseBody
    Pincan post(Pincan p) {
        Pincan pincan = new Pincan();
        pincan.flavor = p.getFlavor();
        print("flavor；" + pincan.flavor);//之前Pincan类一直没有写setX getX导致数据不能获取到
        return pincan;
    }

    //加入
    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String join(@RequestParam("pincanId") String pincanId, @RequestParam("userId") String userId) {
        return pincanId + ":" + userId;
    }

    //查看详情
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public void detail(@RequestParam("pincanId") String pincanId) {
        //获取 pincan 详情
        //再获取 pincanMatch

    }

}
