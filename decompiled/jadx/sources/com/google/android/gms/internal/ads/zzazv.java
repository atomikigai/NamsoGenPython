package com.google.android.gms.internal.ads;

import i6.h;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzazv {
    public static long zza(long j4, int i) {
        if (i == 1) {
            return j4;
        }
        int i10 = i >> 1;
        long j10 = (j4 * j4) % 1073807359;
        return (i & 1) == 0 ? zza(j10, i10) % 1073807359 : ((zza(j10, i10) % 1073807359) * j4) % 1073807359;
    }

    public static String zzb(String[] strArr, int i, int i10) {
        int i11 = i10 + i;
        if (strArr.length < i11) {
            h.d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i12 = i11 - 1;
            if (i >= i12) {
                sb2.append(strArr[i12]);
                return sb2.toString();
            }
            sb2.append(strArr[i]);
            sb2.append(' ');
            i++;
        }
    }

    public static void zzc(String[] strArr, int i, int i10, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzd(i, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzd(i, jZze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i11 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i11 >= length2 - 5) {
                return;
            }
            long jZza = zzazr.zza(strArr[i11 - 1]);
            long jZza2 = zzazr.zza(strArr[i11 + 5]);
            String strZzb = zzb(strArr, i11, 6);
            jZze = (((jZza2 + 2147483647L) % 1073807359) + (((((jZze + 1073807359) - ((((jZza + 2147483647L) % 1073807359) * zza(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzd(i, jZze, strZzb, length2, priorityQueue);
            i11++;
        }
    }

    public static void zzd(int i, long j4, String str, int i10, PriorityQueue priorityQueue) {
        zzazu zzazuVar = new zzazu(j4, str, i10);
        if ((priorityQueue.size() != i || (((zzazu) priorityQueue.peek()).zzc <= zzazuVar.zzc && ((zzazu) priorityQueue.peek()).zza <= zzazuVar.zza)) && !priorityQueue.contains(zzazuVar)) {
            priorityQueue.add(zzazuVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i, int i10) {
        long jZza = (((long) zzazr.zza(strArr[0])) + 2147483647L) % 1073807359;
        for (int i11 = 1; i11 < i10; i11++) {
            jZza = (((((long) zzazr.zza(strArr[i11])) + 2147483647L) % 1073807359) + ((jZza * 16785407) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}
