package org.spring.ohif.service;



import org.spring.ohif.domain.File;

import java.util.List;

/**
 * 城市业务逻辑接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface FileService {

  
    List<File> findAllFile();

    List<File> findFileById(Long fid);
     
    File findFileByFilename(String filename);
    List<File> findFileByUsername(String username);
   
    Long saveFile(File File);

   
    Long updateFile(File File);

   
    Long deleteFile(Long fid);
}