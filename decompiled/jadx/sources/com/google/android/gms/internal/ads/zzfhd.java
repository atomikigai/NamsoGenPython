package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.common.api.f;
import d6.p;
import e6.o3;
import e6.t;
import e6.u3;
import i6.h;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfhd implements zzfhc {
    private final ConcurrentHashMap zza;
    private final zzfhj zzb;
    private final zzfhf zzc = new zzfhf();

    public zzfhd(zzfhj zzfhjVar) {
        this.zza = new ConcurrentHashMap(zzfhjVar.zzd);
        this.zzb = zzfhjVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfhj> creator = zzfhj.CREATOR;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgi)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.zzb.zzb);
            sb2.append(" PoolCollection");
            sb2.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb2.append(i);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((zzfhm) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i10 = 0; i10 < ((zzfhb) entry.getValue()).zzb(); i10++) {
                    sb2.append("[O]");
                }
                for (int iZzb = ((zzfhb) entry.getValue()).zzb(); iZzb < this.zzb.zzd; iZzb++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((zzfhb) entry.getValue()).zzg());
                sb2.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb2.append(i);
                sb2.append(".\n");
            }
            h.b(sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final zzfhj zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final synchronized zzfhl zzb(zzfhm zzfhmVar) {
        zzfhl zzfhlVarZze;
        try {
            zzfhb zzfhbVar = (zzfhb) this.zza.get(zzfhmVar);
            if (zzfhbVar != null) {
                zzfhlVarZze = zzfhbVar.zze();
                if (zzfhlVarZze == null) {
                    this.zzc.zze();
                }
                zzfhz zzfhzVarZzf = zzfhbVar.zzf();
                if (zzfhlVarZze != null) {
                    zzbbs.zzb.zzc zzcVarZzd = zzbbs.zzb.zzd();
                    zzbbs.zzb.zza.C0003zza c0003zzaZza = zzbbs.zzb.zza.zza();
                    c0003zzaZza.zzf(zzbbs.zzb.zzd.IN_MEMORY);
                    zzbbs.zzb.zze.zza zzaVarZzb = zzbbs.zzb.zze.zzb();
                    zzaVarZzb.zzd(zzfhzVarZzf.zza);
                    zzaVarZzb.zze(zzfhzVarZzf.zzb);
                    c0003zzaZza.zzg(zzaVarZzb);
                    zzcVarZzd.zzd(c0003zzaZza);
                    zzfhlVarZze.zza.zzb().zzc().zzi(zzcVarZzd.zzbr());
                }
                zzf();
            } else {
                this.zzc.zzf();
                zzf();
                zzfhlVarZze = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzfhlVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    @Deprecated
    public final zzfhm zzc(o3 o3Var, String str, u3 u3Var) {
        return new zzfhn(o3Var, str, new zzbwa(this.zzb.zza).zza().zzj, this.zzb.zzf, u3Var);
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final synchronized boolean zzd(zzfhm zzfhmVar, zzfhl zzfhlVar) {
        boolean zZzh;
        try {
            zzfhb zzfhbVar = (zzfhb) this.zza.get(zzfhmVar);
            p.C.f2983j.getClass();
            zzfhlVar.zzd = System.currentTimeMillis();
            if (zzfhbVar == null) {
                zzfhj zzfhjVar = this.zzb;
                zzfhb zzfhbVar2 = new zzfhb(zzfhjVar.zzd, zzfhjVar.zze * zzbbs.zzq.zzf);
                if (this.zza.size() == this.zzb.zzc) {
                    int i = this.zzb.zzg;
                    int i10 = i - 1;
                    zzfhm zzfhmVar2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long jZzc = Long.MAX_VALUE;
                    if (i10 == 0) {
                        for (Map.Entry entry : this.zza.entrySet()) {
                            if (((zzfhb) entry.getValue()).zzc() < jZzc) {
                                jZzc = ((zzfhb) entry.getValue()).zzc();
                                zzfhmVar2 = (zzfhm) entry.getKey();
                            }
                        }
                        if (zzfhmVar2 != null) {
                            this.zza.remove(zzfhmVar2);
                        }
                    } else if (i10 == 1) {
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfhb) entry2.getValue()).zzd() < jZzc) {
                                jZzc = ((zzfhb) entry2.getValue()).zzd();
                                zzfhmVar2 = (zzfhm) entry2.getKey();
                            }
                        }
                        if (zzfhmVar2 != null) {
                            this.zza.remove(zzfhmVar2);
                        }
                    } else if (i10 == 2) {
                        int iZza = f.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfhb) entry3.getValue()).zza() < iZza) {
                                iZza = ((zzfhb) entry3.getValue()).zza();
                                zzfhmVar2 = (zzfhm) entry3.getKey();
                            }
                        }
                        if (zzfhmVar2 != null) {
                            this.zza.remove(zzfhmVar2);
                        }
                    }
                    this.zzc.zzg();
                }
                this.zza.put(zzfhmVar, zzfhbVar2);
                this.zzc.zzd();
                zzfhbVar = zzfhbVar2;
            }
            zZzh = zzfhbVar.zzh(zzfhlVar);
            this.zzc.zzc();
            zzfhe zzfheVarZza = this.zzc.zza();
            zzfhz zzfhzVarZzf = zzfhbVar.zzf();
            zzbbs.zzb.zzc zzcVarZzd = zzbbs.zzb.zzd();
            zzbbs.zzb.zza.C0003zza c0003zzaZza = zzbbs.zzb.zza.zza();
            c0003zzaZza.zzf(zzbbs.zzb.zzd.IN_MEMORY);
            zzbbs.zzb.zzg.zza zzaVarZzb = zzbbs.zzb.zzg.zzb();
            zzaVarZzb.zze(zzfheVarZza.zza);
            zzaVarZzb.zzf(zzfheVarZza.zzb);
            zzaVarZzb.zzg(zzfhzVarZzf.zzb);
            c0003zzaZza.zzi(zzaVarZzb);
            zzcVarZzd.zzd(c0003zzaZza);
            zzfhlVar.zza.zzb().zzc().zzj(zzcVarZzd.zzbr());
            zzf();
        } catch (Throwable th) {
            throw th;
        }
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final synchronized boolean zze(zzfhm zzfhmVar) {
        zzfhb zzfhbVar = (zzfhb) this.zza.get(zzfhmVar);
        if (zzfhbVar == null) {
            return true;
        }
        return zzfhbVar.zzb() < this.zzb.zzd;
    }
}
