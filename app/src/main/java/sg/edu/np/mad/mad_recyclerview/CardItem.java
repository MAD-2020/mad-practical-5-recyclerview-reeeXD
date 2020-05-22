package sg.edu.np.mad.mad_recyclerview;

import android.widget.CheckBox;

public class CardItem {
    private String mText1;
    private CheckBox mCheckBox;

    public CardItem(String text1, CheckBox checkBox){
        mText1 = text1;
        mCheckBox = checkBox;
    }

    public String getText1() {
        return mText1;
    }
    public CheckBox getCheckBox() {
        return mCheckBox;
    }
}
