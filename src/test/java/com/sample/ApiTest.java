package com.sample;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;
import org.springframework.test.context.web.*;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.setup.*;
import org.springframework.web.context.*;



@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext-test.xml")
public class ApiTest {
    
    @Autowired
    private WebApplicationContext wac;
    
    private MockMvc mockMvc;
    
    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }
    
    @Test
    public void test() throws Exception {
        mockMvc.perform(get("/1.json"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result.id").value(1))
        .andExpect(jsonPath("$.result.name").value("name"))
        .andExpect(jsonPath("$.result.attributes[0]").exists())
        .andExpect(jsonPath("$.result.attributes[0]").value("red"))
        .andExpect(jsonPath("$.result.attributes[1]").value("green"))
        .andExpect(jsonPath("$.result.attributes[2]").doesNotExist())
        .andExpect(content().contentType("application/json"));
    }
}
