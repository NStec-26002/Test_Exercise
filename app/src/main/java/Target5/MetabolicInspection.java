package Target5;

import java.util.ArrayList;
import java.util.List;

public class MetabolicInspection {
    public Metabolic inspection(Subject subject) {
        // 初期判定
        // 男性で腹囲が90cm未満
        if (subject.getGender() == 1 && subject.getBelly() < 90) {
            return Metabolic.METABOLIC_NON;
        }
        // ⼥性で腹囲が80cm未満
        if (subject.getGender() == 2 && subject.getBelly() < 80) {
            return Metabolic.METABOLIC_NON;
        }
        List<Boolean> checkItem = new ArrayList<Boolean>();
        // ⾎圧判定 ⾎圧(上)130mmHG ⾎圧(下)85mmHG
        if (subject.getBloodPressure_a() >= 130
                && subject.getBloodPressure_u() >= 85) {
            checkItem.add(true);
        }
        // 中性脂肪判定 150mg/dL以上
        if (subject.getFat() >= 150) {
            checkItem.add(true);
        }
        // 男性でHDLｃ40mg/dL未満
        if (subject.getGender() == 1 && subject.getHDLc() < 40) {
            checkItem.add(true);
        }
        // ⼥性でHDLｃ50mg/dL未満
        if (subject.getGender() == 2 && subject.getHDLc() < 50) {
            checkItem.add(true);
        }
        // ⾎糖100mg/dL以上
        if (subject.getBloodGlucose() >= 100) {
            checkItem.add(true);
        }
        // 該当項⽬１ メタボリックシンドローム予備軍
        if (checkItem.size() == 1) {
            return Metabolic.METABOLIC_INITIAL;
        }
        // 該当項⽬2以上 メタボリックシンドローム
        if (checkItem.size() >= 2) {
            return Metabolic.METABOLIC;
        }
        // メタボリックシンドロームでない
        return Metabolic.METABOLIC_NON;
    }
}
