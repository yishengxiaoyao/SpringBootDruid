package com.edu.springboot.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(filterName = "druidWebStatFilter",urlPatterns = "/*",initParams = {
        //ignore the resource
        @WebInitParam(name = "exclusion",value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
})
public class DruidStatFilter extends WebStatFilter {
}
