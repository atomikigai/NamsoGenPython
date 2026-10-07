package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzpl extends zznf {
    public zzpl(zzpm zzpmVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        zzsc zzscVar = (zzsc) zzalpVar;
        zzry zzryVarZzb = zzrz.zzb();
        zzryVarZzb.zzc(0);
        byte[] bArrZzb = zzor.zzb(zzscVar.zza());
        zzryVarZzb.zza(zzajf.zzn(bArrZzb, 0, bArrZzb.length));
        zzryVarZzb.zzb(zzscVar.zze());
        return (zzrz) zzryVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zzsc.zzd(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        zzpr zzprVar = zzrc.zze;
        map.put("AES_CMAC", zzprVar);
        map.put("AES256_CMAC", zzprVar);
        zzpo zzpoVar = new zzpo(null);
        zzpoVar.zza(32);
        zzpoVar.zzb(16);
        zzpoVar.zzc(zzpp.zzd);
        map.put("AES256_CMAC_RAW", zzpoVar.zzd());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ void zzd(zzalp zzalpVar) throws GeneralSecurityException {
        zzsc zzscVar = (zzsc) zzalpVar;
        zzpm.zzn(zzscVar.zze());
        zzpm.zzo(zzscVar.zza());
    }
}
