package org.spring.ohif.service;



import org.spring.ohif.domain.Doctor;

import java.util.List;

/**
 * 城市业务逻辑接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface DoctorService {

  
    List<Doctor> findAllDoctor();

    List<Doctor> findDoctorById(Long id);
     
    Doctor findDoctorByUsername(String username);
   
    Long saveDoctor(Doctor Doctor);

   
    Long updateDoctor(Doctor Doctor);

   
    Long deleteDoctor(Long id);
}