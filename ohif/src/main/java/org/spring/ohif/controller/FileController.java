package org.spring.ohif.controller;



import org.spring.ohif.domain.File;
import org.spring.ohif.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 *
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class FileController {

    @Autowired
    private FileService FileService;

 
    @RequestMapping(value = "/api/OneFile/{fid}", method = RequestMethod.GET)
    public List<File> findOneFile(@PathVariable("fid") Long fid) {
        return FileService.findFileById(fid);
    }

    @CrossOrigin
    @RequestMapping(value = "api/File/{filename}", method = RequestMethod.GET)
    public File findFileByFilename(@PathVariable("filename") String filename) {
    	//System.out.println("get");
        return FileService.findFileByFilename(filename);
    }//add flag method
    
    @CrossOrigin
    @RequestMapping(value = "/File/{username}", method = RequestMethod.GET)
    public List<File> findFileByUsername(@PathVariable("username") String username) {
    	//System.out.println("get");
        return FileService.findFileByUsername(username);
    }//add flag method
    
    
    
    @RequestMapping(value = "/api/File", method = RequestMethod.GET)
    public List<File> findAllFile() {
        return FileService.findAllFile();
    }
   
   
    
    @CrossOrigin
    @RequestMapping(value = "/api/File", method = RequestMethod.PUT)
    public void createFile(@RequestBody File File) {
        FileService.saveFile(File);
    }

    @CrossOrigin
    @RequestMapping(value = "/api/File", method = RequestMethod.POST)
    public void modifyFile(@RequestBody File File) {
        FileService.updateFile(File);
    }

    @RequestMapping(value = "/api/File/{fid}", method = RequestMethod.DELETE)
    public void modifyFile(@PathVariable("fid") Long fid) {
        FileService.deleteFile(fid);
    }
}