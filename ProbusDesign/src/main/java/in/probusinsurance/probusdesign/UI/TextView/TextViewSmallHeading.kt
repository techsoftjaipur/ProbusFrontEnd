package `in`.probusinsurance.probusdesign.UI.TextView

import `in`.probusinsurance.probusdesign.R
import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.TextView

@SuppressLint("NewApi")
class TextViewSmallHeading(context: Context, attrs: AttributeSet?) :
    androidx.appcompat.widget.AppCompatTextView(context, attrs) {
        init {
            this.setTextAppearance(R.style.TextView_HeadingSmall_Style)
            val customAttributesStyle =
                context.obtainStyledAttributes(attrs, R.styleable.TextViewSmallHeading, 0, 0)

            try {

                var colorEnable = customAttributesStyle.getBoolean(
                    R.styleable.TextViewSmallHeading_customColorEnable,
                    false
                )

                if (colorEnable) {
                    this.setTextColor(
                        customAttributesStyle.getColor(
                            R.styleable.TextViewSmallHeading_customColor,
                            resources.getColor(R.color.text_Color_Heading_Small)
                        )
                    )
                }


            } finally {
                customAttributesStyle.recycle()
            }


            invalidate()
            requestLayout()
        }
}