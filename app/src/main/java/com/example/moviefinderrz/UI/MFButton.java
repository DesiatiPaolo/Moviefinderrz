// CustomButton.java
package com.example.moviefinderrz.UI;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

import com.example.moviefinderrz.R;

public class MFButton extends AppCompatButton {

    // Constructor used when creating the button programmatically
    public MFButton(Context context) {
        super(context);
        init();
    }

    // Constructor used when inflating from XML
    public MFButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    // Constructor with a default style
    public MFButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    // Initialization logic
    private void init() {
        // Set default properties
        setBackground(getResources().getDrawable(R.drawable.button_gradient));
        setAllCaps(false);
        setTextColor(getResources().getColor(R.color.black));
        setPadding(17, 17, 17, 17);
    }
}
