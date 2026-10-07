package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzft {
    private final zzfr zza;
    private final AtomicLong zzb = new AtomicLong();
    private final ArrayDeque zzc = new ArrayDeque();
    private final PriorityQueue zzd = new PriorityQueue();
    private int zze = -1;

    public zzft(zzfr zzfrVar) {
        this.zza = zzfrVar;
    }

    private final void zze(int i) {
        while (this.zzd.size() > i) {
            zzfs zzfsVar = (zzfs) this.zzd.poll();
            int i10 = zzen.zza;
            this.zza.zza(zzfsVar.zzb, zzfsVar.zza);
            this.zzc.push(zzfsVar);
        }
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r9 < r0.zzb) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(long r9, com.google.android.gms.internal.ads.zzed r11) {
        /*
            r8 = this;
            int r0 = r8.zze
            if (r0 == 0) goto L23
            r1 = -1
            if (r0 == r1) goto L26
            java.util.PriorityQueue r0 = r8.zzd
            int r0 = r0.size()
            int r2 = r8.zze
            if (r0 < r2) goto L26
            java.util.PriorityQueue r0 = r8.zzd
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzfs r0 = (com.google.android.gms.internal.ads.zzfs) r0
            int r2 = com.google.android.gms.internal.ads.zzen.zza
            long r2 = com.google.android.gms.internal.ads.zzfs.zza(r0)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
        L23:
            r3 = r9
            r7 = r11
            goto L56
        L26:
            java.util.ArrayDeque r0 = r8.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L35
            com.google.android.gms.internal.ads.zzfs r0 = new com.google.android.gms.internal.ads.zzfs
            r0.<init>()
        L33:
            r2 = r0
            goto L3e
        L35:
            java.util.ArrayDeque r0 = r8.zzc
            java.lang.Object r0 = r0.poll()
            com.google.android.gms.internal.ads.zzfs r0 = (com.google.android.gms.internal.ads.zzfs) r0
            goto L33
        L3e:
            java.util.concurrent.atomic.AtomicLong r0 = r8.zzb
            long r5 = r0.getAndIncrement()
            r3 = r9
            r7 = r11
            r2.zzc(r3, r5, r7)
            java.util.PriorityQueue r9 = r8.zzd
            r9.add(r2)
            int r9 = r8.zze
            if (r9 == r1) goto L55
            r8.zze(r9)
        L55:
            return
        L56:
            com.google.android.gms.internal.ads.zzfr r9 = r8.zza
            r9.zza(r3, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzft.zzb(long, com.google.android.gms.internal.ads.zzed):void");
    }

    public final void zzc() {
        zze(0);
    }

    public final void zzd(int i) {
        zzdb.zzf(i >= 0);
        this.zze = i;
        zze(i);
    }
}
