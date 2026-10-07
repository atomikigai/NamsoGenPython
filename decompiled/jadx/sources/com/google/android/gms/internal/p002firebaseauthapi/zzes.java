package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzes extends zznf {
    final /* synthetic */ zzet zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(zzet zzetVar, Class cls) {
        super(cls);
        this.zza = zzetVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        zztf zztfVarZzb = zztg.zzb();
        byte[] bArrZzb = zzor.zzb(((zztj) zzalpVar).zza());
        zztfVarZzb.zza(zzajf.zzn(bArrZzb, 0, bArrZzb.length));
        zztfVarZzb.zzb(0);
        return (zztg) zztfVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zztj.zze(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzhl.zza);
        zzev zzevVar = new zzev(null);
        zzevVar.zza(12);
        zzevVar.zzb(16);
        zzevVar.zzc(16);
        zzew zzewVar = zzew.zzc;
        zzevVar.zzd(zzewVar);
        map.put("AES128_GCM_RAW", zzevVar.zze());
        map.put("AES256_GCM", zzhl.zzb);
        zzev zzevVar2 = new zzev(null);
        zzevVar2.zza(12);
        zzevVar2.zzb(32);
        zzevVar2.zzc(16);
        zzevVar2.zzd(zzewVar);
        map.put("AES256_GCM_RAW", zzevVar2.zze());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ void zzd(zzalp zzalpVar) throws GeneralSecurityException {
        zzzl.zzb(((zztj) zzalpVar).zza());
    }
}
