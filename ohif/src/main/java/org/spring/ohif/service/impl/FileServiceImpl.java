package org.spring.ohif.service.impl;



import org.spring.ohif.dao.FileDao;
import org.spring.ohif.domain.File;
import org.spring.ohif.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileDao FileDao;

    public List<File> findAllFile(){
        return FileDao.findAllFile();
    }

    public List<File> findFileById(Long fid) {
        return FileDao.findById(fid);
    }
    public File findFileByFilename(String filename){
 	   return FileDao.findFileByFilename(filename);
    }
    
    
   public List<File> findFileByUsername(String username){
	   return FileDao.findFileByUsername(username);
   }
    public Long saveFile(File File) {
        return FileDao.saveFile(File);
    }

   
    public Long updateFile(File File) {
        return FileDao.updateFile(File);
    }

    
    public Long deleteFile(Long id) {
        return FileDao.deleteFile(id);
    }

}