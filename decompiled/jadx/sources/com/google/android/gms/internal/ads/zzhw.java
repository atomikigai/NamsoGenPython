package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzhw implements zzln, zzlq {
    private final int zzb;
    private zzlr zzd;
    private int zze;
    private zzoj zzf;
    private zzdc zzg;
    private int zzh;
    private zzwg zzi;
    private zzad[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzlp zzq;
    private final Object zza = new Object();
    private final zzkj zzc = new zzkj();
    private long zzm = Long.MIN_VALUE;
    private zzbv zzp = zzbv.zza;

    public zzhw(int i) {
        this.zzb = i;
    }

    private final void zzZ(long j4, boolean z4) throws zzig {
        this.zzn = false;
        this.zzl = j4;
        this.zzm = j4;
        zzz(j4, z4);
    }

    public final void zzB() {
        zzlp zzlpVar;
        synchronized (this.zza) {
            zzlpVar = this.zzq;
        }
        if (zzlpVar != null) {
            zzlpVar.zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzG() {
        zzdb.zzf(this.zzh == 0);
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzH(zzad[] zzadVarArr, zzwg zzwgVar, long j4, long j10, zzur zzurVar) throws zzig {
        zzdb.zzf(!this.zzn);
        this.zzi = zzwgVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j4;
        }
        this.zzj = zzadVarArr;
        this.zzk = j10;
        zzF(zzadVarArr, j4, j10, zzurVar);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzI() {
        zzdb.zzf(this.zzh == 0);
        zzkj zzkjVar = this.zzc;
        zzkjVar.zzb = null;
        zzkjVar.zza = null;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzJ(long j4) throws zzig {
        zzZ(j4, false);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzK() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzL(zzlp zzlpVar) {
        synchronized (this.zza) {
            this.zzq = zzlpVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzN(zzbv zzbvVar) {
        if (Objects.equals(this.zzp, zzbvVar)) {
            return;
        }
        this.zzp = zzbvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzO() throws zzig {
        zzdb.zzf(this.zzh == 1);
        this.zzh = 2;
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzP() {
        zzdb.zzf(this.zzh == 2);
        this.zzh = 1;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final boolean zzQ() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final boolean zzR() {
        return this.zzn;
    }

    public final boolean zzS() {
        if (zzQ()) {
            return this.zzn;
        }
        zzwg zzwgVar = this.zzi;
        zzwgVar.getClass();
        return zzwgVar.zze();
    }

    public final zzad[] zzT() {
        zzad[] zzadVarArr = this.zzj;
        zzadVarArr.getClass();
        return zzadVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlq
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final int zzcV() {
        return this.zzh;
    }

    public final int zzcW(zzkj zzkjVar, zzhm zzhmVar, int i) {
        zzwg zzwgVar = this.zzi;
        zzwgVar.getClass();
        int iZza = zzwgVar.zza(zzkjVar, zzhmVar, i);
        if (iZza == -4) {
            if (zzhmVar.zzf()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j4 = zzhmVar.zze + this.zzk;
            zzhmVar.zze = j4;
            this.zzm = Math.max(this.zzm, j4);
            return iZza;
        }
        if (iZza == -5) {
            zzad zzadVar = zzkjVar.zza;
            zzadVar.getClass();
            long j10 = zzadVar.zzt;
            if (j10 != Long.MAX_VALUE) {
                zzab zzabVarZzb = zzadVar.zzb();
                zzabVarZzb.zzad(j10 + this.zzk);
                zzkjVar.zza = zzabVarZzb.zzaf();
                return -5;
            }
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final long zzcX() {
        return this.zzm;
    }

    public final zzig zzcY(Throwable th, zzad zzadVar, boolean z4, int i) {
        int iZzY = 4;
        if (zzadVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzY = zzY(zzadVar) & 7;
            } catch (zzig unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzig.zzb(th, zzU(), this.zze, zzadVar, iZzY, z4, i);
    }

    public final int zzd(long j4) {
        zzwg zzwgVar = this.zzi;
        zzwgVar.getClass();
        return zzwgVar.zzb(j4 - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public int zze() throws zzig {
        return 0;
    }

    public final long zzf() {
        return this.zzl;
    }

    public final zzbv zzh() {
        return this.zzp;
    }

    public final zzdc zzi() {
        zzdc zzdcVar = this.zzg;
        zzdcVar.getClass();
        return zzdcVar;
    }

    public final zzkj zzk() {
        zzkj zzkjVar = this.zzc;
        zzkjVar.zzb = null;
        zzkjVar.zza = null;
        return zzkjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public zzkp zzl() {
        return null;
    }

    public final zzlr zzn() {
        zzlr zzlrVar = this.zzd;
        zzlrVar.getClass();
        return zzlrVar;
    }

    public final zzoj zzo() {
        zzoj zzojVar = this.zzf;
        zzojVar.getClass();
        return zzojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final zzwg zzp() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzq() {
        synchronized (this.zza) {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzr() {
        zzdb.zzf(this.zzh == 1);
        zzkj zzkjVar = this.zzc;
        zzkjVar.zzb = null;
        zzkjVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzs(zzlr zzlrVar, zzad[] zzadVarArr, zzwg zzwgVar, long j4, boolean z4, boolean z10, long j10, long j11, zzur zzurVar) throws zzig {
        zzdb.zzf(this.zzh == 0);
        this.zzd = zzlrVar;
        this.zzh = 1;
        zzy(z4, z10);
        zzH(zzadVarArr, zzwgVar, j10, j11, zzurVar);
        zzZ(j10, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzv(int i, zzoj zzojVar, zzdc zzdcVar) {
        this.zze = i;
        this.zzf = zzojVar;
        this.zzg = zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzw() throws IOException {
        zzwg zzwgVar = this.zzi;
        zzwgVar.getClass();
        zzwgVar.zzd();
    }

    public void zzx() {
        throw null;
    }

    public void zzz(long j4, boolean z4) throws zzig {
        throw null;
    }

    public void zzA() {
    }

    public void zzC() {
    }

    public void zzD() throws zzig {
    }

    public void zzE() {
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final zzlq zzm() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public /* synthetic */ void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public /* synthetic */ void zzM(float f10, float f11) {
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public void zzu(int i, Object obj) throws zzig {
    }

    public void zzy(boolean z4, boolean z10) throws zzig {
    }

    public void zzF(zzad[] zzadVarArr, long j4, long j10, zzur zzurVar) throws zzig {
    }
}
