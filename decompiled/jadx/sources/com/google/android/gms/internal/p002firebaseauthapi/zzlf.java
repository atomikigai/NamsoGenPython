package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlf {
    public static final zzwn zza;
    public static final zzwn zzb;
    public static final zzwn zzc;
    private static final byte[] zzd;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zzux zzuxVar = zzux.NIST_P256;
        zzvc zzvcVar = zzvc.SHA256;
        zzud zzudVar = zzud.UNCOMPRESSED;
        zzwn zzwnVar = zzcw.zza;
        zzxo zzxoVar = zzxo.TINK;
        zza = zza(zzuxVar, zzvcVar, zzudVar, zzwnVar, zzxoVar, bArr);
        zzb = zza(zzuxVar, zzvcVar, zzud.COMPRESSED, zzwnVar, zzxo.RAW, bArr);
        zzc = zza(zzuxVar, zzvcVar, zzudVar, zzcw.zze, zzxoVar, bArr);
    }

    @Deprecated
    public static zzwn zza(zzux zzuxVar, zzvc zzvcVar, zzud zzudVar, zzwn zzwnVar, zzxo zzxoVar, byte[] bArr) {
        zzui zzuiVarZza = zzuj.zza();
        zzuu zzuuVarZza = zzuv.zza();
        zzuuVarZza.zza(zzuxVar);
        zzuuVarZza.zzb(zzvcVar);
        zzuuVarZza.zzc(zzajf.zzn(bArr, 0, 0));
        zzuv zzuvVar = (zzuv) zzuuVarZza.zzi();
        zzuf zzufVarZza = zzug.zza();
        zzufVarZza.zza(zzwnVar);
        zzug zzugVar = (zzug) zzufVarZza.zzi();
        zzul zzulVarZzc = zzum.zzc();
        zzulVarZzc.zzc(zzuvVar);
        zzulVarZzc.zza(zzugVar);
        zzulVarZzc.zzb(zzudVar);
        zzuiVarZza.zza((zzum) zzulVarZzc.zzi());
        zzuj zzujVar = (zzuj) zzuiVarZza.zzi();
        zzwm zzwmVarZza = zzwn.zza();
        new zzjl();
        zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zzwmVarZza.zza(zzxoVar);
        zzwmVarZza.zzc(zzujVar.zzo());
        return (zzwn) zzwmVarZza.zzi();
    }
}
