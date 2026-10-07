package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaix implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzajf zzajfVar = (zzajf) obj;
        zzajf zzajfVar2 = (zzajf) obj2;
        zzaiw zzaiwVar = new zzaiw(zzajfVar);
        zzaiw zzaiwVar2 = new zzaiw(zzajfVar2);
        while (zzaiwVar.hasNext() && zzaiwVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzaiwVar.zza() & 255).compareTo(Integer.valueOf(zzaiwVar2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzajfVar.zzd()).compareTo(Integer.valueOf(zzajfVar2.zzd()));
    }
}
