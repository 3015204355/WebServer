package org.spring.ohif.dao;



import org.apache.ibatis.annotations.Param;
import org.spring.ohif.domain.Doctor;

import java.util.List;

/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface DoctorDao {

    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<Doctor> findAllDoctor();

    /**
     * 根据城市 ID，获取城市信息
     *
     * @param id
     * @return
     */
    List<Doctor> findById(@Param("id") Long id);
    
    Doctor findByUsername(@Param("username") String username);
    Long saveDoctor(Doctor Doctor);

    Long updateDoctor(Doctor Doctor);

    Long deleteDoctor(Long id);
}