package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzxl extends zzxw implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzxp zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    /* JADX WARN: Multi-variable type inference failed */
    public zzxl(int i, zzbw zzbwVar, int i10, zzxp zzxpVar, int i11, boolean z4, zzfwr zzfwrVar, int i12) {
        int i13;
        int iZzc;
        int iZzc2;
        boolean z10;
        super(i, zzbwVar, i10);
        this.zzh = zzxpVar;
        int i14 = 1;
        int i15 = true != zzxpVar.zzL ? 16 : 24;
        this.zzg = zzyb.zzh(this.zzd.zzd);
        this.zzi = zzlo.zza(i11, false);
        int i16 = 0;
        while (true) {
            int size = zzxpVar.zzn.size();
            i13 = f.API_PRIORITY_OTHER;
            if (i16 >= size) {
                iZzc = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iZzc = zzyb.zzc(this.zzd, (String) zzxpVar.zzn.get(i16), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.zzk = i16;
        this.zzj = iZzc;
        this.zzl = zzyb.zzb(this.zzd.zzf, 0);
        zzad zzadVar = this.zzd;
        int i17 = zzadVar.zzf;
        this.zzm = i17 == 0 || (i17 & 1) != 0;
        this.zzp = 1 == (zzadVar.zze & 1);
        this.zzq = zzadVar.zzC;
        this.zzr = zzadVar.zzD;
        this.zzs = zzadVar.zzj;
        this.zzf = zzfwrVar.zza(zzadVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = zzen.zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i18 = 0; i18 < strArrSplit.length; i18++) {
            strArrSplit[i18] = zzen.zzE(strArrSplit[i18]);
        }
        int i19 = 0;
        while (true) {
            if (i19 >= strArrSplit.length) {
                iZzc2 = 0;
                i19 = Integer.MAX_VALUE;
                break;
            } else {
                iZzc2 = zzyb.zzc(this.zzd, strArrSplit[i19], false);
                if (iZzc2 > 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        this.zzn = i19;
        this.zzo = iZzc2;
        for (int i20 = 0; i20 < zzxpVar.zzr.size(); i20++) {
            String str = this.zzd.zzo;
            if (str != null && str.equals(zzxpVar.zzr.get(i20))) {
                i13 = i20;
                break;
            }
        }
        this.zzt = i13;
        this.zzu = (i11 & 384) == 128;
        this.zzv = (i11 & 64) == 64;
        zzxp zzxpVar2 = this.zzh;
        if (!zzlo.zza(i11, zzxpVar2.zzN) || (!(z10 = this.zzf) && !zzxpVar2.zzG)) {
            i14 = 0;
        } else if (zzlo.zza(i11, false) && z10 && this.zzd.zzj != -1 && ((zzxpVar2.zzP || !z4) && (i15 & i11) != 0)) {
            i14 = 2;
        }
        this.zze = i14;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxl zzxlVar) {
        zzgaz zzgazVarZza = (this.zzf && this.zzi) ? zzyb.zzc : zzyb.zzc.zza();
        zzfzd zzfzdVarZzc = zzfzd.zzj().zzd(this.zzi, zzxlVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzxlVar.zzk), zzgaz.zzc().zza()).zzb(this.zzj, zzxlVar.zzj).zzb(this.zzl, zzxlVar.zzl).zzd(this.zzp, zzxlVar.zzp).zzd(this.zzm, zzxlVar.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzxlVar.zzn), zzgaz.zzc().zza()).zzb(this.zzo, zzxlVar.zzo).zzd(this.zzf, zzxlVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzxlVar.zzt), zzgaz.zzc().zza());
        boolean z4 = this.zzh.zzy;
        zzfzd zzfzdVarZzc2 = zzfzdVarZzc.zzd(this.zzu, zzxlVar.zzu).zzd(this.zzv, zzxlVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzxlVar.zzq), zzgazVarZza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzxlVar.zzr), zzgazVarZza);
        if (Objects.equals(this.zzg, zzxlVar.zzg)) {
            zzfzdVarZzc2 = zzfzdVarZzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzxlVar.zzs), zzgazVarZza);
        }
        return zzfzdVarZzc2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final /* bridge */ /* synthetic */ boolean zzc(zzxw zzxwVar) {
        String str;
        zzxl zzxlVar = (zzxl) zzxwVar;
        boolean z4 = this.zzh.zzJ;
        zzad zzadVar = this.zzd;
        int i = zzadVar.zzC;
        if (i == -1) {
            return false;
        }
        zzad zzadVar2 = zzxlVar.zzd;
        if (i != zzadVar2.zzC || (str = zzadVar.zzo) == null || !TextUtils.equals(str, zzadVar2.zzo)) {
            return false;
        }
        boolean z10 = this.zzh.zzI;
        int i10 = this.zzd.zzD;
        return i10 != -1 && i10 == zzxlVar.zzd.zzD && this.zzu == zzxlVar.zzu && this.zzv == zzxlVar.zzv;
    }
}
