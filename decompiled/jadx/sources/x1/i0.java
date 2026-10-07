package x1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class i0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w0 f10105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f10106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10108d;

    public i0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10106b = new Rect();
        this.f10107c = true;
        this.f10108d = false;
    }

    public i0(int i, int i10) {
        super(i, i10);
        this.f10106b = new Rect();
        this.f10107c = true;
        this.f10108d = false;
    }

    public i0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f10106b = new Rect();
        this.f10107c = true;
        this.f10108d = false;
    }

    public i0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f10106b = new Rect();
        this.f10107c = true;
        this.f10108d = false;
    }

    public i0(i0 i0Var) {
        super((ViewGroup.LayoutParams) i0Var);
        this.f10106b = new Rect();
        this.f10107c = true;
        this.f10108d = false;
    }
}
