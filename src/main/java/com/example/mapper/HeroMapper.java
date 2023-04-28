package com.example.mapper;

import com.example.pojo.Hero;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper

public interface HeroMapper {
    public int add(Hero hero);

    public void delete(int id);

    public Hero get(int id);

    public int update(Hero hero);

    public List<Hero> list();
}
