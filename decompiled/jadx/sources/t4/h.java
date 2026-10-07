package t4;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import w9.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f8600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ta.c f8601c;

    public /* synthetic */ h(i iVar, ta.c cVar, int i) {
        this.f8599a = i;
        this.f8600b = iVar;
        this.f8601c = cVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int iH;
        boolean z4 = exc instanceof v9.h;
        i iVar = this.f8600b;
        if (!z4) {
            iVar.f(s4.h.a(exc));
            return;
        }
        try {
            iH = u3.b.h(((v9.h) exc).f9247a);
        } catch (IllegalArgumentException unused) {
            iH = 37;
        }
        if (exc instanceof v9.l) {
            v9.l lVar = (v9.l) exc;
            iVar.f(s4.h.a(new r4.h(this.f8601c.h(), lVar.f9264c, lVar.f9263b)));
        } else if (iH == 36) {
            iVar.f(s4.h.a(new s4.j(0)));
        } else {
            iVar.f(s4.h.a(exc));
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a0 a0Var = (a0) obj;
        switch (this.f8599a) {
            case 0:
                this.f8600b.j(this.f8601c.h(), a0Var.f9802a, a0Var.f9804c, a0Var.f9803b.f9872c);
                break;
            default:
                this.f8600b.j(this.f8601c.h(), a0Var.f9802a, a0Var.f9804c, a0Var.f9803b.f9872c);
                break;
        }
    }
}
