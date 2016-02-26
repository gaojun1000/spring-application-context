package com.stuff2share.y;

import org.springframework.stereotype.Component;

/**
 * Created by jgao on 2/24/16.
 */
@Component
public class Car {
    public Car() {
        System.out.println("creating bean Car: " + this);
    }
}
