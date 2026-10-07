package x1;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10184d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10186g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10187j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f10188k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10189l;

    public final void a(View view) {
        int iB;
        int size = this.f10188k.size();
        View view2 = null;
        int i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((w0) this.f10188k.get(i10)).f10230a;
            i0 i0Var = (i0) view3.getLayoutParams();
            if (view3 != view && !i0Var.f10105a.h() && (iB = (i0Var.f10105a.b() - this.f10184d) * this.e) >= 0 && iB < i) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i = iB;
                }
            }
        }
        if (view2 == null) {
            this.f10184d = -1;
        } else {
            this.f10184d = ((i0) view2.getLayoutParams()).f10105a.b();
        }
    }

    public final View b(n0 n0Var) {
        List list = this.f10188k;
        if (list == null) {
            View view = n0Var.k(this.f10184d, Long.MAX_VALUE).f10230a;
            this.f10184d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((w0) this.f10188k.get(i)).f10230a;
            i0 i0Var = (i0) view2.getLayoutParams();
            if (!i0Var.f10105a.h() && this.f10184d == i0Var.f10105a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
