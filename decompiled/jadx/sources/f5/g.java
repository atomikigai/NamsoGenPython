package f5;

import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f3610b;

    public /* synthetic */ g(h hVar, int i) {
        this.f3609a = i;
        this.f3610b = hVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.f3609a) {
            case 0:
                this.f3610b.f(s4.h.a(exc));
                break;
            default:
                this.f3610b.f(s4.h.a(exc));
                break;
        }
    }
}
