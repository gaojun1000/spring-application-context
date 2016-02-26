package com.stuff2share.y;

import org.springframework.stereotype.Component;

/**
 * Created by jgao on 2/24/16.
 */
@Component
public class Dog {

    public Dog() {
        System.out.println("creating bean Dog: " + this);
    }
}
