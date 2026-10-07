package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f1002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f1003c;

    public /* synthetic */ v0(h hVar, w0 w0Var, int i) {
        this.f1001a = i;
        this.f1003c = hVar;
        this.f1002b = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1001a) {
            case 0:
                ArrayList arrayList = this.f1003c.f869b;
                w0 w0Var = this.f1002b;
                if (arrayList.contains(w0Var)) {
                    q1.a.a(w0Var.f1006c.P, w0Var.f1004a);
                }
                break;
            default:
                h hVar = this.f1003c;
                ArrayList arrayList2 = hVar.f869b;
                w0 w0Var2 = this.f1002b;
                arrayList2.remove(w0Var2);
                hVar.f870c.remove(w0Var2);
                break;
        }
    }
}
