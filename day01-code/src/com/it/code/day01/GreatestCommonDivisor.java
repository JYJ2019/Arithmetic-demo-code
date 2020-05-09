package com.it.code.day01;

import java.util.Scanner;

/*
欧几里得算法

目的:
找到两个数的最大公约数

自然语言描述:
计算两个非负整数p 和 q的最大公约数:
若q 是 0,则最大公约数为 p 否则,将 p 除以
q 得到余数 r , p 和 q 的最大公约数即为 q 和
r 的最大公约数
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println(gcd(p, q));
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p / q;
        return gcd(p, r);
    }
}
