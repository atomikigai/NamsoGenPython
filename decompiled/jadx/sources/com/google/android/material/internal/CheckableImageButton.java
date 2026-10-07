package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.datepicker.j;
import l.v;
import q0.v0;
import u8.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends v implements Checkable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f2489r = {R.attr.state_checked};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2490d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2491f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, app.namso_gen.spacehowen.R.attr.imageButtonStyle);
        this.e = true;
        this.f2491f = true;
        v0.l(this, new j(this, 3));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2490d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f2490d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f2489r) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f10011a);
        setChecked(bVar.f8990c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f8990c = this.f2490d;
        return bVar;
    }

    public void setCheckable(boolean z4) {
        if (this.e != z4) {
            this.e = z4;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (!this.e || this.f2490d == z4) {
            return;
        }
        this.f2490d = z4;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z4) {
        this.f2491f = z4;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        if (this.f2491f) {
            super.setPressed(z4);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2490d);
    }
}
