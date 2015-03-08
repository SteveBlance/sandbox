package com.codaconsultancy.sandbox.ocpjp.packagetwo;

import com.codaconsultancy.sandbox.ocpjp.packageone.Foo;

public class Bar extends Foo {

    void doSomethingGreat() {
        // doSomething(); default access
        //new Foo().doSomethingBetter(); protected
        doSomethingBetter(); // protected using inheritance
    }

    void doSomething() {
        // this is fine Foo().doSomething is not visible to Bar
    }

//    protected int doSomethingBetter() {
//        // different return type so it can't override
//        // parent method - compilation error
//    }
}
