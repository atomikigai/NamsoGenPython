package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import app.namso_gen.spacehowen.R;
import com.google.android.material.button.MaterialButton;
import g.x;
import g9.w;
import l.a0;
import l.n;
import l.o;
import l.p;
import l.z0;
import m8.b;
import x8.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends x {
    @Override // g.x
    public final n a(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    @Override // g.x
    public final o b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.x
    public final p c(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // g.x
    public final a0 d(Context context, AttributeSet attributeSet) {
        a aVar = new a(i9.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray typedArrayG = u8.n.g(context2, attributeSet, d8.a.f3031w, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayG.hasValue(0)) {
            u0.b.c(aVar, android.support.v4.media.session.a.h(context2, typedArrayG, 0));
        }
        aVar.f10308f = typedArrayG.getBoolean(1, false);
        typedArrayG.recycle();
        return aVar;
    }

    @Override // g.x
    public final z0 e(Context context, AttributeSet attributeSet) {
        h9.a aVar = new h9.a(i9.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (a.a.m(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = d8.a.f3034z;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int i = -1;
            for (int i10 = 0; i10 < 2 && i < 0; i10++) {
                i = android.support.v4.media.session.a.i(context2, typedArrayObtainStyledAttributes, iArr2[i10], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (i == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, d8.a.f3033y);
                    Context context3 = aVar.getContext();
                    int[] iArr3 = {1, 2};
                    int i11 = -1;
                    for (int i12 = 0; i12 < 2 && i11 < 0; i12++) {
                        i11 = android.support.v4.media.session.a.i(context3, typedArrayObtainStyledAttributes3, iArr3[i12], -1);
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                    if (i11 >= 0) {
                        aVar.setLineHeight(i11);
                    }
                }
            }
        }
        return aVar;
    }
}
