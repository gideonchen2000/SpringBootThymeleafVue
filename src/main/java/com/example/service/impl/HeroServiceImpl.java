package com.example.service.impl;

import com.example.mapper.HeroMapper;
import com.example.pojo.Hero;
import com.example.service.HeroService;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HeroServiceImpl implements HeroService {

    @Resource
    HeroMapper heroMapper;

    @Override
    public int add(Hero hero) {
        return heroMapper.add(hero);
    }

    @Override
    public void delete(int id) {
        heroMapper.delete(id);
    }

    @Override
    public Hero get(int id) {
        return heroMapper.get(id);
    }

    @Override
    public int update(Hero hero) {
        return heroMapper.update(hero);
    }

    @Override
    public List<Hero> list() {
        return heroMapper.list();
    }
}
