package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzad {
    public static final /* synthetic */ int zzK = 0;
    public final int zzA;
    public final zzm zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    public final int zzI;
    public final int zzJ;
    private int zzL;
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final String zzk;
    public final zzbd zzl;
    public final Object zzm;
    public final String zzn;
    public final String zzo;
    public final int zzp;
    public final int zzq;
    public final List zzr;
    public final zzw zzs;
    public final long zzt;
    public final int zzu;
    public final int zzv;
    public final float zzw;
    public final int zzx;
    public final float zzy;
    public final byte[] zzz;

    static {
        new zzad(new zzab());
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzad.class == obj.getClass()) {
            zzad zzadVar = (zzad) obj;
            int i10 = this.zzL;
            if ((i10 == 0 || (i = zzadVar.zzL) == 0 || i10 == i) && this.zze == zzadVar.zze && this.zzf == zzadVar.zzf && this.zzh == zzadVar.zzh && this.zzi == zzadVar.zzi && this.zzp == zzadVar.zzp && this.zzt == zzadVar.zzt && this.zzu == zzadVar.zzu && this.zzv == zzadVar.zzv && this.zzx == zzadVar.zzx && this.zzA == zzadVar.zzA && this.zzC == zzadVar.zzC && this.zzD == zzadVar.zzD && this.zzE == zzadVar.zzE && this.zzF == zzadVar.zzF && this.zzG == zzadVar.zzG && this.zzH == zzadVar.zzH && this.zzJ == zzadVar.zzJ && Float.compare(this.zzw, zzadVar.zzw) == 0 && Float.compare(this.zzy, zzadVar.zzy) == 0 && Objects.equals(this.zza, zzadVar.zza) && Objects.equals(this.zzb, zzadVar.zzb) && this.zzc.equals(zzadVar.zzc) && Objects.equals(this.zzk, zzadVar.zzk) && Objects.equals(this.zzn, zzadVar.zzn) && Objects.equals(this.zzo, zzadVar.zzo) && Objects.equals(this.zzd, zzadVar.zzd) && Arrays.equals(this.zzz, zzadVar.zzz) && Objects.equals(this.zzl, zzadVar.zzl) && Objects.equals(this.zzB, zzadVar.zzB) && Objects.equals(this.zzs, zzadVar.zzs) && zzd(zzadVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzL;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int iHashCode2 = this.zzc.hashCode() + ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.zzd;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 31) + this.zzf) * 961) + this.zzh) * 31) + this.zzi) * 31;
        String str4 = this.zzk;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzbd zzbdVar = this.zzl;
        int iHashCode5 = (iHashCode4 + (zzbdVar == null ? 0 : zzbdVar.hashCode())) * 961;
        String str5 = this.zzn;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zzo;
        int iFloatToIntBits = ((((((((((((((((((((Float.floatToIntBits(this.zzy) + ((((Float.floatToIntBits(this.zzw) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.zzp) * 31) + ((int) this.zzt)) * 31) + this.zzu) * 31) + this.zzv) * 31)) * 31) + this.zzx) * 31)) * 31) + this.zzA) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF) * 31) + this.zzG) * 31) + this.zzH) * 31) - 1) * 31) - 1) * 31) + this.zzJ;
        this.zzL = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzB);
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.zza);
        sb2.append(", ");
        sb2.append(this.zzb);
        sb2.append(", ");
        sb2.append(this.zzn);
        sb2.append(", ");
        sb2.append(this.zzo);
        sb2.append(", ");
        sb2.append(this.zzk);
        sb2.append(", ");
        sb2.append(this.zzj);
        sb2.append(", ");
        sb2.append(this.zzd);
        sb2.append(", [");
        sb2.append(this.zzu);
        sb2.append(", ");
        sb2.append(this.zzv);
        sb2.append(", ");
        sb2.append(this.zzw);
        sb2.append(", ");
        sb2.append(strValueOf);
        sb2.append("], [");
        sb2.append(this.zzC);
        sb2.append(", ");
        return b.c(sb2, this.zzD, "])");
    }

    public final int zza() {
        int i;
        int i10 = this.zzu;
        if (i10 == -1 || (i = this.zzv) == -1) {
            return -1;
        }
        return i10 * i;
    }

    public final zzab zzb() {
        return new zzab(this, null);
    }

    public final zzad zzc(int i) {
        zzab zzabVar = new zzab(this, null);
        zzabVar.zzD(i);
        return new zzad(zzabVar);
    }

    public final boolean zzd(zzad zzadVar) {
        if (this.zzr.size() != zzadVar.zzr.size()) {
            return false;
        }
        for (int i = 0; i < this.zzr.size(); i++) {
            if (!Arrays.equals((byte[]) this.zzr.get(i), (byte[]) zzadVar.zzr.get(i))) {
                return false;
            }
        }
        return true;
    }

    private zzad(zzab zzabVar) {
        boolean z4;
        String str;
        this.zza = zzabVar.zza;
        String strZzE = zzen.zzE(zzabVar.zzd);
        this.zzd = strZzE;
        if (zzabVar.zzc.isEmpty() && zzabVar.zzb != null) {
            this.zzc = zzfzo.zzo(new zzai(strZzE, zzabVar.zzb));
            this.zzb = zzabVar.zzb;
        } else if (zzabVar.zzc.isEmpty() || zzabVar.zzb != null) {
            if (!zzabVar.zzc.isEmpty() || zzabVar.zzb != null) {
                int i = 0;
                while (true) {
                    if (i >= zzabVar.zzc.size()) {
                        z4 = false;
                        break;
                    } else {
                        if (((zzai) zzabVar.zzc.get(i)).zzb.equals(zzabVar.zzb)) {
                            z4 = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z4 = true;
                break;
            }
            zzdb.zzf(z4);
            this.zzc = zzabVar.zzc;
            this.zzb = zzabVar.zzb;
        } else {
            this.zzc = zzabVar.zzc;
            List list = zzabVar.zzc;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((zzai) list.get(0)).zzb;
                    break;
                }
                zzai zzaiVar = (zzai) it.next();
                if (TextUtils.equals(zzaiVar.zza, strZzE)) {
                    str = zzaiVar.zzb;
                    break;
                }
            }
            this.zzb = str;
        }
        this.zze = zzabVar.zze;
        zzdb.zzg(true, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.zzf = zzabVar.zzf;
        this.zzg = 0;
        int i10 = zzabVar.zzh;
        this.zzh = i10;
        int i11 = zzabVar.zzi;
        this.zzi = i11;
        this.zzj = i11 != -1 ? i11 : i10;
        this.zzk = zzabVar.zzj;
        this.zzl = zzabVar.zzk;
        this.zzm = null;
        this.zzn = zzabVar.zzl;
        this.zzo = zzabVar.zzm;
        this.zzp = zzabVar.zzn;
        this.zzq = zzabVar.zzo;
        this.zzr = zzabVar.zzp == null ? Collections.EMPTY_LIST : zzabVar.zzp;
        zzw zzwVar = zzabVar.zzq;
        this.zzs = zzwVar;
        this.zzt = zzabVar.zzr;
        this.zzu = zzabVar.zzs;
        this.zzv = zzabVar.zzt;
        this.zzw = zzabVar.zzu;
        this.zzx = zzabVar.zzv == -1 ? 0 : zzabVar.zzv;
        this.zzy = zzabVar.zzw == -1.0f ? 1.0f : zzabVar.zzw;
        this.zzz = zzabVar.zzx;
        this.zzA = zzabVar.zzy;
        this.zzB = zzabVar.zzz;
        this.zzC = zzabVar.zzA;
        this.zzD = zzabVar.zzB;
        this.zzE = zzabVar.zzC;
        this.zzF = zzabVar.zzD == -1 ? 0 : zzabVar.zzD;
        this.zzG = zzabVar.zzE != -1 ? zzabVar.zzE : 0;
        this.zzH = zzabVar.zzF;
        this.zzI = zzabVar.zzG;
        if (zzabVar.zzH != 0 || zzwVar == null) {
            this.zzJ = zzabVar.zzH;
        } else {
            this.zzJ = 1;
        }
    }
}
