package com.javarush.task.task34.task3412;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/* 
Добавление логирования в класс
*/

public class Solution {
    private static final Logger logger = LoggerFactory.getLogger(Solution.class);

    private int value1;
    private String value2;
    private Date value3;

    public Solution(int value1, String value2, Date value3) {
        logger.debug("Setting a constructor with values: "+value1 +", "+ value2 +", "+ value3);
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public static void main(String[] args) {

    }

    public void calculateAndSetValue3(long value) {
        logger.trace("Printing ");
        value -= 133;
        if (value > Integer.MAX_VALUE) {
            value1 = (int) (value / Integer.MAX_VALUE);
            logger.debug("Setting new value1  "+value1);
        } else {
            value1 = (int) value;
            logger.debug("Setting new value1  "+value1);
        }
    }

    public void printString() {
        logger.trace("Printing ");
        if (value2 != null) {
            System.out.println(value2.length());
        }
    }

    public void printDateAsLong() {
        logger.trace("Printing ");
        if (value3 != null) {
            System.out.println(value3.getTime());
        }
    }

    public void divide(int number1, int number2) {
        try {
            logger.trace("Printing division");
            System.out.println(number1 / number2);
        } catch (ArithmeticException e) {
            logger.error("Arithmetic Exception ", e);
        }
    }

    public void setValue1(int value1) {
        logger.debug("Setting value1 with "+value1);
        this.value1 = value1;
    }

    public void setValue2(String value2) {
        logger.debug("Setting value2 with "+value2);
        this.value2 = value2;
    }

    public void setValue3(Date value3) {
        logger.debug("Setting value3 with "+value3);
        this.value3 = value3;
    }
}
