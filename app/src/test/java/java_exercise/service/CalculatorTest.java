package java_exercise.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.channels.CancelledKeyException;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd_case1() {
        // テスト対象のクラスインスタンス取得
        Calculator calculator = new Calculator();
        // テスト対象メソッドの実行
        int actual = calculator.add(12, 12);
        // 実行結果の評価
        assertEquals(24, actual);
    }

    @Test
    public void testSub_case1() {
        // テスト対象のクラスインスタンス取得
        Calculator calculator = new Calculator();
        // テスト対象メソッドの実行
        int actual = calculator.sub(12, 6);
        // 実行結果の評価
        assertEquals(6, actual);
    }

    @Test
    public void testMulti_case1() {
        // テスト対象のクラスインスタンス取得
        Calculator calculator = new Calculator();
        // テスト対象メソッドの実行
        int actual = calculator.multi(2, 12);
        // 実行結果の評価
        assertEquals(24, actual);
    }

    @Test
    public void testDivide_case1() {
        // テスト対象のクラスインスタンス取得
        Calculator calculator = new Calculator();
        // テスト対象メソッドの実行
        double actual = calculator.divide(36, 5);
        // 期待値の設定
        double expected = 7.2;
        // 実行結果の評価
        assertEquals(expected, actual);
    }
}
