package com.washer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WasherDatabaseTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void getCars() {
        List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from car");
        System.out.println("Car length: " + queryForList.size());
    }

    @Test
    public void getCar() {
        Map<String, Object> car = jdbcTemplate.queryForMap("select * from car where id = ?", 2);

        System.out.println("Car models is: " + car.get("model"));
        System.out.println("Car ID is: " + car.get("ID"));
        System.out.println("Car color is: " + car.get("color"));
    }
}
