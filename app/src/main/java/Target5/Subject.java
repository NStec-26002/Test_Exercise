package Target5;

public class Subject {
    /**
     * 被験者⽒名
     */
    private String name;
    /**
     * 性別
     */
    private int gender;
    /**
     * 腹囲
     */
    private int belly;
    /**
     * ⾎圧(上)
     */
    private int bloodPressure_a;
    /**
     * ⾎圧(下)
     */
    private int bloodPressure_u;
    /**
     * 中性脂肪
     */
    private int fat;
    /**
     * HDLc
     */
    private int HDLc;
    /**
     * ⾎糖値
     */
    private int bloodGlucose;

    /**
     * [機 能] コンストラクタ<br>
     * [説 明] <br>
     * [備 考] <br>
     * 
     * @param name            被験者⽒名
     * @param gender          性別
     * @param belly           腹囲
     * @param bloodPressure_a ⾎圧(上)
     * @param bloodPressure_u ⾎圧(下)
     * @param fat             中性脂肪
     * @param HDLc            HDLc
     * @param bloodGlucose    ⾎糖値
     */
    public Subject(String name, int gender, int belly, int bloodPressure_a,
            int bloodPressure_u, int fat, int HDLc, int bloodGlucose) {
        this.name = name;
        this.gender = gender;
        this.belly = belly;
        this.bloodPressure_a = bloodPressure_a;
        this.bloodPressure_u = bloodPressure_u;
        this.fat = fat;
        this.HDLc = HDLc;
        this.bloodGlucose = bloodGlucose;
    }

    /**
     * [機 能] 被験者⽒名を取得する。<br>
     * [説 明] なし<br>
     * [備 考] なし<br>
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * [機 能] 性別を取得する。<br>
     * [説 明] なし<br>
     * [備 考] なし<br>
     * 
     * @return
     */
    public int getGender() {
        return gender;
    }

    /**
     * [機 能] 腹囲を取得する。<br>
     * [説 明] なし<br>
     * [備 考] なし<br>
     * 
     * @return
     */
    public int getBelly() {
        return belly;
    }

    /**
     * [機 能] ⾎圧(上)を取得する。<br>
     * [説 明] なし<br>
     * [備 考] なし<br>
     * 
     * @return
     */
    public int getBloodPressure_a() {
        return bloodPressure_a;
    }

    /**
     * [機 能] ⾎圧(下)を取得する。<br>
     * [説 明] なし<br>
     * [備 考] なし<br>
     * 
     * @return
     */
    public int getBloodPressure_u() {
        return bloodPressure_u;
    }

    /**
     * [機 能] 中性脂肪を取得する。<br>
     * }
     * [説 明] なし<br>
     * [備 考] なし<br>
     * 
     * @return
     */
    public int getFat() {
        return fat;
    }

    /**
     * [機 能] HDLcを取得する。<br>
     * [説 明] なし<br>
     * [備 考] なし<br>
     * 
     * @return
     */
    public int getHDLc() {
        return HDLc;
    }

    /**
     * [機 能] ⾎糖値を取得する。<br>
     * [説 明] なし <br>
     * [備 考] なし <br>
     * 
     * @return
     */
    public int getBloodGlucose() {
        return bloodGlucose;
    }
}
