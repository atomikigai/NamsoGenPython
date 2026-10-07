package w8;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends d {
    public i(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, null, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        Context context = getContext();
        j jVar = (j) this.f9732a;
        setIndeterminateDrawable(new p(context, jVar, new f(jVar), new h(jVar)));
        setProgressDrawable(new l(getContext(), jVar, new f(jVar)));
    }

    @Override // w8.d
    public final e a(Context context, AttributeSet attributeSet) {
        j jVar = new j(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        u8.n.a(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = d8.a.f3017g;
        u8.n.b(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        jVar.f9763g = Math.max(android.support.v4.media.session.a.i(context, typedArrayObtainStyledAttributes, 2, dimensionPixelSize), jVar.f9743a * 2);
        jVar.h = android.support.v4.media.session.a.i(context, typedArrayObtainStyledAttributes, 1, dimensionPixelSize2);
        jVar.i = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return jVar;
    }

    public int getIndicatorDirection() {
        return ((j) this.f9732a).i;
    }

    public int getIndicatorInset() {
        return ((j) this.f9732a).h;
    }

    public int getIndicatorSize() {
        return ((j) this.f9732a).f9763g;
    }

    public void setIndicatorDirection(int i) {
        ((j) this.f9732a).i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        e eVar = this.f9732a;
        if (((j) eVar).h != i) {
            ((j) eVar).h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        e eVar = this.f9732a;
        if (((j) eVar).f9763g != iMax) {
            ((j) eVar).f9763g = iMax;
            ((j) eVar).getClass();
            invalidate();
        }
    }

    @Override // w8.d
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((j) this.f9732a).getClass();
    }
}
