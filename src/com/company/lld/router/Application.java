package com.company.lld.router;

import java.util.HashMap;
import java.util.logging.Handler;

public class Application {
    public static void main(String[] args) {

        RouterStar rm = new RouterStar();
        //Router rm = new Router();
//        rm.add("jira.atlassian.com/testRoute/abc", "fooData1");
//        rm.add("jira.atlassian.com/testRoute/xyz", "fooData2");
//        rm.add("jira.atlassian.com/testRoute/", "fooData3");
//        rm.add("jira.atlassian.com/testRoute/abc/xyz", "fooData4");
//        //String v = rm.get("jira.atlassian.com/testRoute/*/xyz");
//        String w = rm.get("jira.atlassian.com/testRoute");
//        String x = rm.get("jira.atlassian.com/testRoute/abc");
//        //String y = rm.get("jira.atlassian.com/testRoute/*");
//        //String z = rm.get("jira.atlassian.com/*/xyz");
//        //System.out.println(v);
//        System.out.println(w);
//        System.out.println(x);
//        //System.out.println(y);
//        //System.out.println(z);
//        System.out.println(rm.get("jira.atlassian.com/testRoute/xyz"));
        //rm.add("","0");
        rm.add("a","1");
        //rm.add("b","1");
        rm.add("a/b","2");
        rm.add("a/b/c","3");
        rm.add("a/b/d","32");
        System.out.println(rm.get("a"));
        System.out.println(rm.get("a/b"));
        System.out.println(rm.get("a/b/c"));
        System.out.println(rm.get("a/b/d"));
        System.out.println(rm.get("b/c"));
        System.out.println(rm.get("c"));
        System.out.println(rm.get(""));
        rm.add("a/b/c/d","4");
        rm.add("b/c/d","31");
        System.out.println(rm.get("b/c/d"));
        System.out.println(rm.get("*/*"));



    }
}
