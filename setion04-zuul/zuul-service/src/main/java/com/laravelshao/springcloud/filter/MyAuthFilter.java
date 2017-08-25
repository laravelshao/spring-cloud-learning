package com.laravelshao.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by shaoqinghua on 2017/11/6.
 */
@Component
public class MyAuthFilter extends ZuulFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyAuthFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        LOGGER.info("{}--->{}", request.getMethod(), request.getRequestURL().toString());
        Object token = request.getParameter("token");
        if (token == null) {
            LOGGER.info("token is empty");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().getWriter().write("token is empty");
            } catch (Exception e) {

            }
            return null;
        }
        LOGGER.info("ok");
        return null;
    }
}
