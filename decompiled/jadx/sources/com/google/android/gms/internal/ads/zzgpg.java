package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgpg {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgpg(zzgpc zzgpcVar, zzgpf zzgpfVar) {
        this.zza = new HashMap(zzgpcVar.zza);
        this.zzb = new HashMap(zzgpcVar.zzb);
        this.zzc = new HashMap(zzgpcVar.zzc);
        this.zzd = new HashMap(zzgpcVar.zzd);
    }

    public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzgpbVar.getClass(), zzgpbVar.zzd(), null);
        if (this.zzb.containsKey(zzgpdVar)) {
            return ((zzgms) this.zzb.get(zzgpdVar)).zza(zzgpbVar, zzggnVar);
        }
        throw new GeneralSecurityException(v.i("No Key Parser for requested key type ", zzgpdVar.toString(), " available"));
    }

    public final zzggj zzb(zzgpb zzgpbVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzgpbVar.getClass(), zzgpbVar.zzd(), null);
        if (this.zzd.containsKey(zzgpdVar)) {
            return ((zzgoe) this.zzd.get(zzgpdVar)).zza(zzgpbVar);
        }
        throw new GeneralSecurityException(v.i("No Parameters Parser for requested key type ", zzgpdVar.toString(), " available"));
    }

    public final zzgpb zzc(zzgfw zzgfwVar, Class cls, zzggn zzggnVar) throws GeneralSecurityException {
        zzgpe zzgpeVar = new zzgpe(zzgfwVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgpeVar)) {
            return ((zzgmw) this.zza.get(zzgpeVar)).zza(zzgfwVar, zzggnVar);
        }
        throw new GeneralSecurityException(v.i("No Key serializer for ", zzgpeVar.toString(), " available"));
    }

    public final zzgpb zzd(zzggj zzggjVar, Class cls) throws GeneralSecurityException {
        zzgpe zzgpeVar = new zzgpe(zzggjVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgpeVar)) {
            return ((zzgoi) this.zzc.get(zzgpeVar)).zza(zzggjVar);
        }
        throw new GeneralSecurityException(v.i("No Key Format serializer for ", zzgpeVar.toString(), " available"));
    }

    public final boolean zzi(zzgpb zzgpbVar) {
        return this.zzb.containsKey(new zzgpd(zzgpbVar.getClass(), zzgpbVar.zzd(), null));
    }

    public final boolean zzj(zzgpb zzgpbVar) {
        return this.zzd.containsKey(new zzgpd(zzgpbVar.getClass(), zzgpbVar.zzd(), null));
    }
}
