package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzjb {
    public static final /* synthetic */ int zza = 0;
    private static final zzzo zzb;
    private static final zzob zzc;
    private static final zznx zzd;
    private static final zzne zze;
    private static final zzna zzf;
    private static final Map zzg;
    private static final Map zzh;

    static {
        zzzo zzzoVarZzb = zzpd.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zzb = zzzoVarZzb;
        zzc = zzob.zzb(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzix
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzot zza(zzce zzceVar) {
                return zzjb.zzc((zziw) zzceVar);
            }
        }, zziw.class, zzop.class);
        zzd = zznx.zzb(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zziy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzce zza(zzot zzotVar) {
                return zzjb.zzb((zzop) zzotVar);
            }
        }, zzzoVarZzb, zzop.class);
        zze = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zziz
        }, zzio.class, zzoo.class);
        zzf = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzja
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) {
                return zzjb.zza((zzoo) zzotVar, zzcrVar);
            }
        }, zzzoVarZzb, zzoo.class);
        HashMap map = new HashMap();
        zziu zziuVar = zziu.zzc;
        zzxo zzxoVar = zzxo.RAW;
        map.put(zziuVar, zzxoVar);
        zziu zziuVar2 = zziu.zza;
        zzxo zzxoVar2 = zzxo.TINK;
        map.put(zziuVar2, zzxoVar2);
        zziu zziuVar3 = zziu.zzb;
        zzxo zzxoVar3 = zzxo.CRUNCHY;
        map.put(zziuVar3, zzxoVar3);
        zzg = Collections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(zzxo.class);
        enumMap.put(zzxoVar, zziuVar);
        enumMap.put(zzxoVar2, zziuVar2);
        enumMap.put(zzxoVar3, zziuVar3);
        enumMap.put(zzxo.LEGACY, zziuVar3);
        zzh = Collections.unmodifiableMap(enumMap);
    }

    public static /* synthetic */ zzio zza(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            zzts zztsVarZzd = zzts.zzd(zzooVar.zze(), zzajx.zza());
            if (zztsVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzit zzitVar = new zzit(null);
            zzitVar.zza(zztsVarZzd.zze().zzd());
            zzitVar.zzb(zze(zzooVar.zzc()));
            zziw zziwVarZzc = zzitVar.zzc();
            zzim zzimVar = new zzim(null);
            zzimVar.zzc(zziwVarZzc);
            zzimVar.zzb(zzzq.zzb(zztsVarZzd.zze().zzq(), zzcrVar));
            zzimVar.zza(zzooVar.zzf());
            return zzimVar.zzd();
        } catch (zzaks unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }

    public static /* synthetic */ zziw zzb(zzop zzopVar) throws GeneralSecurityException {
        if (!zzopVar.zzc().zzg().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: ".concat(String.valueOf(zzopVar.zzc().zzg())));
        }
        try {
            zztv zztvVarZze = zztv.zze(zzopVar.zzc().zzf(), zzajx.zza());
            if (zztvVarZze.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzit zzitVar = new zzit(null);
            zzitVar.zza(zztvVarZze.zza());
            zzitVar.zzb(zze(zzopVar.zzc().zze()));
            return zzitVar.zzc();
        } catch (zzaks e) {
            throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzop zzc(zziw zziwVar) throws GeneralSecurityException {
        zzwm zzwmVarZza = zzwn.zza();
        zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zztu zztuVarZzc = zztv.zzc();
        zztuVarZzc.zza(zziwVar.zzb());
        zzwmVarZza.zzc(((zztv) zztuVarZzc.zzi()).zzo());
        zziu zziuVarZzd = zziwVar.zzd();
        Map map = zzg;
        if (!map.containsKey(zziuVarZzd)) {
            throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zziuVarZzd)));
        }
        zzwmVarZza.zza((zzxo) map.get(zziuVarZzd));
        return zzop.zzb((zzwn) zzwmVarZza.zzi());
    }

    public static void zzd(zznt zzntVar) throws GeneralSecurityException {
        zzntVar.zzh(zzc);
        zzntVar.zzg(zzd);
        zzntVar.zzf(zze);
        zzntVar.zze(zzf);
    }

    private static zziu zze(zzxo zzxoVar) throws GeneralSecurityException {
        Map map = zzh;
        if (map.containsKey(zzxoVar)) {
            return (zziu) map.get(zzxoVar);
        }
        throw new GeneralSecurityException(v.f(zzxoVar.zza(), "Unable to parse OutputPrefixType: "));
    }
}
