package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import e6.c1;
import e6.l3;
import e6.o3;
import e6.q3;
import e6.t;
import e6.u3;
import e6.z0;
import h6.r0;
import java.util.ArrayList;
import java.util.List;
import z5.d;
import z5.e;
import z5.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzffo {
    public final l3 zza;
    public final zzbmb zzb;
    public final zzems zzc;
    public final o3 zzd;
    public final q3 zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbfn zzi;
    public final u3 zzj;
    public final int zzk;
    public final z5.a zzl;
    public final g zzm;
    public final z0 zzn;
    public final zzffb zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    public final c1 zzt;

    public zzffo(zzffm zzffmVar, zzffn zzffnVar) {
        this.zze = zzffmVar.zzb;
        this.zzf = zzffmVar.zzc;
        this.zzt = zzffmVar.zzu;
        int i = zzffmVar.zza.f3371a;
        long j4 = zzffmVar.zza.f3372b;
        Bundle bundle = zzffmVar.zza.f3373c;
        int i10 = zzffmVar.zza.f3374d;
        List list = zzffmVar.zza.e;
        boolean z4 = zzffmVar.zza.f3375f;
        int i11 = zzffmVar.zza.f3376r;
        boolean z10 = true;
        if (!zzffmVar.zza.f3377s && !zzffmVar.zze) {
            z10 = false;
        }
        this.zzd = new o3(i, j4, bundle, i10, list, z4, i11, z10, zzffmVar.zza.f3378t, zzffmVar.zza.f3379u, zzffmVar.zza.f3380v, zzffmVar.zza.f3381w, zzffmVar.zza.f3382x, zzffmVar.zza.f3383y, zzffmVar.zza.f3384z, zzffmVar.zza.A, zzffmVar.zza.B, zzffmVar.zza.C, zzffmVar.zza.D, zzffmVar.zza.E, zzffmVar.zza.F, zzffmVar.zza.G, r0.t(zzffmVar.zza.H), zzffmVar.zza.I, zzffmVar.zza.J, zzffmVar.zza.K);
        this.zza = zzffmVar.zzd != null ? zzffmVar.zzd : zzffmVar.zzh != null ? zzffmVar.zzh.zzf : null;
        this.zzg = zzffmVar.zzf;
        this.zzh = zzffmVar.zzg;
        this.zzi = zzffmVar.zzf == null ? null : zzffmVar.zzh == null ? new zzbfn(new e(new d())) : zzffmVar.zzh;
        this.zzj = zzffmVar.zzi;
        this.zzk = zzffmVar.zzm;
        this.zzl = zzffmVar.zzj;
        this.zzm = zzffmVar.zzk;
        this.zzn = zzffmVar.zzl;
        this.zzb = zzffmVar.zzn;
        this.zzo = new zzffb(zzffmVar.zzo, null);
        this.zzp = zzffmVar.zzp;
        this.zzq = zzffmVar.zzq;
        this.zzc = zzffmVar.zzr;
        this.zzr = zzffmVar.zzs;
        this.zzs = zzffmVar.zzt;
    }

    public final zzbhp zza() {
        g gVar = this.zzm;
        if (gVar == null && this.zzl == null) {
            return null;
        }
        if (gVar != null) {
            IBinder iBinder = gVar.f10984c;
            if (iBinder == null) {
                return null;
            }
            return zzbho.zzb(iBinder);
        }
        IBinder iBinder2 = this.zzl.f10969b;
        if (iBinder2 == null) {
            return null;
        }
        return zzbho.zzb(iBinder2);
    }

    public final boolean zzb() {
        return this.zzf.matches((String) t.f3437d.f3440c.zza(zzbcn.zzdm));
    }
}
