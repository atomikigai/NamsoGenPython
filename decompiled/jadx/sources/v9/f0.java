package v9;

import com.google.android.gms.internal.p002firebaseauthapi.zzahb;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements w9.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f9244a;

    public f0(FirebaseAuth firebaseAuth) {
        this.f9244a = firebaseAuth;
    }

    @Override // w9.w
    public final void a(zzahb zzahbVar, n nVar) {
        com.google.android.gms.common.internal.i0.i(zzahbVar);
        com.google.android.gms.common.internal.i0.i(nVar);
        ((w9.d0) nVar).f9819a = zzahbVar;
        FirebaseAuth firebaseAuth = this.f9244a;
        firebaseAuth.getClass();
        FirebaseAuth.h(firebaseAuth, nVar, zzahbVar, true, false);
    }
}
