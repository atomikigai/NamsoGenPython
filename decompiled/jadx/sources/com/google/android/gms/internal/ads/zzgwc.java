package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgwc {
    public static final zzgwc zza = new zzgwc(new zzgwd());
    public static final zzgwc zzb = new zzgwc(new zzgwh());
    private final zzgwa zzc;

    static {
        new zzgwc(new zzgwj());
        new zzgwc(new zzgwi());
        new zzgwc(new zzgwe());
        new zzgwc(new zzgwg());
        new zzgwc(new zzgwf());
    }

    public zzgwc(zzgwk zzgwkVar) {
        zzgwb zzgwbVar = null;
        this.zzc = !zzgmi.zzb() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzgvx(zzgwkVar, zzgwbVar) : new zzgvy(zzgwkVar, zzgwbVar) : new zzgvz(zzgwkVar, zzgwbVar);
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzc.zza(str);
    }
}
