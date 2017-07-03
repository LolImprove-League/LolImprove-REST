package com.lolimprove.controllers;

import com.lolimprove.Application;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;


/**
 * Created by Lennart Van Damme on 22/06/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class ChampionControllerTest {

    private MockMvc mockMvc;

    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() throws Exception {

    }

}