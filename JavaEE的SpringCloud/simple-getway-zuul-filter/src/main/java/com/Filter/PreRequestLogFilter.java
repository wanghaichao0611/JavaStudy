package com.Filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;

public class PreRequestLogFilter extends ZuulFilter {
    private static final Logger LOGGER= LoggerFactory.getLogger(PreRequestLogFilter.class);

    @Override
    public String filterType() {
        //pre 类型的过滤器
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        //在org.springframework.cloud.netflix.zuul.filters.pre.PreDecorationFilter之前执行
        return FilterConstants.PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx=RequestContext.getCurrentContext();
        HttpServletRequest request=ctx.getRequest();
        PreRequestLogFilter.LOGGER.info(String.format("send %s request to %s",request.getMethod(),request.getRequestURI().toString()));
        return null;
    }
}
