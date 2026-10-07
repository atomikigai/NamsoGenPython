package s2;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f8361b;

    public /* synthetic */ f(ViewPager2 viewPager2, int i) {
        this.f8360a = i;
        this.f8361b = viewPager2;
    }

    @Override // s2.i
    public void a(int i) {
        switch (this.f8360a) {
            case 0:
                if (i == 0) {
                    this.f8361b.c();
                }
                break;
        }
    }

    @Override // s2.i
    public final void c(int i) {
        switch (this.f8360a) {
            case 0:
                ViewPager2 viewPager2 = this.f8361b;
                if (viewPager2.f1211d != i) {
                    viewPager2.f1211d = i;
                    viewPager2.E.f();
                }
                break;
            default:
                ViewPager2 viewPager3 = this.f8361b;
                viewPager3.clearFocus();
                if (viewPager3.hasFocus()) {
                    viewPager3.f1216u.requestFocus(2);
                }
                break;
        }
    }
}
