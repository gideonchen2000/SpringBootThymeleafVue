package com.example.service;

import com.example.pojo.Hero;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HeroService {
    public int add(Hero hero);

    public void delete(int id);

    public Hero get(int id);

    public int update(Hero hero);

    public List<Hero> list();
}
