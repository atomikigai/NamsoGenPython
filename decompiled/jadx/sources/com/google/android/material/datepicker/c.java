package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z9.c f2416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z9.c f2417b;

    public c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(a.a.n(context, m.class.getCanonicalName(), R.attr.materialCalendarStyle).data, d8.a.f3028t);
        z9.c.j(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        z9.c.j(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        z9.c.j(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        z9.c.j(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListH = android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 7);
        this.f2416a = z9.c.j(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        z9.c.j(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f2417b = z9.c.j(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListH.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
