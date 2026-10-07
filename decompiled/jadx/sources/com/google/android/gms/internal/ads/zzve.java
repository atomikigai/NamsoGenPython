package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzve implements zzup, zzuo {
    private final zzup[] zza;
    private zzuo zze;
    private zzwr zzf;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzwi zzh = new zzub(zzfzo.zzn(), zzfzo.zzn());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzup[] zzg = new zzup[0];

    public zzve(zzuc zzucVar, long[] jArr, zzup... zzupVarArr) {
        this.zza = zzupVarArr;
        for (int i = 0; i < zzupVarArr.length; i++) {
            long j4 = jArr[i];
            if (j4 != 0) {
                this.zza[i] = new zzwo(zzupVarArr[i], j4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j4, zzls zzlsVar) {
        zzup[] zzupVarArr = this.zzg;
        return (zzupVarArr.length > 0 ? zzupVarArr[0] : this.zza[0]).zza(j4, zzlsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        long j4 = -9223372036854775807L;
        for (zzup zzupVar : this.zzg) {
            long jZzd = zzupVar.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j4 != -9223372036854775807L && zzupVar.zze(j4) != j4) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j4 == -9223372036854775807L) {
                for (zzup zzupVar2 : this.zzg) {
                    if (zzupVar2 == zzupVar) {
                        break;
                    }
                    if (zzupVar2.zze(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j4 = jZzd;
            } else if (jZzd != j4) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j4;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zze(long j4) {
        long jZze = this.zzg[0].zze(j4);
        int i = 1;
        while (true) {
            zzup[] zzupVarArr = this.zzg;
            if (i >= zzupVarArr.length) {
                return jZze;
            }
            if (zzupVarArr[i].zze(jZze) != jZze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzf(zzyd[] zzydVarArr, boolean[] zArr, zzwg[] zzwgVarArr, boolean[] zArr2, long j4) {
        int length;
        int length2 = zzydVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i10 = 0;
        while (true) {
            length = zzydVarArr.length;
            if (i10 >= length) {
                break;
            }
            zzwg zzwgVar = zzwgVarArr[i10];
            Integer num = zzwgVar == null ? null : (Integer) this.zzb.get(zzwgVar);
            iArr[i10] = num == null ? -1 : num.intValue();
            zzyd zzydVar = zzydVarArr[i10];
            if (zzydVar != null) {
                String str = zzydVar.zze().zzb;
                iArr2[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i10] = -1;
            }
            i10++;
        }
        this.zzb.clear();
        zzwg[] zzwgVarArr2 = new zzwg[length];
        zzwg[] zzwgVarArr3 = new zzwg[length];
        zzyd[] zzydVarArr2 = new zzyd[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j10 = j4;
        int i11 = 0;
        while (i11 < this.zza.length) {
            for (int i12 = i; i12 < zzydVarArr.length; i12++) {
                zzwgVarArr3[i12] = iArr[i12] == i11 ? zzwgVarArr[i12] : null;
                if (iArr2[i12] == i11) {
                    zzyd zzydVar2 = zzydVarArr[i12];
                    zzydVar2.getClass();
                    zzbw zzbwVar = (zzbw) this.zzd.get(zzydVar2.zze());
                    zzbwVar.getClass();
                    zzydVarArr2[i12] = new zzvd(zzydVar2, zzbwVar);
                } else {
                    zzydVarArr2[i12] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            long jZzf = this.zza[i11].zzf(zzydVarArr2, zArr, zzwgVarArr3, zArr2, j10);
            if (i11 == 0) {
                j10 = jZzf;
            } else if (jZzf != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z4 = false;
            for (int i13 = 0; i13 < zzydVarArr.length; i13++) {
                if (iArr2[i13] == i11) {
                    zzwg zzwgVar2 = zzwgVarArr3[i13];
                    zzwgVar2.getClass();
                    zzwgVarArr2[i13] = zzwgVar2;
                    this.zzb.put(zzwgVar2, Integer.valueOf(i11));
                    z4 = true;
                } else if (iArr[i13] == i11) {
                    zzdb.zzf(zzwgVarArr3[i13] == null);
                }
            }
            if (z4) {
                arrayList2.add(this.zza[i11]);
            }
            i11++;
            arrayList = arrayList2;
            i = 0;
        }
        int i14 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzwgVarArr2, i14, zzwgVarArr, i14, length);
        this.zzg = (zzup[]) arrayList3.toArray(new zzup[i14]);
        this.zzh = new zzub(arrayList3, zzgae.zzb(arrayList3, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzvc
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return ((zzup) obj).zzh().zzc();
            }
        }));
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final /* bridge */ /* synthetic */ void zzg(zzwi zzwiVar) {
        zzuo zzuoVar = this.zze;
        zzuoVar.getClass();
        zzuoVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final zzwr zzh() {
        zzwr zzwrVar = this.zzf;
        zzwrVar.getClass();
        return zzwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        this.zzc.remove(zzupVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (zzup zzupVar2 : this.zza) {
            i += zzupVar2.zzh().zzb;
        }
        zzbw[] zzbwVarArr = new zzbw[i];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            zzup[] zzupVarArr = this.zza;
            if (i10 >= zzupVarArr.length) {
                this.zzf = new zzwr(zzbwVarArr);
                zzuo zzuoVar = this.zze;
                zzuoVar.getClass();
                zzuoVar.zzi(this);
                return;
            }
            zzwr zzwrVarZzh = zzupVarArr[i10].zzh();
            int i12 = zzwrVarZzh.zzb;
            int i13 = 0;
            while (i13 < i12) {
                zzbw zzbwVarZzb = zzwrVarZzh.zzb(i13);
                zzad[] zzadVarArr = new zzad[zzbwVarZzb.zza];
                for (int i14 = 0; i14 < zzbwVarZzb.zza; i14++) {
                    zzad zzadVarZzb = zzbwVarZzb.zzb(i14);
                    zzab zzabVarZzb = zzadVarZzb.zzb();
                    String str = zzadVarZzb.zza;
                    if (str == null) {
                        str = "";
                    }
                    zzabVarZzb.zzL(i10 + ":" + str);
                    zzadVarArr[i14] = zzabVarZzb.zzaf();
                }
                zzbw zzbwVar = new zzbw(i10 + ":" + zzbwVarZzb.zzb, zzadVarArr);
                this.zzd.put(zzbwVar, zzbwVarZzb);
                zzbwVarArr[i11] = zzbwVar;
                i13++;
                i11++;
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzj(long j4, boolean z4) {
        for (zzup zzupVar : this.zzg) {
            zzupVar.zzj(j4, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() throws IOException {
        int i = 0;
        while (true) {
            zzup[] zzupVarArr = this.zza;
            if (i >= zzupVarArr.length) {
                return;
            }
            zzupVarArr[i].zzk();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j4) {
        this.zze = zzuoVar;
        Collections.addAll(this.zzc, this.zza);
        int i = 0;
        while (true) {
            zzup[] zzupVarArr = this.zza;
            if (i >= zzupVarArr.length) {
                return;
            }
            zzupVarArr[i].zzl(this, j4);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final void zzm(long j4) {
        this.zzh.zzm(j4);
    }

    public final zzup zzn(int i) {
        zzup zzupVar = this.zza[i];
        return zzupVar instanceof zzwo ? ((zzwo) zzupVar).zzn() : zzupVar;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzo(zzko zzkoVar) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(zzkoVar);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zzup) this.zzc.get(i)).zzo(zzkoVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
