package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzeb extends zznf {
    final /* synthetic */ zzec zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, Class cls) {
        super(cls);
        this.zza = zzecVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        zzta zztaVar = (zzta) zzalpVar;
        zzsw zzswVarZzb = zzsx.zzb();
        byte[] bArrZzb = zzor.zzb(zztaVar.zza());
        zzswVarZzb.zza(zzajf.zzn(bArrZzb, 0, bArrZzb.length));
        zzswVarZzb.zzb(zztaVar.zze());
        zzswVarZzb.zzc(0);
        return (zzsx) zzswVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zzta.zzd(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzhl.zzc);
        zzee zzeeVar = new zzee(null);
        zzeeVar.zza(16);
        zzeeVar.zzb(16);
        zzeeVar.zzc(16);
        zzef zzefVar = zzef.zzc;
        zzeeVar.zzd(zzefVar);
        map.put("AES128_EAX_RAW", zzeeVar.zze());
        map.put("AES256_EAX", zzhl.zzd);
        zzee zzeeVar2 = new zzee(null);
        zzeeVar2.zza(16);
        zzeeVar2.zzb(32);
        zzeeVar2.zzc(16);
        zzeeVar2.zzd(zzefVar);
        map.put("AES256_EAX_RAW", zzeeVar2.zze());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ void zzd(zzalp zzalpVar) throws GeneralSecurityException {
        zzta zztaVar = (zzta) zzalpVar;
        zzzl.zzb(zztaVar.zza());
        if (zztaVar.zze().zza() != 12 && zztaVar.zze().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
