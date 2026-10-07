package com.google.android.gms.internal.ads;

import i6.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzazq {
    private final int zza;
    private final zzazn zzb = new zzazs();

    public zzazq(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb2.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] strArrSplit = sb2.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzazp zzazpVar = new zzazp();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzazo(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzazr.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzazv.zzc(strArrZzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzazpVar.zzb.write(this.zzb.zzb(((zzazu) it.next()).zzb));
            } catch (IOException e) {
                h.e("Error while writing hash to byteStream", e);
            }
        }
        return zzazpVar.toString();
    }
}
