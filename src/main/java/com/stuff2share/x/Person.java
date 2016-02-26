package com.stuff2share.x;

import com.stuff2share.y.Car;
import com.stuff2share.y.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jgao on 2/24/16.
 */
@Component
public class Person {

    private Dog dog;
    private Car car;

    public Person() {
        System.out.println("creating bean Person: " + this);
    }

    @Autowired
    public void setDog(Dog dog) {
        System.out.println("in person, setting dog with " + dog);
        this.dog = dog;
    }


    @Autowired
    public void setCar(Car car) {
        System.out.println("in person, setting car with " + car);
        this.car = car;
    }

}
