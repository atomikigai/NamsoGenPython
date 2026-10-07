package h6;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6.k f4969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4970b;

    public a0(Context context, String str, String str2) {
        this.f4969a = new i6.k(d6.p.C.f2979c.w(context, str));
        this.f4970b = str2;
    }

    @Override // h6.p
    public final void zza() {
        this.f4969a.zza(this.f4970b);
    }
}
