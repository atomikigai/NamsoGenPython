package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzamc implements zzakd {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzamc(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            zzalr zzalrVar = (zzalr) list.get(i);
            long[] jArr = this.zzb;
            int i10 = i + i;
            jArr[i10] = zzalrVar.zzb;
            jArr[i10 + 1] = zzalrVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final long zzb(int i) {
        zzdb.zzd(i >= 0);
        zzdb.zzd(i < this.zzc.length);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final List zzc(long j4) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.zza.size(); i++) {
            long[] jArr = this.zzb;
            int i10 = i + i;
            if (jArr[i10] <= j4 && j4 < jArr[i10 + 1]) {
                zzalr zzalrVar = (zzalr) this.zza.get(i);
                zzct zzctVar = zzalrVar.zza;
                if (zzctVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzalrVar);
                } else {
                    arrayList.add(zzctVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzamb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((zzalr) obj).zzb, ((zzalr) obj2).zzb);
            }
        });
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            zzcr zzcrVarZzb = ((zzalr) arrayList2.get(i11)).zza.zzb();
            zzcrVarZzb.zze((-1) - i11, 1);
            arrayList.add(zzcrVarZzb.zzp());
        }
        return arrayList;
    }
}
