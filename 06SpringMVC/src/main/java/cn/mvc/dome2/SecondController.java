package cn.mvc.dome2;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by MESGOD纯贱 on 2018/3/21.
 */
public class SecondController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView ma = new ModelAndView();
        ma.setViewName("index");
        return ma;
    }
}
