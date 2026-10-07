package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdg extends zznf {
    final /* synthetic */ zzdh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdh zzdhVar, Class cls) {
        super(cls);
        this.zza = zzdhVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        zzsl zzslVar = (zzsl) zzalpVar;
        new zzdv();
        zzso zzsoVarZzf = zzdu.zzf(zzslVar.zzd());
        zzalp zzalpVarZza = new zzqj().zza().zza(zzslVar.zze());
        zzsh zzshVarZzb = zzsi.zzb();
        zzshVarZzb.zza(zzsoVarZzf);
        zzshVarZzb.zzb((zzvf) zzalpVarZza);
        zzshVarZzb.zzc(0);
        return (zzsi) zzshVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zzsl.zzc(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzhl.zze);
        zzdj zzdjVar = new zzdj(null);
        zzdjVar.zza(16);
        zzdjVar.zzc(32);
        zzdjVar.zze(16);
        zzdjVar.zzd(16);
        zzdk zzdkVar = zzdk.zzc;
        zzdjVar.zzb(zzdkVar);
        zzdl zzdlVar = zzdl.zzc;
        zzdjVar.zzf(zzdlVar);
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzdjVar.zzg());
        map.put("AES256_CTR_HMAC_SHA256", zzhl.zzf);
        zzdj zzdjVar2 = new zzdj(null);
        zzdjVar2.zza(32);
        zzdjVar2.zzc(32);
        zzdjVar2.zze(32);
        zzdjVar2.zzd(16);
        zzdjVar2.zzb(zzdkVar);
        zzdjVar2.zzf(zzdlVar);
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzdjVar2.zzg());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ void zzd(zzalp zzalpVar) throws GeneralSecurityException {
        zzsl zzslVar = (zzsl) zzalpVar;
        ((zzdu) new zzdv().zza()).zzd(zzslVar.zzd());
        new zzqj().zza().zzd(zzslVar.zze());
        zzzl.zzb(zzslVar.zzd().zza());
    }
}
