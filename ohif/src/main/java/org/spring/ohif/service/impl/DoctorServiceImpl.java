package org.spring.ohif.service.impl;



import org.spring.ohif.dao.DoctorDao;
import org.spring.ohif.domain.Doctor;
import org.spring.ohif.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorDao DoctorDao;

    public List<Doctor> findAllDoctor(){
        return DoctorDao.findAllDoctor();
    }

    public List<Doctor> findDoctorById(Long id) {
        return DoctorDao.findById(id);
    }

   public Doctor findDoctorByUsername(String username){
	   return DoctorDao.findByUsername(username);
   }
    public Long saveDoctor(Doctor Doctor) {
        return DoctorDao.saveDoctor(Doctor);
    }

   
    public Long updateDoctor(Doctor Doctor) {
        return DoctorDao.updateDoctor(Doctor);
    }

    
    public Long deleteDoctor(Long id) {
        return DoctorDao.deleteDoctor(id);
    }

}