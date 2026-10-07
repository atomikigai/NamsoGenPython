package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzxz extends zzxw {
    private final boolean zze;
    private final zzxp zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final boolean zzp;
    private final boolean zzq;
    private final int zzr;

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:86:0x0111  */
    public zzxz(int i, zzbw zzbwVar, int i10, zzxp zzxpVar, int i11, int i12, boolean z4) {
        boolean z10;
        boolean z11;
        int i13;
        boolean z12;
        zzad zzadVar;
        int i14;
        int i15;
        int i16;
        super(i, zzbwVar, i10);
        this.zzf = zzxpVar;
        int i17 = 1;
        int i18 = true != zzxpVar.zzE ? 16 : 24;
        if (z4) {
            zzad zzadVar2 = this.zzd;
            int i19 = zzadVar2.zzu;
            float f10 = zzadVar2.zzw;
            if (f10 == -1.0f || f10 <= 2.1474836E9f) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.zze = z10;
        if (!z4 || (((i14 = (zzadVar = this.zzd).zzu) != -1 && i14 < 0) || ((i15 = zzadVar.zzv) != -1 && i15 < 0))) {
            z11 = false;
        } else {
            float f11 = zzadVar.zzw;
            if ((f11 == -1.0f || f11 >= 0.0f) && ((i16 = zzadVar.zzj) == -1 || i16 >= 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.zzg = z11;
        this.zzh = zzlo.zza(i11, false);
        zzad zzadVar3 = this.zzd;
        float f12 = zzadVar3.zzw;
        this.zzi = f12 != -1.0f && f12 >= 10.0f;
        this.zzj = zzadVar3.zzj;
        this.zzk = zzadVar3.zza();
        this.zzm = zzyb.zzb(this.zzd.zzf, 0);
        int i20 = this.zzd.zzf;
        this.zzn = i20 == 0 || (i20 & 1) != 0;
        int i21 = 0;
        while (true) {
            if (i21 >= zzxpVar.zzl.size()) {
                i21 = f.API_PRIORITY_OTHER;
                break;
            }
            String str = this.zzd.zzo;
            if (str != null && str.equals(zzxpVar.zzl.get(i21))) {
                break;
            } else {
                i21++;
            }
        }
        this.zzl = i21;
        this.zzp = (i11 & 384) == 128;
        this.zzq = (i11 & 64) == 64;
        zzad zzadVar4 = this.zzd;
        String str2 = zzadVar4.zzo;
        if (str2 != null) {
            switch (str2) {
                case "video/dolby-vision":
                    i13 = 5;
                    break;
                case "video/av01":
                    i13 = 4;
                    break;
                case "video/hevc":
                    i13 = 3;
                    break;
                case "video/avc":
                    i13 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i13 = 2;
                    break;
                default:
                    i13 = 0;
                    break;
            }
        } else {
            i13 = 0;
        }
        this.zzr = i13;
        if ((zzadVar4.zzf & 16384) != 0) {
            i17 = 0;
        } else {
            zzxp zzxpVar2 = this.zzf;
            if (!zzlo.zza(i11, zzxpVar2.zzN) || (!(z12 = this.zze) && !zzxpVar2.zzC)) {
                i17 = 0;
            } else if (zzlo.zza(i11, false) && this.zzg && z12 && zzadVar4.zzj != -1 && (i18 & i11) != 0) {
                i17 = 2;
            }
        }
        this.zzo = i17;
    }

    public static /* synthetic */ int zza(zzxz zzxzVar, zzxz zzxzVar2) {
        zzgaz zzgazVarZza = (zzxzVar.zze && zzxzVar.zzh) ? zzyb.zzc : zzyb.zzc.zza();
        zzfzd zzfzdVarZzj = zzfzd.zzj();
        boolean z4 = zzxzVar.zzf.zzy;
        return zzfzdVarZzj.zzc(Integer.valueOf(zzxzVar.zzk), Integer.valueOf(zzxzVar2.zzk), zzgazVarZza).zzc(Integer.valueOf(zzxzVar.zzj), Integer.valueOf(zzxzVar2.zzj), zzgazVarZza).zza();
    }

    public static /* synthetic */ int zzd(zzxz zzxzVar, zzxz zzxzVar2) {
        zzfzd zzfzdVarZzd = zzfzd.zzj().zzd(zzxzVar.zzh, zzxzVar2.zzh).zzb(zzxzVar.zzm, zzxzVar2.zzm).zzd(zzxzVar.zzn, zzxzVar2.zzn).zzd(zzxzVar.zzi, zzxzVar2.zzi).zzd(zzxzVar.zze, zzxzVar2.zze).zzd(zzxzVar.zzg, zzxzVar2.zzg).zzc(Integer.valueOf(zzxzVar.zzl), Integer.valueOf(zzxzVar2.zzl), zzgaz.zzc().zza()).zzd(zzxzVar.zzp, zzxzVar2.zzp).zzd(zzxzVar.zzq, zzxzVar2.zzq);
        if (zzxzVar.zzp && zzxzVar.zzq) {
            zzfzdVarZzd = zzfzdVarZzd.zzb(zzxzVar.zzr, zzxzVar2.zzr);
        }
        return zzfzdVarZzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final int zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final /* bridge */ /* synthetic */ boolean zzc(zzxw zzxwVar) {
        zzxz zzxzVar = (zzxz) zzxwVar;
        if (!Objects.equals(this.zzd.zzo, zzxzVar.zzd.zzo)) {
            return false;
        }
        boolean z4 = this.zzf.zzF;
        return this.zzp == zzxzVar.zzp && this.zzq == zzxzVar.zzq;
    }
}
