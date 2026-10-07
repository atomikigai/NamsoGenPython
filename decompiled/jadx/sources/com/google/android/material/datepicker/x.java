package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends x1.t {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2472q = 0;

    public /* synthetic */ x(Context context) {
        super(context);
    }

    @Override // x1.t
    public int b(View view, int i) {
        switch (this.f2472q) {
            case 1:
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // x1.t
    public int c(View view, int i) {
        switch (this.f2472q) {
            case 1:
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // x1.t
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f2472q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // x1.t
    public PointF f(int i) {
        switch (this.f2472q) {
            case 1:
                return null;
            default:
                return super.f(i);
        }
    }

    public x(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
