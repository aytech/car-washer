package com.washer.web;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/washer-servlet")
public class WasherFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.getWriter().write("before custom filter...\n");
        filterChain.doFilter(servletRequest, servletResponse);
        servletResponse.getWriter().write("after custom filter...\n");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
