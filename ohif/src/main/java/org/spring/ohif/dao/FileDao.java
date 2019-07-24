package org.spring.ohif.dao;



import org.apache.ibatis.annotations.Param;
import org.spring.ohif.domain.File;

import java.util.List;

/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface FileDao {

    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<File> findAllFile();

    /**
     * 根据城市 ID，获取城市信息
     *
     * @param id
     * @return
     */
    List<File> findById(@Param("fid") Long fid);
    
    File findFileByFilename(@Param("filename") String filename);
    List<File> findFileByUsername(@Param("username") String username);
    Long saveFile(File File);

    Long updateFile(File File);

    Long deleteFile(Long fid);
}