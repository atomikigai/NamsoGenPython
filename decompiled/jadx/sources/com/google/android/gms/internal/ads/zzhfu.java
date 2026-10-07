package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhfu {
    public static HashSet zza(int i) {
        return new HashSet(zzd(i));
    }

    public static LinkedHashMap zzb(int i) {
        return new LinkedHashMap(zzd(i));
    }

    public static List zzc(int i) {
        return i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
    }

    private static int zzd(int i) {
        if (i < 3) {
            return i + 1;
        }
        return i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : f.API_PRIORITY_OTHER;
    }
}
