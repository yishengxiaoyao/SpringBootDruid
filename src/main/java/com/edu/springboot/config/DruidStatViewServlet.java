package com.edu.springboot.config;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/druid/*",initParams = {
        @WebInitParam(name = "allow",value = "127.0.0.1"), //allow the ip login
        @WebInitParam(name = "deny",value = "192.168.1.100"), //deny the ip login,deny is pripor to the allow
        @WebInitParam(name="loginUsername",value="admin"),// username
        @WebInitParam(name="loginPassword",value="admin"),// password
        @WebInitParam(name="resetEnable",value="true")// forbidden to Reset All
})
public class DruidStatViewServlet extends StatViewServlet {
}
