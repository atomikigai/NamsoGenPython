package v9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzahb;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements w9.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f9246b;

    public /* synthetic */ g0(FirebaseAuth firebaseAuth, int i) {
        this.f9245a = i;
        this.f9246b = firebaseAuth;
    }

    @Override // w9.w
    public final void a(zzahb zzahbVar, n nVar) {
        switch (this.f9245a) {
            case 0:
                com.google.android.gms.common.internal.i0.i(zzahbVar);
                com.google.android.gms.common.internal.i0.i(nVar);
                ((w9.d0) nVar).f9819a = zzahbVar;
                FirebaseAuth.h(this.f9246b, nVar, zzahbVar, true, true);
                break;
            default:
                FirebaseAuth.h(this.f9246b, nVar, zzahbVar, true, true);
                break;
        }
    }

    @Override // w9.g
    public final void zzb(Status status) {
        switch (this.f9245a) {
            case 0:
                int i = status.f2045a;
                if (i == 17011 || i == 17021 || i == 17005 || i == 17091) {
                    this.f9246b.d();
                }
                break;
            default:
                int i10 = status.f2045a;
                if (i10 == 17011 || i10 == 17021 || i10 == 17005) {
                    this.f9246b.d();
                }
                break;
        }
    }
}
