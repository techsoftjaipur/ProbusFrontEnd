package `in`.probusinsurance.probusdesign.ui.textview

import `in`.probusinsurance.probusdesign.R
import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.util.AttributeSet

@SuppressLint("NewApi")
class TextViewReviewData(context: Context, attrs: AttributeSet?) :
    androidx.appcompat.widget.AppCompatTextView(context, attrs) {
    init {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP_MR1) {
            this.setTextAppearance(R.style.TextView_ReviewHeadingData_Style)
            val customAttributesStyle =
                context.obtainStyledAttributes(attrs, R.styleable.TextViewReviewData, 0, 0)

            try {

                var colorEnable = customAttributesStyle.getBoolean(
                    R.styleable.TextViewReviewData_customColorEnable,
                    false
                )

                if (colorEnable) {
                    this.setTextColor(
                        customAttributesStyle.getColor(
                            R.styleable.TextViewReviewData_customColor,
                            resources.getColor(R.color.text_Color_SubHeading_Large)
                        )
                    )
                }


            } finally {
                customAttributesStyle.recycle()
            }
        }


        invalidate()
        requestLayout()
    }
}