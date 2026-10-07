package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamt implements zzamm {
    private final zzanq zza;
    private long zze;
    private String zzg;
    private zzadx zzh;
    private zzams zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzane zzb = new zzane(7, 128);
    private final zzane zzc = new zzane(8, 128);
    private final zzane zzd = new zzane(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzed zzm = new zzed();

    public zzamt(zzanq zzanqVar, boolean z4, boolean z10) {
        this.zza = zzanqVar;
    }

    private final void zzf(byte[] bArr, int i, int i10) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i, i10);
            this.zzc.zza(bArr, i, i10);
        }
        this.zzd.zza(bArr, i, i10);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) {
        int i;
        int i10;
        zzdb.zzb(this.zzh);
        int i11 = zzen.zza;
        int iZzd = zzedVar.zzd();
        int iZze = zzedVar.zze();
        byte[] bArrZzN = zzedVar.zzN();
        this.zze += (long) zzedVar.zzb();
        this.zzh.zzq(zzedVar, zzedVar.zzb());
        while (true) {
            int iZza = zzfp.zza(bArrZzN, iZzd, iZze, this.zzf);
            if (iZza == iZze) {
                zzf(bArrZzN, iZzd, iZze);
                return;
            }
            int i12 = iZza + 3;
            int i13 = bArrZzN[i12] & 31;
            int i14 = iZza - iZzd;
            if (i14 > 0) {
                zzf(bArrZzN, iZzd, iZza);
            }
            int i15 = iZze - iZza;
            long j4 = this.zze - ((long) i15);
            int i16 = i14 < 0 ? -i14 : 0;
            long j10 = this.zzk;
            if (this.zzj) {
                i = iZze;
                i10 = i12;
            } else {
                this.zzb.zzd(i16);
                this.zzc.zzd(i16);
                if (this.zzj) {
                    i = iZze;
                    i10 = i12;
                    zzane zzaneVar = this.zzb;
                    if (zzaneVar.zze()) {
                        zzfo zzfoVarZzf = zzfp.zzf(zzaneVar.zza, 4, zzaneVar.zzb);
                        this.zza.zze(zzfoVarZzf.zzm);
                        this.zzi.zzc(zzfoVarZzf);
                        this.zzb.zzb();
                    } else {
                        zzane zzaneVar2 = this.zzc;
                        if (zzaneVar2.zze()) {
                            this.zzi.zzb(zzfp.zze(zzaneVar2.zza, 4, zzaneVar2.zzb));
                            this.zzc.zzb();
                        }
                    }
                } else if (this.zzb.zze() && this.zzc.zze()) {
                    ArrayList arrayList = new ArrayList();
                    zzane zzaneVar3 = this.zzb;
                    arrayList.add(Arrays.copyOf(zzaneVar3.zza, zzaneVar3.zzb));
                    zzane zzaneVar4 = this.zzc;
                    arrayList.add(Arrays.copyOf(zzaneVar4.zza, zzaneVar4.zzb));
                    zzane zzaneVar5 = this.zzb;
                    zzfo zzfoVarZzf2 = zzfp.zzf(zzaneVar5.zza, 4, zzaneVar5.zzb);
                    zzane zzaneVar6 = this.zzc;
                    zzfn zzfnVarZze = zzfp.zze(zzaneVar6.zza, 4, zzaneVar6.zzb);
                    i10 = i12;
                    String strZzc = zzdd.zzc(zzfoVarZzf2.zza, zzfoVarZzf2.zzb, zzfoVarZzf2.zzc);
                    zzadx zzadxVar = this.zzh;
                    zzab zzabVar = new zzab();
                    i = iZze;
                    zzabVar.zzL(this.zzg);
                    zzabVar.zzZ("video/avc");
                    zzabVar.zzA(strZzc);
                    zzabVar.zzae(zzfoVarZzf2.zze);
                    zzabVar.zzJ(zzfoVarZzf2.zzf);
                    zzk zzkVar = new zzk();
                    zzkVar.zzc(zzfoVarZzf2.zzj);
                    zzkVar.zzb(zzfoVarZzf2.zzk);
                    zzkVar.zzd(zzfoVarZzf2.zzl);
                    zzkVar.zzf(zzfoVarZzf2.zzh + 8);
                    zzkVar.zza(zzfoVarZzf2.zzi + 8);
                    zzabVar.zzB(zzkVar.zzg());
                    zzabVar.zzV(zzfoVarZzf2.zzg);
                    zzabVar.zzM(arrayList);
                    zzabVar.zzR(zzfoVarZzf2.zzm);
                    zzadxVar.zzl(zzabVar.zzaf());
                    this.zzj = true;
                    this.zzi.zzc(zzfoVarZzf2);
                    this.zzi.zzb(zzfnVarZze);
                    this.zzb.zzb();
                    this.zzc.zzb();
                } else {
                    i = iZze;
                    i10 = i12;
                }
            }
            if (this.zzd.zzd(i16)) {
                zzane zzaneVar7 = this.zzd;
                this.zzm.zzJ(this.zzd.zza, zzfp.zzb(zzaneVar7.zza, zzaneVar7.zzb));
                this.zzm.zzL(4);
                this.zza.zza(j10, this.zzm);
            }
            if (this.zzi.zzf(j4, i15, this.zzj)) {
                this.zzl = false;
            }
            long j11 = this.zzk;
            if (!this.zzj) {
                this.zzb.zzc(i13);
                this.zzc.zzc(i13);
            }
            this.zzd.zzc(i13);
            this.zzi.zze(j4, i13, j11, this.zzl);
            iZzd = i10;
            iZze = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zzg = zzaoaVar.zzb();
        zzadx zzadxVarZzw = zzacuVar.zzw(zzaoaVar.zza(), 2);
        this.zzh = zzadxVarZzw;
        this.zzi = new zzams(zzadxVarZzw, false, false);
        this.zza.zzb(zzacuVar, zzaoaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z4) {
        zzdb.zzb(this.zzh);
        int i = zzen.zza;
        if (z4) {
            this.zza.zzc();
            this.zzi.zza(this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j4, int i) {
        this.zzk = j4;
        int i10 = i & 2;
        this.zzl = (i10 != 0) | this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzfp.zzh(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        this.zza.zzc();
        zzams zzamsVar = this.zzi;
        if (zzamsVar != null) {
            zzamsVar.zzd();
        }
    }
}
