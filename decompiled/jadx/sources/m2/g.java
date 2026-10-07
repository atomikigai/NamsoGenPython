package m2;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6991b;

    public /* synthetic */ g() {
        this.f6990a = 2;
    }

    @Override // m2.l
    public final void c(m mVar) {
        switch (this.f6990a) {
            case 0:
                View view = (View) this.f6991b;
                v vVar = t.f7026a;
                vVar.I(view, 1.0f);
                vVar.getClass();
                mVar.u(this);
                break;
            case 1:
                ((m) this.f6991b).w();
                mVar.u(this);
                break;
            default:
                a aVar = (a) this.f6991b;
                int i = aVar.J - 1;
                aVar.J = i;
                if (i == 0) {
                    aVar.K = false;
                    aVar.l();
                }
                mVar.u(this);
                break;
        }
    }

    @Override // m2.n, m2.l
    public void d() {
        switch (this.f6990a) {
            case 2:
                a aVar = (a) this.f6991b;
                if (!aVar.K) {
                    aVar.D();
                    aVar.K = true;
                }
                break;
        }
    }

    public /* synthetic */ g(Object obj, int i) {
        this.f6990a = i;
        this.f6991b = obj;
    }
}
