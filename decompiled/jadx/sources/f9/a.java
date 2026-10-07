package f9;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b9.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i) {
        super(14);
        this.f3649c = i;
    }

    @Override // b9.e
    public final void x(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.f3649c) {
            case 0:
                RectF rectFR = b9.e.r(tabLayout, view);
                RectF rectFR2 = b9.e.r(tabLayout, view2);
                if (rectFR.left < rectFR2.left) {
                    double d10 = (((double) f10) * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d10));
                    fCos = (float) Math.sin(d10);
                } else {
                    double d11 = (((double) f10) * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d11);
                    fCos = (float) (1.0d - Math.cos(d11));
                }
                drawable.setBounds(e8.a.c(fSin, (int) rectFR.left, (int) rectFR2.left), drawable.getBounds().top, e8.a.c(fCos, (int) rectFR.right, (int) rectFR2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f10 >= 0.5f) {
                    view = view2;
                }
                RectF rectFR3 = b9.e.r(tabLayout, view);
                float fB = f10 < 0.5f ? e8.a.b(1.0f, 0.0f, 0.0f, 0.5f, f10) : e8.a.b(0.0f, 1.0f, 0.5f, 1.0f, f10);
                drawable.setBounds((int) rectFR3.left, drawable.getBounds().top, (int) rectFR3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fB * 255.0f));
                break;
        }
    }
}
