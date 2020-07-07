package com.tree.community.controller;

import com.tree.community.dto.FileDTO;
import com.tree.community.mapper.AreaMapper;
import com.tree.community.mapper.UserMapper;
import com.tree.community.model.User;
import com.tree.community.model.UserExample;
import com.tree.community.provider.AliyunProvider;
import com.tree.community.provider.UCloudProvider;
import com.tree.community.service.Demo;
import com.tree.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FileController {

    @Autowired
    private UCloudProvider uCloudProvider;

    @Autowired
    UserMapper userMapper;

    @Autowired
    private AliyunProvider aliyunProvider;

    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/file/upload")
    public FileDTO upload(HttpServletRequest request){

        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("editormd-image-file");
        try {
            String fileName = uCloudProvider.upload(file.getInputStream(), file.getContentType(), file.getOriginalFilename());
            FileDTO fileDTO = new FileDTO();
            fileDTO.setSuccess(1);
            fileDTO.setUrl(fileName);
            return fileDTO;
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileDTO fileDTO = new FileDTO();
        fileDTO.setSuccess(1);
        fileDTO.setUrl("/images/wechat.png");
        return fileDTO;
    }

    @ResponseBody
    @RequestMapping(value = "/file/uploadAvatar/")
    public Map<String,Object> uploadAvatar(@RequestParam("file") MultipartFile file,HttpServletRequest request) throws FileNotFoundException {
        File projectPath = new File(ResourceUtils.getURL("classpath:").getPath());
        // 绝对路径=项目路径+自定义路径
        File upload = new File(projectPath.getAbsolutePath(), "static/images/users");
        if (!upload.exists()) {
            upload.mkdirs();
        }

        User user = (User) request.getSession().getAttribute("user");
        Map map = new HashMap();
        try {
            if(file == null){
                map.put("code",-1);
            }else {
//                String result = aliyunProvider.uploadAvatar(file, user);
                String fileName=file.getOriginalFilename();
                System.out.println("dest="+upload.getAbsolutePath()+"\\"+fileName);
                File dest=new File(upload.getAbsolutePath()+"\\"+fileName);
                //文件IO
                file.transferTo(dest);

                String classpath_des = "/images/users/"+fileName;
                user.setAvatarUrl(classpath_des);
                userService.updateUserInfo(user);
                map.put("code",200);

/*                UserExample example = new UserExample();
                example.createCriteria()
                        .andIdEqualTo(user.getId());
                userMapper.updateByExampleSelective(user, example);*/


/*                if(result.equals("success")){
                    map.put("code",200);
                }else {
                    map.put("code",0);
                }*/

            }

        } catch (Exception e) {
            map.put("code",0);
            e.printStackTrace();
        }

        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/file/uploadUser")
    public Map<String,Object> uploadUser(@RequestParam("file") MultipartFile file) throws FileNotFoundException {
        File projectPath = new File(ResourceUtils.getURL("classpath:").getPath());
        // 绝对路径=项目路径+自定义路径
        File upload = new File(projectPath.getAbsolutePath(), "static/batchFile");
        if (!upload.exists()) {
            upload.mkdirs();
        }
        Map map = new HashMap();
        try {
            if(file == null){
                map.put("code",-1);
            }else {
                String fileName=file.getOriginalFilename();
                System.out.println("dest="+upload.getAbsolutePath()+"\\"+fileName);
                File dest=new File(upload.getAbsolutePath()+"\\"+fileName);
                //文件IO
                file.transferTo(dest);
                System.out.println("qifei");
                map.put("code",200);
                Demo.addUser();
            }

        } catch (Exception e) {
            map.put("code",0);
            e.printStackTrace();
        }

        return map;
    }
}
