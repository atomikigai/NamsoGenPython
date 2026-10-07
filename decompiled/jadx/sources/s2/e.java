package s2;

import androidx.viewpager2.widget.ViewPager2;
import x1.b0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8359b;

    public /* synthetic */ e(Object obj, int i) {
        this.f8358a = i;
        this.f8359b = obj;
    }

    @Override // x1.b0
    public final void a() {
        switch (this.f8358a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.f8359b;
                viewPager2.e = true;
                viewPager2.f1218w.f8357l = true;
                break;
            default:
                ((a3.j) this.f8359b).f();
                break;
        }
    }

    @Override // x1.b0
    public final void b(int i) {
        a();
    }
}
