package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamv implements zzamm {
    private final zzanq zza;
    private String zzb;
    private zzadx zzc;
    private zzamu zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzane zzg = new zzane(32, 128);
    private final zzane zzh = new zzane(33, 128);
    private final zzane zzi = new zzane(34, 128);
    private final zzane zzj = new zzane(39, 128);
    private final zzane zzk = new zzane(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzed zzn = new zzed();

    public zzamv(zzanq zzanqVar) {
        this.zza = zzanqVar;
    }

    private final void zzf(byte[] bArr, int i, int i10) {
        this.zzd.zzc(bArr, i, i10);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i10);
            this.zzh.zza(bArr, i, i10);
            this.zzi.zza(bArr, i, i10);
        }
        this.zzj.zza(bArr, i, i10);
        this.zzk.zza(bArr, i, i10);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0156  */
    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) {
        zzdb.zzb(this.zzc);
        int i = zzen.zza;
        while (zzedVar.zzb() > 0) {
            int iZzd = zzedVar.zzd();
            int iZze = zzedVar.zze();
            byte[] bArrZzN = zzedVar.zzN();
            this.zzl += (long) zzedVar.zzb();
            this.zzc.zzq(zzedVar, zzedVar.zzb());
            while (iZzd < iZze) {
                int iZza = zzfp.zza(bArrZzN, iZzd, iZze, this.zzf);
                if (iZza == iZze) {
                    zzf(bArrZzN, iZzd, iZze);
                    return;
                }
                int i10 = iZza + 3;
                int i11 = bArrZzN[i10] & 126;
                int i12 = iZza - iZzd;
                if (i12 > 0) {
                    zzf(bArrZzN, iZzd, iZza);
                }
                int i13 = iZze - iZza;
                long j4 = this.zzl - ((long) i13);
                int i14 = i12 < 0 ? -i12 : 0;
                long j10 = this.zzm;
                this.zzd.zzb(j4, i13, this.zze);
                if (!this.zze) {
                    this.zzg.zzd(i14);
                    this.zzh.zzd(i14);
                    this.zzi.zzd(i14);
                    zzane zzaneVar = this.zzg;
                    if (zzaneVar.zze()) {
                        zzane zzaneVar2 = this.zzh;
                        if (zzaneVar2.zze()) {
                            zzane zzaneVar3 = this.zzi;
                            if (zzaneVar3.zze()) {
                                String str = this.zzb;
                                int i15 = zzaneVar.zzb;
                                byte[] bArr = new byte[zzaneVar2.zzb + i15 + zzaneVar3.zzb];
                                System.arraycopy(zzaneVar.zza, 0, bArr, 0, i15);
                                System.arraycopy(zzaneVar2.zza, 0, bArr, zzaneVar.zzb, zzaneVar2.zzb);
                                System.arraycopy(zzaneVar3.zza, 0, bArr, zzaneVar.zzb + zzaneVar2.zzb, zzaneVar3.zzb);
                                String strZzd = null;
                                zzfj zzfjVarZzc = zzfp.zzc(zzaneVar2.zza, 3, zzaneVar2.zzb, null);
                                zzfe zzfeVar = zzfjVarZzc.zza;
                                if (zzfeVar != null) {
                                    int i16 = zzfeVar.zzf;
                                    int[] iArr = zzfeVar.zze;
                                    strZzd = zzdd.zzd(zzfeVar.zza, zzfeVar.zzb, zzfeVar.zzc, zzfeVar.zzd, iArr, i16);
                                }
                                zzab zzabVar = new zzab();
                                zzabVar.zzL(str);
                                zzabVar.zzZ("video/hevc");
                                zzabVar.zzA(strZzd);
                                zzabVar.zzae(zzfjVarZzc.zzd);
                                zzabVar.zzJ(zzfjVarZzc.zze);
                                zzk zzkVar = new zzk();
                                zzkVar.zzc(zzfjVarZzc.zzh);
                                zzkVar.zzb(zzfjVarZzc.zzi);
                                zzkVar.zzd(zzfjVarZzc.zzj);
                                zzkVar.zzf(zzfjVarZzc.zzb + 8);
                                zzkVar.zza(zzfjVarZzc.zzc + 8);
                                zzabVar.zzB(zzkVar.zzg());
                                zzabVar.zzV(zzfjVarZzc.zzf);
                                zzabVar.zzR(zzfjVarZzc.zzg);
                                zzabVar.zzM(Collections.singletonList(bArr));
                                zzad zzadVarZzaf = zzabVar.zzaf();
                                this.zzc.zzl(zzadVarZzaf);
                                zzfwq.zzk(zzadVarZzaf.zzq != -1);
                                this.zza.zze(zzadVarZzaf.zzq);
                                this.zze = true;
                            }
                        }
                    }
                }
                if (this.zzj.zzd(i14)) {
                    zzane zzaneVar4 = this.zzj;
                    this.zzn.zzJ(this.zzj.zza, zzfp.zzb(zzaneVar4.zza, zzaneVar4.zzb));
                    this.zzn.zzM(5);
                    this.zza.zza(j10, this.zzn);
                }
                if (this.zzk.zzd(i14)) {
                    zzane zzaneVar5 = this.zzk;
                    this.zzn.zzJ(this.zzk.zza, zzfp.zzb(zzaneVar5.zza, zzaneVar5.zzb));
                    this.zzn.zzM(5);
                    this.zza.zza(j10, this.zzn);
                }
                int i17 = i11 >> 1;
                this.zzd.zze(j4, i13, i17, this.zzm, this.zze);
                if (!this.zze) {
                    this.zzg.zzc(i17);
                    this.zzh.zzc(i17);
                    this.zzi.zzc(i17);
                }
                this.zzj.zzc(i17);
                this.zzk.zzc(i17);
                iZzd = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zzb = zzaoaVar.zzb();
        zzadx zzadxVarZzw = zzacuVar.zzw(zzaoaVar.zza(), 2);
        this.zzc = zzadxVarZzw;
        this.zzd = new zzamu(zzadxVarZzw);
        this.zza.zzb(zzacuVar, zzaoaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z4) {
        zzdb.zzb(this.zzc);
        int i = zzen.zza;
        if (z4) {
            this.zza.zzc();
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j4, int i) {
        this.zzm = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzfp.zzh(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        this.zza.zzc();
        zzamu zzamuVar = this.zzd;
        if (zzamuVar != null) {
            zzamuVar.zzd();
        }
    }
}
