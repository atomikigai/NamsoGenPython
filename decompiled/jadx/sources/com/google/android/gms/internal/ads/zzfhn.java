package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import e6.o3;
import e6.u3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfhn implements zzfhm {
    private final Object[] zza;

    public zzfhn(o3 o3Var, String str, int i, String str2, u3 u3Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(o3Var.f3372b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zza(o3Var.f3373c));
        } else if (hashSet.contains("npa")) {
            arrayList.add(o3Var.f3373c.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(o3Var.f3374d));
        }
        if (hashSet.contains("keywords")) {
            List list = o3Var.e;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(o3Var.f3375f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(o3Var.f3376r));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(o3Var.f3377s));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(o3Var.f3378t);
        }
        if (hashSet.contains("location")) {
            Location location = o3Var.f3380v;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(o3Var.f3381w);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(o3Var.f3382x));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(o3Var.f3383y));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = o3Var.f3384z;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(o3Var.A);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(o3Var.B);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(o3Var.C));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(o3Var.E));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(o3Var.F);
        }
        if (hashSet.contains("orientation")) {
            if (u3Var != null) {
                arrayList.add(Integer.valueOf(u3Var.f3455a));
            } else {
                arrayList.add(null);
            }
        }
        this.zza = arrayList.toArray();
    }

    private static String zza(Bundle bundle) {
        String strZza;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                strZza = "null";
            } else {
                strZza = obj instanceof Bundle ? zza((Bundle) obj) : obj.toString();
            }
            sb2.append(strZza);
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfhm
    public final boolean equals(Object obj) {
        if (obj instanceof zzfhn) {
            return Arrays.equals(this.zza, ((zzfhn) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfhm
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        Object[] objArr = this.zza;
        return "[PoolKey#" + Arrays.hashCode(objArr) + " " + Arrays.toString(objArr) + "]";
    }
}
