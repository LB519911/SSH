package cn.liubiao.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


@Controller
@Scope("prototype")
public class PageAction extends ActionSupport {

    public String login() throws Exception {
        return "login";
    }
}
