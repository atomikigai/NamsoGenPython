package com.google.android.material.tabs;

import a2.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import d8.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class TabItem extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f2516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f2517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2518c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l lVarF = l.F(context, attributeSet, a.G);
        TypedArray typedArray = (TypedArray) lVarF.f44c;
        this.f2516a = typedArray.getText(2);
        this.f2517b = lVarF.u(0);
        this.f2518c = typedArray.getResourceId(1, 0);
        lVarF.I();
    }
}
