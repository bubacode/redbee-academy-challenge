package com.redbee.academy.challenge;

public class CompareNumbers {

    /**
     * Method that receives three numbers and returns the
     * max of those numbers
     *
     * @param a - Some Integer Number
     * @param b - Another Integer Number
     * @param c - Another Integer Number
     * @return The max of a, b and c
     */
    public static Integer max(Integer a, Integer b, Integer c) {
        if (a != null || b != null || c != null) {
          Integer maximun;
          if (a != null && b != null) {
            maximun = (a > b) ? a : b;
          } else {
            maximun = (a != null) ? a : b;
          }
          if (maximun != null && c != null) {
            return (maximun > c) ? maximun : c;
          } else {
            return (maximun != null) ? maximun : c;
          }
        } else {
          return 0;
        }
      }
    }
