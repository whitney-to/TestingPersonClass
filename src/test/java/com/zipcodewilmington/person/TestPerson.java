package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAllFields() {
        Person person  = new Person("John",
                25, 5.4, "Developer",
                new String[]{"Gaming", "Reading"},
                'M', "Black");

        boolean actual = person.getName().equals("John")
                        && person.getAge() == 25
                        && person.getHeight() == 5.4
                        && person.getJob().equals("Developer")
                        && Arrays.equals(person.getHobbies(), new String[]{"Gaming", "Reading"})
                        && person.getGender() == 'M'
                        && person.getEyeColor().equals("Black");

        Assert.assertTrue(actual);
        }
    @Test
    public void testGetHeight() {
        Person person = new Person();
        person.setHeight(5.7);

        double expected = 5.7;
        double actual = person.getHeight();
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testGetJob() {
        Person person = new Person();
        person.setJob("Programmer");

        String expected = "Programmer";
        String actual = person.getJob();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testGetHobbies() {
        Person person = new Person();
        person.setHobbies(new String[]{"painting", "singing"});

        String[] expected = {"painting", "singing"};
        String[] actual = person.getHobbies();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testGetGender() {
        Person person = new Person();
        person.setGender('F');

        char expected = 'F';
        char actual = person.getGender();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testGetEyeColor() {
        Person person = new Person();
        person.setEyeColor("Blue");

        String expected = "Blue";
        String actual = person.getEyeColor();
        Assert.assertEquals(actual,expected);
    }
}
