package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import app.namso_gen.spacehowen.R;
import d8.a;
import java.util.WeakHashMap;
import q0.e0;
import q0.v0;
import u8.n;
import w8.d;
import w8.e;
import w8.l;
import w8.p;
import w8.q;
import w8.r;
import w8.t;
import w8.u;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class LinearProgressIndicator extends d {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        Context context2 = getContext();
        u uVar = (u) this.f9732a;
        setIndeterminateDrawable(new p(context2, uVar, new q(uVar), uVar.f9801g == 0 ? new r(uVar) : new t(context2, uVar)));
        setProgressDrawable(new l(getContext(), uVar, new q(uVar)));
    }

    @Override // w8.d
    public final e a(Context context, AttributeSet attributeSet) {
        u uVar = new u(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        n.a(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = a.f3023o;
        n.b(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        uVar.f9801g = typedArrayObtainStyledAttributes.getInt(0, 1);
        uVar.h = typedArrayObtainStyledAttributes.getInt(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        uVar.a();
        uVar.i = uVar.h == 1;
        return uVar;
    }

    @Override // w8.d
    public final void b(int i, boolean z4) {
        e eVar = this.f9732a;
        if (eVar != null && ((u) eVar).f9801g == 0 && isIndeterminate()) {
            return;
        }
        super.b(i, z4);
    }

    public int getIndeterminateAnimationType() {
        return ((u) this.f9732a).f9801g;
    }

    public int getIndicatorDirection() {
        return ((u) this.f9732a).h;
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        super.onLayout(z4, i, i10, i11, i12);
        e eVar = this.f9732a;
        u uVar = (u) eVar;
        boolean z10 = true;
        if (((u) eVar).h != 1) {
            WeakHashMap weakHashMap = v0.f7946a;
            if ((e0.d(this) != 1 || ((u) eVar).h != 2) && (e0.d(this) != 0 || ((u) eVar).h != 3)) {
                z10 = false;
            }
        }
        uVar.i = z10;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i10 - (getPaddingBottom() + getPaddingTop());
        p indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        l progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        e eVar = this.f9732a;
        if (((u) eVar).f9801g == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((u) eVar).f9801g = i;
        ((u) eVar).a();
        if (i == 0) {
            p indeterminateDrawable = getIndeterminateDrawable();
            r rVar = new r((u) eVar);
            indeterminateDrawable.f9783x = rVar;
            rVar.f1774a = indeterminateDrawable;
        } else {
            p indeterminateDrawable2 = getIndeterminateDrawable();
            t tVar = new t(getContext(), (u) eVar);
            indeterminateDrawable2.f9783x = tVar;
            tVar.f1774a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // w8.d
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((u) this.f9732a).a();
    }

    public void setIndicatorDirection(int i) {
        e eVar = this.f9732a;
        ((u) eVar).h = i;
        u uVar = (u) eVar;
        boolean z4 = true;
        if (i != 1) {
            WeakHashMap weakHashMap = v0.f7946a;
            if ((e0.d(this) != 1 || ((u) eVar).h != 2) && (e0.d(this) != 0 || i != 3)) {
                z4 = false;
            }
        }
        uVar.i = z4;
        invalidate();
    }

    @Override // w8.d
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((u) this.f9732a).a();
        invalidate();
    }
}
