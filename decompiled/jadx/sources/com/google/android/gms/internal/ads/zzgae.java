package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgae {
    public static ArrayList zza(int i) {
        zzfyl.zza(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List zzb(List list, zzfwh zzfwhVar) {
        return list instanceof RandomAccess ? new zzgab(list, zzfwhVar) : new zzgad(list, zzfwhVar);
    }
}
