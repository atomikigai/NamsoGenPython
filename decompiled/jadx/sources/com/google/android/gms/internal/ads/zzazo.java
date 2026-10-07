package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzazo implements Comparator {
    public zzazo(zzazq zzazqVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazu zzazuVar = (zzazu) obj;
        zzazu zzazuVar2 = (zzazu) obj2;
        int i = zzazuVar.zzc - zzazuVar2.zzc;
        return i != 0 ? i : Long.compare(zzazuVar.zza, zzazuVar2.zza);
    }
}
