package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfzu {
    public static Object zza(Iterable iterable, Object obj) {
        zzgbj zzgbjVar = new zzgbj((zzgbk) iterable);
        return zzgbjVar.hasNext() ? zzgbjVar.next() : obj;
    }

    public static boolean zzb(Iterable iterable, zzfwr zzfwrVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfwrVar.getClass();
            return zzd((List) iterable, zzfwrVar);
        }
        Iterator it = iterable.iterator();
        zzfwrVar.getClass();
        boolean z4 = false;
        while (it.hasNext()) {
            if (zzfwrVar.zza(it.next())) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    private static void zzc(List list, zzfwr zzfwrVar, int i, int i10) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i10) {
                break;
            } else if (zzfwrVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i10--;
            if (i10 < i) {
                return;
            } else {
                list.remove(i10);
            }
        }
    }

    private static boolean zzd(List list, zzfwr zzfwrVar) {
        int i = 0;
        int i10 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfwrVar.zza(obj)) {
                if (i > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        zzc(list, zzfwrVar, i10, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzc(list, zzfwrVar, i10, i);
                        return true;
                    }
                }
                i10++;
            }
            i++;
        }
        list.subList(i10, list.size()).clear();
        return i != i10;
    }
}
