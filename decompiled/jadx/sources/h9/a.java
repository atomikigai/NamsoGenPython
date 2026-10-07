package h9;

import android.content.Context;
import android.content.res.TypedArray;
import app.namso_gen.spacehowen.R;
import l.z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z0 {
    @Override // l.z0, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (a.a.m(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, d8.a.f3033y);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int i10 = -1;
            for (int i11 = 0; i11 < 2 && i10 < 0; i11++) {
                i10 = android.support.v4.media.session.a.i(context2, typedArrayObtainStyledAttributes, iArr[i11], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (i10 >= 0) {
                setLineHeight(i10);
            }
        }
    }
}
