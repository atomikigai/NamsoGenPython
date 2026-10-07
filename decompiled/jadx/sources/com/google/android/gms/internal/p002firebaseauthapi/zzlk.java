package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzlk implements zzyh {
    private final String zza;
    private final int zzb;
    private zztg zzc;
    private zzsi zzd;
    private int zze;
    private zzts zzf;

    public zzlk(zzwn zzwnVar) throws GeneralSecurityException {
        String strZzg = zzwnVar.zzg();
        this.zza = strZzg;
        if (strZzg.equals(zzcu.zzb)) {
            try {
                zztj zztjVarZze = zztj.zze(zzwnVar.zzf(), zzajx.zza());
                this.zzc = zztg.zzd(zzcq.zzb(zzwnVar).zze(), zzajx.zza());
                this.zzb = zztjVarZze.zza();
                return;
            } catch (zzaks e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (strZzg.equals(zzcu.zza)) {
            try {
                zzsl zzslVarZzc = zzsl.zzc(zzwnVar.zzf(), zzajx.zza());
                this.zzd = zzsi.zzd(zzcq.zzb(zzwnVar).zze(), zzajx.zza());
                this.zze = zzslVarZzc.zzd().zza();
                this.zzb = this.zze + zzslVarZzc.zze().zza();
                return;
            } catch (zzaks e4) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e4);
            }
        }
        if (!strZzg.equals(zzjc.zza)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(strZzg)));
        }
        try {
            zztv zztvVarZze = zztv.zze(zzwnVar.zzf(), zzajx.zza());
            this.zzf = zzts.zzd(zzcq.zzb(zzwnVar).zze(), zzajx.zza());
            this.zzb = zztvVarZze.zza();
        } catch (zzaks e10) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyh
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyh
    public final zzmg zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.zza.equals(zzcu.zzb)) {
            zztf zztfVarZzb = zztg.zzb();
            zztfVarZzb.zzh(this.zzc);
            zztfVarZzb.zza(zzajf.zzn(bArr, 0, this.zzb));
            return new zzmg((zzbd) zzcq.zze(this.zza, ((zztg) zztfVarZzb.zzi()).zzo(), zzbd.class));
        }
        if (!this.zza.equals(zzcu.zza)) {
            if (!this.zza.equals(zzjc.zza)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            zztr zztrVarZzb = zzts.zzb();
            zztrVarZzb.zzh(this.zzf);
            zztrVarZzb.zza(zzajf.zzn(bArr, 0, this.zzb));
            return new zzmg((zzbj) zzcq.zze(this.zza, ((zzts) zztrVarZzb.zzi()).zzo(), zzbj.class));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
        zzsn zzsnVarZzb = zzso.zzb();
        zzsnVarZzb.zzh(this.zzd.zze());
        zzajf zzajfVar = zzajf.zzb;
        zzsnVarZzb.zza(zzajf.zzn(bArrCopyOfRange, 0, bArrCopyOfRange.length));
        zzso zzsoVar = (zzso) zzsnVarZzb.zzi();
        zzve zzveVarZzb = zzvf.zzb();
        zzveVarZzb.zzh(this.zzd.zzf());
        zzveVarZzb.zza(zzajf.zzn(bArrCopyOfRange2, 0, bArrCopyOfRange2.length));
        zzvf zzvfVar = (zzvf) zzveVarZzb.zzi();
        zzsh zzshVarZzb = zzsi.zzb();
        zzshVarZzb.zzc(this.zzd.zza());
        zzshVarZzb.zza(zzsoVar);
        zzshVarZzb.zzb(zzvfVar);
        return new zzmg((zzbd) zzcq.zze(this.zza, ((zzsi) zzshVarZzb.zzi()).zzo(), zzbd.class));
    }
}
