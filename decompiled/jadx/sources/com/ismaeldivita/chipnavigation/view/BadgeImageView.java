package com.ismaeldivita.chipnavigation.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import jc.i;
import l.w;
import l8.a;
import sb.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class BadgeImageView extends w {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f2746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i.e(context, "context");
        this.f2746d = new b(context);
        addOnLayoutChangeListener(new a(this, 1));
    }

    public final void c(int i) {
        Rect rect = new Rect();
        getDrawingRect(rect);
        b bVar = this.f2746d;
        bVar.f8465b = i;
        Rect rect2 = bVar.f8466c;
        if (rect2 != null) {
            bVar.b(rect2);
        }
        if (!rect.isEmpty()) {
            bVar.b(rect);
        }
        getOverlay().add(bVar);
        invalidate();
    }

    public final void setBadgeColor(int i) {
        this.f2746d.a().setColor(i);
    }
}
