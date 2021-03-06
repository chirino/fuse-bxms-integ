/*
 * Copyright 2012 Red Hat
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.jboss.integration.fuse.karaf.itest.kiecamel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

public class Person {

    private String name;
    private String likes;
    private String status;
    private int age;
    private boolean canDrink = false;
    private boolean alive;
    private char sex;
    private boolean happy;

    public Person() {

    }

    public Person(final String name) {
        this(name,
                "",
                0);
    }

    public Person(final String name,
            final String likes) {
        this(name,
                likes,
                0);
    }

    public Person(final String name,
            final String likes,
            final int age) {
        this.name = name;
        this.likes = likes;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCanDrink() {
        return canDrink;
    }

    public void setCanDrink(boolean canDrink) {
        this.canDrink = canDrink;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getLikes() {
        return this.likes;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public void setAlive(final boolean alive) {
        this.alive = alive;
    }

    public char getSex() {
        return this.sex;
    }

    public void setSex(final char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age
                + ", canDrink=" + canDrink + '}';
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }
}
