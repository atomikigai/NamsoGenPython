package x1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10060a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10061b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10062c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10063d = 0;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f10064f;

    public f1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f10064f = staggeredGridLayoutManager;
        this.e = i;
    }

    public final void a() {
        ArrayList arrayList = this.f10060a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        b1 b1Var = (b1) view.getLayoutParams();
        this.f10062c = this.f10064f.f1172r.d(view);
        b1Var.getClass();
    }

    public final void b() {
        this.f10060a.clear();
        this.f10061b = Integer.MIN_VALUE;
        this.f10062c = Integer.MIN_VALUE;
        this.f10063d = 0;
    }

    public final int c() {
        boolean z4 = this.f10064f.f1177w;
        ArrayList arrayList = this.f10060a;
        return z4 ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
    }

    public final int d() {
        boolean z4 = this.f10064f.f1177w;
        ArrayList arrayList = this.f10060a;
        return z4 ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
    }

    public final int e(int i, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f10064f;
        int iM = staggeredGridLayoutManager.f1172r.m();
        int i11 = staggeredGridLayoutManager.f1172r.i();
        int i12 = i10 > i ? 1 : -1;
        while (i != i10) {
            View view = (View) this.f10060a.get(i);
            int iG = staggeredGridLayoutManager.f1172r.g(view);
            int iD = staggeredGridLayoutManager.f1172r.d(view);
            boolean z4 = iG <= i11;
            boolean z10 = iD >= iM;
            if (z4 && z10 && (iG < iM || iD > i11)) {
                return h0.F(view);
            }
            i += i12;
        }
        return -1;
    }

    public final int f(int i) {
        int i10 = this.f10062c;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (this.f10060a.size() == 0) {
            return i;
        }
        a();
        return this.f10062c;
    }

    public final View g(int i, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f10064f;
        ArrayList arrayList = this.f10060a;
        View view = null;
        if (i10 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1177w && h0.F(view2) >= i) || ((!staggeredGridLayoutManager.f1177w && h0.F(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            View view3 = (View) arrayList.get(i11);
            if ((staggeredGridLayoutManager.f1177w && h0.F(view3) <= i) || ((!staggeredGridLayoutManager.f1177w && h0.F(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i11++;
            view = view3;
        }
        return view;
    }

    public final int h(int i) {
        int i10 = this.f10061b;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        ArrayList arrayList = this.f10060a;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        b1 b1Var = (b1) view.getLayoutParams();
        this.f10061b = this.f10064f.f1172r.g(view);
        b1Var.getClass();
        return this.f10061b;
    }
}
