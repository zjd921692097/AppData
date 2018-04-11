package com.outsource.out.service.Impl;

import com.outsource.out.model.Dog;
import com.outsource.out.service.DogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = OutApplication.class)
@Service
public class DogServiceImplTest {
    @Autowired
    DogService dogService;
    @Test
    public void getDog() throws Exception {
        Dog dog=dogService.getDog(1);
        System.out.println(dog.getName());
    }

}