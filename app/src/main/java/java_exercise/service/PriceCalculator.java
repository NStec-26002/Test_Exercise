package java_exercise.service;

public class PriceCalculator {
    /**
     * [機能] 販売価格を計算する<br>
     * 
     * @param price                            単価
     * @param gender                           性別1:女性2:男性
     * @param category                         商品カテゴリ1:食料品2:日用品3:文房具
     * @param dayOfWeek曜日1:日2:月3:火4:水5:木6:金7:土
     * @return 販売価格
     */
    public long calcPrice(int price, int gender, int category, int dayOfWeek) {
        long result = price;
        switch (dayOfWeek) {
            case 1:// 日曜日
                if (category == 1 || category == 2) {// 食料品か日用品?
                    result = Math.round(price * 0.95);
                }
                break;
            case 2:// 月曜日
                if (category == 3) { // 文房具?
                    result = Math.round(price * 0.9);
                }
                break;
            case 3:// 火曜日
                if (gender == 1) { // 女性?
                    result = Math.round(price * 0.8);
                }
                break;
        }
        return result;
    }
}
