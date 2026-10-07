package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzay {
    private CharSequence zza;
    private CharSequence zzb;
    private CharSequence zzc;
    private CharSequence zzd;
    private CharSequence zze;
    private byte[] zzf;
    private Integer zzg;
    private Integer zzh;
    private Integer zzi;
    private Integer zzj;
    private Boolean zzk;
    private Integer zzl;
    private Integer zzm;
    private Integer zzn;
    private Integer zzo;
    private Integer zzp;
    private Integer zzq;
    private CharSequence zzr;
    private CharSequence zzs;
    private CharSequence zzt;
    private CharSequence zzu;
    private CharSequence zzv;
    private Integer zzw;

    public zzay() {
    }

    public final zzay zza(byte[] bArr, int i) {
        if (this.zzf != null && !Integer.valueOf(i).equals(3) && Objects.equals(this.zzg, 3)) {
            return this;
        }
        this.zzf = (byte[]) bArr.clone();
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public final zzay zzb(zzba zzbaVar) {
        if (zzbaVar != null) {
            CharSequence charSequence = zzbaVar.zzb;
            if (charSequence != null) {
                this.zza = charSequence;
            }
            CharSequence charSequence2 = zzbaVar.zzc;
            if (charSequence2 != null) {
                this.zzb = charSequence2;
            }
            CharSequence charSequence3 = zzbaVar.zzd;
            if (charSequence3 != null) {
                this.zzc = charSequence3;
            }
            CharSequence charSequence4 = zzbaVar.zze;
            if (charSequence4 != null) {
                this.zzd = charSequence4;
            }
            CharSequence charSequence5 = zzbaVar.zzf;
            if (charSequence5 != null) {
                this.zze = charSequence5;
            }
            byte[] bArr = zzbaVar.zzg;
            if (bArr != null) {
                Integer num = zzbaVar.zzh;
                this.zzf = (byte[]) bArr.clone();
                this.zzg = num;
            }
            Integer num2 = zzbaVar.zzi;
            if (num2 != null) {
                this.zzh = num2;
            }
            Integer num3 = zzbaVar.zzj;
            if (num3 != null) {
                this.zzi = num3;
            }
            Integer num4 = zzbaVar.zzk;
            if (num4 != null) {
                this.zzj = num4;
            }
            Boolean bool = zzbaVar.zzl;
            if (bool != null) {
                this.zzk = bool;
            }
            Integer num5 = zzbaVar.zzm;
            if (num5 != null) {
                this.zzl = num5;
            }
            Integer num6 = zzbaVar.zzn;
            if (num6 != null) {
                this.zzl = num6;
            }
            Integer num7 = zzbaVar.zzo;
            if (num7 != null) {
                this.zzm = num7;
            }
            Integer num8 = zzbaVar.zzp;
            if (num8 != null) {
                this.zzn = num8;
            }
            Integer num9 = zzbaVar.zzq;
            if (num9 != null) {
                this.zzo = num9;
            }
            Integer num10 = zzbaVar.zzr;
            if (num10 != null) {
                this.zzp = num10;
            }
            Integer num11 = zzbaVar.zzs;
            if (num11 != null) {
                this.zzq = num11;
            }
            CharSequence charSequence6 = zzbaVar.zzt;
            if (charSequence6 != null) {
                this.zzr = charSequence6;
            }
            CharSequence charSequence7 = zzbaVar.zzu;
            if (charSequence7 != null) {
                this.zzs = charSequence7;
            }
            CharSequence charSequence8 = zzbaVar.zzv;
            if (charSequence8 != null) {
                this.zzt = charSequence8;
            }
            CharSequence charSequence9 = zzbaVar.zzw;
            if (charSequence9 != null) {
                this.zzu = charSequence9;
            }
            CharSequence charSequence10 = zzbaVar.zzx;
            if (charSequence10 != null) {
                this.zzv = charSequence10;
            }
            Integer num12 = zzbaVar.zzy;
            if (num12 != null) {
                this.zzw = num12;
            }
        }
        return this;
    }

    public final zzay zzc(CharSequence charSequence) {
        this.zzd = charSequence;
        return this;
    }

    public final zzay zzd(CharSequence charSequence) {
        this.zzc = charSequence;
        return this;
    }

    public final zzay zze(CharSequence charSequence) {
        this.zzb = charSequence;
        return this;
    }

    public final zzay zzf(CharSequence charSequence) {
        this.zzs = charSequence;
        return this;
    }

    public final zzay zzg(CharSequence charSequence) {
        this.zzt = charSequence;
        return this;
    }

    public final zzay zzh(CharSequence charSequence) {
        this.zze = charSequence;
        return this;
    }

    public final zzay zzi(CharSequence charSequence) {
        this.zzu = charSequence;
        return this;
    }

    public final zzay zzj(Integer num) {
        this.zzn = num;
        return this;
    }

    public final zzay zzk(Integer num) {
        this.zzm = num;
        return this;
    }

    public final zzay zzl(Integer num) {
        this.zzl = num;
        return this;
    }

    public final zzay zzm(Integer num) {
        this.zzq = num;
        return this;
    }

    public final zzay zzn(Integer num) {
        this.zzp = num;
        return this;
    }

    public final zzay zzo(Integer num) {
        this.zzo = num;
        return this;
    }

    public final zzay zzp(CharSequence charSequence) {
        this.zzv = charSequence;
        return this;
    }

    public final zzay zzq(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzay zzr(Integer num) {
        this.zzi = num;
        return this;
    }

    public final zzay zzs(Integer num) {
        this.zzh = num;
        return this;
    }

    public final zzay zzt(CharSequence charSequence) {
        this.zzr = charSequence;
        return this;
    }

    public final zzba zzu() {
        return new zzba(this);
    }

    public /* synthetic */ zzay(zzba zzbaVar, zzaz zzazVar) {
        this.zza = zzbaVar.zzb;
        this.zzb = zzbaVar.zzc;
        this.zzc = zzbaVar.zzd;
        this.zzd = zzbaVar.zze;
        this.zze = zzbaVar.zzf;
        this.zzf = zzbaVar.zzg;
        this.zzg = zzbaVar.zzh;
        this.zzh = zzbaVar.zzi;
        this.zzi = zzbaVar.zzj;
        this.zzj = zzbaVar.zzk;
        this.zzk = zzbaVar.zzl;
        this.zzl = zzbaVar.zzn;
        this.zzm = zzbaVar.zzo;
        this.zzn = zzbaVar.zzp;
        this.zzo = zzbaVar.zzq;
        this.zzp = zzbaVar.zzr;
        this.zzq = zzbaVar.zzs;
        this.zzr = zzbaVar.zzt;
        this.zzs = zzbaVar.zzu;
        this.zzt = zzbaVar.zzv;
        this.zzu = zzbaVar.zzw;
        this.zzv = zzbaVar.zzx;
        this.zzw = zzbaVar.zzy;
    }
}
