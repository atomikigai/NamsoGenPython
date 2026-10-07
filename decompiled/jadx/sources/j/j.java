package j;

import android.view.View;
import fa.c1;
import l.i3;
import q0.f1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5627d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5628f;

    public j(k kVar) {
        this.f5626c = 0;
        this.f5628f = kVar;
        this.f5627d = false;
        this.e = 0;
    }

    @Override // fa.c1, q0.f1
    public void a(View view) {
        switch (this.f5626c) {
            case 1:
                this.f5627d = true;
                break;
        }
    }

    @Override // fa.c1, q0.f1
    public final void b() {
        switch (this.f5626c) {
            case 0:
                if (!this.f5627d) {
                    this.f5627d = true;
                    f1 f1Var = ((k) this.f5628f).f5632d;
                    if (f1Var != null) {
                        f1Var.b();
                    }
                    break;
                }
                break;
            default:
                ((i3) this.f5628f).f6293a.setVisibility(0);
                break;
        }
    }

    @Override // q0.f1
    public final void c() {
        switch (this.f5626c) {
            case 0:
                int i = this.e + 1;
                this.e = i;
                k kVar = (k) this.f5628f;
                if (i == kVar.f5629a.size()) {
                    f1 f1Var = kVar.f5632d;
                    if (f1Var != null) {
                        f1Var.c();
                    }
                    this.e = 0;
                    this.f5627d = false;
                    kVar.e = false;
                }
                break;
            default:
                if (!this.f5627d) {
                    ((i3) this.f5628f).f6293a.setVisibility(this.e);
                }
                break;
        }
    }

    public j(i3 i3Var, int i) {
        this.f5626c = 1;
        this.f5628f = i3Var;
        this.e = i;
        this.f5627d = false;
    }
}
