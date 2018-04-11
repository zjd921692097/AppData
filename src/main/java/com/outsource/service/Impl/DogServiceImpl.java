package com.outsource.out.service.Impl;

import com.outsource.out.dao.DogMapper;
import com.outsource.out.model.Dog;
import com.outsource.out.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DogServiceImpl implements DogService {
    @Autowired
    DogMapper dogMapper;

    @Override
    public Dog getDog(int id) {
        Dog dog=dogMapper.selectByPrimaryKey(id);

        return dog;
    }
}
