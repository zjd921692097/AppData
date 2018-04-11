package com.outsource.out.service;


import com.outsource.out.model.Dog;
import org.springframework.stereotype.Service;

@Service
public interface DogService {

    /**
     * 创 建 人：周骏迪
     * 日    期：20180124
     * 修 改 人：
     * 日   期：
     * 描   述：输入：狗的ID 返回：狗（对象）
     * 版 本 号：1
     */
    public Dog getDog(int id);
}
