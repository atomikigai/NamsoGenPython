package o6;

import com.google.android.gms.internal.ads.zzdex;
import com.google.android.gms.internal.ads.zzdsh;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements zzdex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzdsh f7609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f7610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7611c;

    public d0(zzdsh zzdshVar, c0 c0Var, String str) {
        this.f7609a = zzdshVar;
        this.f7610b = c0Var;
        this.f7611c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zze(r rVar) {
        if (rVar == null) {
            return;
        }
        c0 c0Var = this.f7610b;
        String str = this.f7611c;
        zzdsh zzdshVar = this.f7609a;
        String str2 = rVar.f7663b;
        synchronized (c0Var) {
            d6.p.C.f2983j.getClass();
            c0Var.e.put(str, new b0(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
            c0Var.d();
            c0Var.b(zzdshVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zzf(String str) {
    }
}
