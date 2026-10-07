package o6;

import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcvq;
import com.google.android.gms.internal.ads.zzcvr;
import com.google.android.gms.internal.ads.zzdfa;
import com.google.android.gms.internal.ads.zzdxr;
import com.google.android.gms.internal.ads.zzfin;
import com.google.android.gms.internal.ads.zzfix;
import com.google.android.gms.internal.ads.zzfjl;
import com.google.android.gms.internal.ads.zzfjr;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.ads.zzhfx;
import com.google.android.gms.internal.ads.zzhgg;
import com.google.android.gms.internal.ads.zzhgp;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements zzhfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzhgp f7653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h6.g0 f7654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzcvr f7655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzhgp f7656d;

    public o(zzhgg zzhggVar, h6.g0 g0Var, zzcvr zzcvrVar, zzhgg zzhggVar2) {
        this.f7653a = zzhggVar;
        this.f7654b = g0Var;
        this.f7655c = zzcvrVar;
        this.f7656d = zzhggVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        zzfjr zzfjrVar = (zzfjr) this.f7653a.zzb();
        q qVar = new q(zzfin.zzc(), ((zzdxr) this.f7654b.f4996b).zzb());
        zzcvq zzcvqVarZzb = this.f7655c.zzb();
        zzdfa zzdfaVar = (zzdfa) this.f7656d.zzb();
        zzfix zzfixVarZza = zzfjrVar.zzb(zzfjl.GENERATE_SIGNALS, zzcvqVarZzb.zzc()).zzf(qVar).zzi(((Integer) e6.t.f3437d.f3440c.zza(zzbcn.zzfx)).intValue(), TimeUnit.SECONDS).zza();
        zzgei.zzr(zzfixVarZza, new a5.b(zzdfaVar, 24), zzcaj.zza);
        return zzfixVarZza;
    }
}
