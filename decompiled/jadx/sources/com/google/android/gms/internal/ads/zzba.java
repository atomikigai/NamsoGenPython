package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzba {
    public static final zzba zza = new zzba(new zzay());
    public final CharSequence zzb;
    public final CharSequence zzc;
    public final CharSequence zzd;
    public final CharSequence zze;
    public final CharSequence zzf;
    public final byte[] zzg;
    public final Integer zzh;
    public final Integer zzi;
    public final Integer zzj;

    @Deprecated
    public final Integer zzk;
    public final Boolean zzl;

    @Deprecated
    public final Integer zzm;
    public final Integer zzn;
    public final Integer zzo;
    public final Integer zzp;
    public final Integer zzq;
    public final Integer zzr;
    public final Integer zzs;
    public final CharSequence zzt;
    public final CharSequence zzu;
    public final CharSequence zzv;
    public final CharSequence zzw;
    public final CharSequence zzx;
    public final Integer zzy;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
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
        Integer.toString(zzbbs.zzq.zzf, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzba.class == obj.getClass()) {
            zzba zzbaVar = (zzba) obj;
            if (Objects.equals(this.zzb, zzbaVar.zzb) && Objects.equals(this.zzc, zzbaVar.zzc) && Objects.equals(this.zzd, zzbaVar.zzd) && Objects.equals(this.zze, zzbaVar.zze) && Objects.equals(this.zzf, zzbaVar.zzf) && Arrays.equals(this.zzg, zzbaVar.zzg) && Objects.equals(this.zzh, zzbaVar.zzh) && Objects.equals(this.zzi, zzbaVar.zzi) && Objects.equals(this.zzj, zzbaVar.zzj) && Objects.equals(this.zzk, zzbaVar.zzk) && Objects.equals(this.zzl, zzbaVar.zzl) && Objects.equals(this.zzn, zzbaVar.zzn) && Objects.equals(this.zzo, zzbaVar.zzo) && Objects.equals(this.zzp, zzbaVar.zzp) && Objects.equals(this.zzq, zzbaVar.zzq) && Objects.equals(this.zzr, zzbaVar.zzr) && Objects.equals(this.zzs, zzbaVar.zzs) && Objects.equals(this.zzt, zzbaVar.zzt) && Objects.equals(this.zzu, zzbaVar.zzu) && Objects.equals(this.zzv, zzbaVar.zzv) && Objects.equals(this.zzw, zzbaVar.zzw) && Objects.equals(this.zzx, zzbaVar.zzx) && Objects.equals(this.zzy, zzbaVar.zzy)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, this.zzd, this.zze, null, null, this.zzf, null, null, null, Integer.valueOf(Arrays.hashCode(this.zzg)), this.zzh, null, this.zzi, this.zzj, this.zzk, this.zzl, null, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, null, null, this.zzw, null, this.zzx, this.zzy, Boolean.TRUE});
    }

    public final zzay zza() {
        return new zzay(this, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    private zzba(zzay zzayVar) {
        Boolean boolValueOf = zzayVar.zzk;
        Integer numValueOf = zzayVar.zzj;
        Integer numValueOf2 = zzayVar.zzw;
        int i = 1;
        int i10 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        case 20:
                        default:
                            i = 0;
                            break;
                        case zzbbs.zzt.zzm /* 21 */:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                } else {
                    i = 0;
                }
                numValueOf = Integer.valueOf(i);
            }
        } else if (numValueOf != null) {
            boolean z4 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z4);
            if (z4 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i10 = 21;
                        break;
                    case 3:
                        i10 = 22;
                        break;
                    case 4:
                        i10 = 23;
                        break;
                    case 5:
                        i10 = 24;
                        break;
                    case 6:
                        i10 = 25;
                        break;
                    default:
                        i10 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i10);
            }
        } else {
            numValueOf = null;
        }
        this.zzb = zzayVar.zza;
        this.zzc = zzayVar.zzb;
        this.zzd = zzayVar.zzc;
        this.zze = zzayVar.zzd;
        this.zzf = zzayVar.zze;
        this.zzg = zzayVar.zzf;
        this.zzh = zzayVar.zzg;
        this.zzi = zzayVar.zzh;
        this.zzj = zzayVar.zzi;
        this.zzk = numValueOf;
        this.zzl = boolValueOf;
        this.zzm = zzayVar.zzl;
        this.zzn = zzayVar.zzl;
        this.zzo = zzayVar.zzm;
        this.zzp = zzayVar.zzn;
        this.zzq = zzayVar.zzo;
        this.zzr = zzayVar.zzp;
        this.zzs = zzayVar.zzq;
        this.zzt = zzayVar.zzr;
        this.zzu = zzayVar.zzs;
        this.zzv = zzayVar.zzt;
        this.zzw = zzayVar.zzu;
        this.zzx = zzayVar.zzv;
        this.zzy = numValueOf2;
    }
}
