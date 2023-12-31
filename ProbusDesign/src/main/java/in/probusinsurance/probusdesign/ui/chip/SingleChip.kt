package `in`.probusinsurance.probusdesign.ui.chip

import `in`.probusinsurance.probusdesign.R
import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.util.TypedValue
import com.google.android.material.chip.Chip

class SingleChip(context: Context?, attrs: AttributeSet?) :
    Chip(context, attrs) {
    init {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP_MR1) {
            this.setTextAppearance(R.style.Chip_Single_Style)
            val paddingDp = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 20f,
                resources.displayMetrics
            ).toInt()
            this.setPadding(paddingDp, paddingDp, paddingDp, paddingDp)
        }
    }
}