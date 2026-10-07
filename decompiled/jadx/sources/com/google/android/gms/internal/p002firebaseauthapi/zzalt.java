package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzalt implements zzamb {
    private final zzalp zza;
    private final zzamv zzb;
    private final boolean zzc;
    private final zzajy zzd;

    private zzalt(zzamv zzamvVar, zzajy zzajyVar, zzalp zzalpVar) {
        this.zzb = zzamvVar;
        this.zzc = zzajyVar.zzh(zzalpVar);
        this.zzd = zzajyVar;
        this.zza = zzalpVar;
    }

    public static zzalt zzc(zzamv zzamvVar, zzajy zzajyVar, zzalp zzalpVar) {
        return new zzalt(zzamvVar, zzajyVar, zzalpVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final int zza(Object obj) {
        zzamv zzamvVar = this.zzb;
        int iZzb = zzamvVar.zzb(zzamvVar.zzd(obj));
        if (!this.zzc) {
            return iZzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return iHashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final Object zze() {
        zzalp zzalpVar = this.zza;
        return zzalpVar instanceof zzakk ? ((zzakk) zzalpVar).zzw() : zzalpVar.zzC().zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final void zzg(Object obj, Object obj2) {
        zzamd.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            this.zzd.zza(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final void zzh(Object obj, zzama zzamaVar, zzajx zzajxVar) throws IOException {
        boolean zZzO;
        zzamv zzamvVar = this.zzb;
        Object objZzc = zzamvVar.zzc(obj);
        zzajy zzajyVar = this.zzd;
        zzakc zzakcVarZzb = zzajyVar.zzb(obj);
        while (zzamaVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzamaVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZzc2 = zzajyVar.zzc(zzajxVar, this.zza, iZzd >>> 3);
                        if (objZzc2 != null) {
                            zzajyVar.zzf(zzamaVar, objZzc2, zzajxVar, zzakcVarZzb);
                        } else {
                            zZzO = zzamvVar.zzp(objZzc, zzamaVar);
                        }
                    } else {
                        zZzO = zzamaVar.zzO();
                    }
                    if (!zZzO) {
                        zzamvVar.zzn(obj, objZzc);
                        return;
                    }
                } else {
                    Object objZzc3 = null;
                    int iZzj = 0;
                    zzajf zzajfVarZzp = null;
                    while (zzamaVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzamaVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzamaVar.zzj();
                            objZzc3 = zzajyVar.zzc(zzajxVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZzc3 != null) {
                                zzajyVar.zzf(zzamaVar, objZzc3, zzajxVar, zzakcVarZzb);
                            } else {
                                zzajfVarZzp = zzamaVar.zzp();
                            }
                        } else if (!zzamaVar.zzO()) {
                            break;
                        }
                    }
                    if (zzamaVar.zzd() != 12) {
                        throw zzaks.zzb();
                    }
                    if (zzajfVarZzp != null) {
                        if (objZzc3 != null) {
                            zzajyVar.zzg(zzajfVarZzp, objZzc3, zzajxVar, zzakcVarZzb);
                        } else {
                            zzamvVar.zzk(objZzc, iZzj, zzajfVarZzp);
                        }
                    }
                }
            } catch (Throwable th) {
                zzamvVar.zzn(obj, objZzc);
                throw th;
            }
        }
        zzamvVar.zzn(obj, objZzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final void zzi(Object obj, byte[] bArr, int i, int i10, zzais zzaisVar) throws IOException {
        zzakk zzakkVar = (zzakk) obj;
        if (zzakkVar.zzc == zzamw.zzc()) {
            zzakkVar.zzc = zzamw.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final boolean zzj(Object obj, Object obj2) {
        zzamv zzamvVar = this.zzb;
        if (!zzamvVar.zzd(obj).equals(zzamvVar.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final void zzm(Object obj, zzajt zzajtVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
