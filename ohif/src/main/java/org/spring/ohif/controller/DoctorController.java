package org.spring.ohif.controller;



import org.spring.ohif.domain.Doctor;
import org.spring.ohif.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import junit.framework.Test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 *
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class DoctorController {

    @Autowired
    private DoctorService DoctorService;

 
    @RequestMapping(value = "/api/Doctor/{id}", method = RequestMethod.GET)
    public List<Doctor> findOneDoctor(@PathVariable("id") Long id) {
        return DoctorService.findDoctorById(id);
    }

    @CrossOrigin
    @RequestMapping(value = "/Doctor/{username}", method = RequestMethod.GET)
    public Doctor findDoctor(@PathVariable("username") String username) {
    	System.out.println("get");
        return DoctorService.findDoctorByUsername(username);
    }//add flag method
    @RequestMapping(value = "/api/Doctor", method = RequestMethod.GET)
    public List<Doctor> findAllDoctor() {
        return DoctorService.findAllDoctor();
    }
    @CrossOrigin
    @RequestMapping(value = "upload",method=RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) 
    {
    	String filePath="D:\\JAVA\\ohif\\Revit\\";
        if (file.isEmpty()) {
            return "文件为空";
        }
        // 获取文件名
       String fileName = file.getOriginalFilename();

        // 获取文件的后缀名

//        String suffixName = fileName.substring(fileName.lastIndexOf(".")); logger.info("上传的后缀名为:" + suffixName);
//        String suffixName = fileName.substring(fileName.lastIndexOf(".")); logger.info("上传的后缀名为:" + suffixName);
        // 文件上传路径
//        String filePath = modelpath;
        // 解决中文问题,liunx 下中文路径,图片显示问题
        //fileName = UUID.randomUUID() + suffixName;
        File dest = new File(filePath + fileName);
        // 检测是否存在目录
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
//            file.transferTo(dest); return "上传成功";
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
            out.write(file.getBytes());
            out.flush();
            out.close();
            return fileName;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";

    }
    
    
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String Test_try()
    {
    	return "HelloWOrld";
    }
    
    
    @CrossOrigin
    @RequestMapping(value = "/api/Doctor", method = RequestMethod.PUT)
    public void createDoctor(@RequestBody Doctor Doctor) {
        DoctorService.saveDoctor(Doctor);
    }

    @CrossOrigin
    @RequestMapping(value = "/api/Doctor", method = RequestMethod.POST)
    public void modifyDoctor(@RequestBody Doctor Doctor) {
        DoctorService.updateDoctor(Doctor);
    }

    @RequestMapping(value = "/api/Doctor/{id}", method = RequestMethod.DELETE)
    public void modifyDoctor(@PathVariable("id") Long id) {
        DoctorService.deleteDoctor(id);
    }
}