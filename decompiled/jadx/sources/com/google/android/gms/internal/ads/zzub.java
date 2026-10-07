package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzub implements zzwi {
    private final zzfzo zza;
    private long zzb;

    public zzub(List list, List list2) {
        zzfzl zzfzlVar = new zzfzl();
        zzdb.zzd(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            zzfzlVar.zzf(new zzua((zzwi) list.get(i), (List) list2.get(i)));
        }
        this.zza = zzfzlVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzb() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            zzua zzuaVar = (zzua) this.zza.get(i);
            long jZzb = zzuaVar.zzb();
            if ((zzuaVar.zza().contains(1) || zzuaVar.zza().contains(2) || zzuaVar.zza().contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j4 = this.zzb;
        return j4 != -9223372036854775807L ? j4 : jMin2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzc() {
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            long jZzc = ((zzua) this.zza.get(i)).zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzm(long j4) {
        for (int i = 0; i < this.zza.size(); i++) {
            ((zzua) this.zza.get(i)).zzm(j4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwi
    public final boolean zzo(zzko zzkoVar) {
        boolean zZzo;
        boolean z4 = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            zZzo = false;
            for (int i = 0; i < this.zza.size(); i++) {
                long jZzc2 = ((zzua) this.zza.get(i)).zzc();
                boolean z10 = jZzc2 != Long.MIN_VALUE && jZzc2 <= zzkoVar.zza;
                if (jZzc2 == jZzc || z10) {
                    zZzo |= ((zzua) this.zza.get(i)).zzo(zzkoVar);
                }
            }
            z4 |= zZzo;
        } while (zZzo);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwi
    public final boolean zzp() {
        for (int i = 0; i < this.zza.size(); i++) {
            if (((zzua) this.zza.get(i)).zzp()) {
                return true;
            }
        }
        return false;
    }
}
