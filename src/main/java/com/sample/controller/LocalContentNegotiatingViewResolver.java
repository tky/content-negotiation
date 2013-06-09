package com.sample.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;

public class LocalContentNegotiatingViewResolver extends ContentNegotiatingViewResolver {

    /**
     * MediaTypeの判定を拡張しcallbackが指定された場合はjsonpにします。
     */
    @Override
    protected List<MediaType> getMediaTypes(HttpServletRequest request) {
        if (!StringUtils.isEmpty(request.getParameter("callback"))) {
            return Arrays.asList(new MediaType("application", "javascript"));
        } else {
            return super.getMediaTypes(request);
        }
    }
}
