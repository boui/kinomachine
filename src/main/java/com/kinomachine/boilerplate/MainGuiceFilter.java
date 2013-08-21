package com.kinomachine.boilerplate;

import com.google.inject.servlet.GuiceFilter;

import static javax.servlet.DispatcherType.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/*", dispatcherTypes = {ASYNC, INCLUDE, REQUEST})
public class MainGuiceFilter extends GuiceFilter {
}
