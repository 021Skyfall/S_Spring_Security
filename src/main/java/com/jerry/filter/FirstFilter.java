package com.jerry.filter;

import javax.servlet.*;
import java.io.IOException;

// Servlet Filter 기본 구조
public class FirstFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
