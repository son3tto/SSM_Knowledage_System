package com.tree.community.controller.admin;

import com.tree.community.dto.ResultDTO;
import com.tree.community.model.Question;
import com.tree.community.model.User;
import com.tree.community.service.QuestionService;
import com.tree.community.service.UserService;
import com.tree.community.util.TimeFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class AdminController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private UserService userService;
    @GetMapping("/admin/{action}")
    public String adminLogin(@PathVariable(name = "action")String action, Model model) {
        if ("index".equals(action)) {
            model.addAttribute("section", "index");
        } else if ("essence".equals(action)) {
            model.addAttribute("section", "essence");
        } else if ("notice".equals(action)) {
            Question question = new Question();
            model.addAttribute("question", question);
            model.addAttribute("section", "notice");
        } else if ("user".equals(action)) {
            model.addAttribute("section", "user");
        } else if ("question".equals(action)) {
            model.addAttribute("section", "question");
        } else if("uploadFile".equals(action)){
            model.addAttribute("section", "uploadFile");
        }else if("ask".equals(action)){
            model.addAttribute("section", "ask");
        }else if("share".equals(action)){
            model.addAttribute("section", "share");
        }else if("advice".equals(action)){
            model.addAttribute("section", "advice");
        }else if("comment".equals(action)){
            model.addAttribute("section", "comment");
        }
        return "admin";
    }
    @ResponseBody
    @GetMapping("/admin/getUser")
    public Map<String, Object> getUser(@RequestParam(name = "page",defaultValue = "0")Integer page,
                                           @RequestParam(name = "limit",defaultValue = "5")Integer limit){
        List<User> users = userService.getAllUsers(page-1, limit);
        int count = users.size();
        for(User u : users){
            System.out.println(u.toString());
        }
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",users);
        return map;
    }

    @ResponseBody
    @GetMapping("/admin/getQuestion")
    public Map<String, Object> getQuestion(@RequestParam(name = "page",defaultValue = "0")Integer page,
                        @RequestParam(name = "limit",defaultValue = "5")Integer limit){
        List<Question> essences = questionService.getQuestion(page-1, limit);

        int count = questionService.getQuestionCount();
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",essences);
        return map;
    }

    @ResponseBody
    @GetMapping("/admin/getAllQuestion")
    public Map<String, Object> getAllQuestion(@RequestParam(name = "page",defaultValue = "0")Integer page,
                                           @RequestParam(name = "limit",defaultValue = "5")Integer limit){
        List<Question> essences = questionService.getAllQuestion(page-1, limit);
        for(Question q :essences){
           q.setGmtCreateModified(TimeFormatUtils.GmtformatTime(q.getGmtCreate()));
        }
        int count = essences.size();
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",essences);
        return map;
    }
//    @RequestParam(name = "type")Integer type,
    @ResponseBody
    @GetMapping("/admin/getAsk")
    public  Map<String, Object> getAsk(
                                    @RequestParam(name = "page",defaultValue = "0")Integer page,
                                    @RequestParam(name = "limit",defaultValue = "5")Integer limit){
        List<Question> question = questionService.getQuestionByType(page-1, limit, 1);
        for(Question q:question){
            System.out.println(q.toString());
        }
        int count = question.size();
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",question);
        return map;
    }
    @ResponseBody
    @GetMapping("/admin/getShare")
    public  Map<String, Object> getShare(
            @RequestParam(name = "page",defaultValue = "0")Integer page,
            @RequestParam(name = "limit",defaultValue = "5")Integer limit){
        List<Question> question = questionService.getQuestionByType(page-1, limit, 2);
        for(Question q:question){
            System.out.println(q.toString());
        }
        int count = question.size();
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",question);
        return map;
    }
    @ResponseBody
    @GetMapping("/admin/getAdvice")
    public  Map<String, Object> getAdvice(
            @RequestParam(name = "page",defaultValue = "0")Integer page,
            @RequestParam(name = "limit",defaultValue = "5")Integer limit){
        List<Question> question = questionService.getQuestionByType(page-1, limit, 3);
        for(Question q:question){
            System.out.println(q.toString());
        }
        int count = question.size();
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",question);
        return map;
    }
    @ResponseBody
    @GetMapping("/admin/getComment")
    public  Map<String, Object> getComment(
            @RequestParam(name = "page",defaultValue = "0")Integer page,
            @RequestParam(name = "limit",defaultValue = "5")Integer limit){
        List<Question> question = questionService.getQuestionByType(page-1, limit, 4);
        for(Question q:question){
            System.out.println(q.toString());
        }
        int count = question.size();
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",question);
        return map;
    }


    @ResponseBody
    @RequestMapping(value = "/admin/questionEdit",method = RequestMethod.POST)
    public Object questionEdit(@RequestBody Question question){
        questionService.questionEdit(question);
        return ResultDTO.okOf();
    }

    @ResponseBody
    @RequestMapping(value = "/admin/userEdit",method = RequestMethod.POST)
    public Object userEdit(@RequestBody User user){
        userService.updateUserInfo(user);
        return ResultDTO.okOf();
    }

    @ResponseBody
    @RequestMapping(value = "/admin/notice",method = RequestMethod.POST)
    public Object notice(@RequestBody Question question, HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        question.setCreator(user.getId());
        question.setTag("公告");
        question.setType(7);
        questionService.createOrUpdate(question,request);
        return ResultDTO.okOf();
    }

    @GetMapping("/admin/notice/{id}")
    public String edit(@PathVariable(name = "id")Long id,Model model){
        Question question = questionService.getQuById(id);
        model.addAttribute("question",question);
        model.addAttribute("section","notice");
        return "admin";
    }


}
