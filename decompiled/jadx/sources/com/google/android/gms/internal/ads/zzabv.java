package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzabv {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzabv(List list, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = i15;
        this.zzi = i16;
        this.zzj = i17;
        this.zzk = f10;
        this.zzl = str;
    }

    public static zzabv zza(zzed zzedVar) throws zzbh {
        String strZzc;
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        try {
            zzedVar.zzM(4);
            int iZzm = zzedVar.zzm() & 3;
            int i17 = iZzm + 1;
            if (i17 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzm2 = zzedVar.zzm() & 31;
            for (int i18 = 0; i18 < iZzm2; i18++) {
                arrayList.add(zzb(zzedVar));
            }
            int iZzm3 = zzedVar.zzm();
            for (int i19 = 0; i19 < iZzm3; i19++) {
                arrayList.add(zzb(zzedVar));
            }
            if (iZzm2 > 0) {
                zzfo zzfoVarZzf = zzfp.zzf((byte[]) arrayList.get(0), iZzm + 2, ((byte[]) arrayList.get(0)).length);
                int i20 = zzfoVarZzf.zze;
                int i21 = zzfoVarZzf.zzf;
                int i22 = zzfoVarZzf.zzh + 8;
                int i23 = zzfoVarZzf.zzi + 8;
                int i24 = zzfoVarZzf.zzj;
                int i25 = zzfoVarZzf.zzk;
                int i26 = zzfoVarZzf.zzl;
                int i27 = zzfoVarZzf.zzm;
                float f11 = zzfoVarZzf.zzg;
                strZzc = zzdd.zzc(zzfoVarZzf.zza, zzfoVarZzf.zzb, zzfoVarZzf.zzc);
                i13 = i26;
                i14 = i27;
                f10 = f11;
                i12 = i23;
                i15 = i24;
                i16 = i25;
                i = i20;
                i10 = i21;
                i11 = i22;
            } else {
                strZzc = null;
                i = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = 16;
                f10 = 1.0f;
                i15 = -1;
                i16 = -1;
            }
            return new zzabv(arrayList, i17, i, i10, i11, i12, i15, i16, i13, i14, f10, strZzc);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbh.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzed zzedVar) {
        int iZzq = zzedVar.zzq();
        int iZzd = zzedVar.zzd();
        zzedVar.zzM(iZzq);
        return zzdd.zze(zzedVar.zzN(), iZzd, iZzq);
    }
}
