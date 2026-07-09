package java_exercise.service;

public class TicketPriceCalculator {

    /**
     * [機 能] 映画館の⼊場料⾦を計算する<br>
     * [説 明] <br>
     * [備 考] <br>
     * 
     * @param dayOfMovie 映画の⽇かどうか
     * @param lateShow   レイトショーかどうか
     * @param age        年齢
     * @return 料⾦
     */
    public int calcPrice(boolean dayOfMovie, boolean lateShow, int age) {
        int result = 0;
        if (lateShow && age <= 18) { // レイトショー かつ 18歳以下
            throw new IllegalArgumentException("age=" + age
                    + ", lateShow=" + lateShow);
        }
        if (dayOfMovie) { // 映画の⽇
            result = 1000;
        } else {
            if (lateShow) { // レイトショー
                result = 1200;
            } else {
                if (age <= 18) { // 18歳以下
                    result = 1500;
                } else {
                    result = 1800;
                }
            }
        }
        return result;
    }
}
