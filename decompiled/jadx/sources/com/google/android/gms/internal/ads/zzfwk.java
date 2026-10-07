package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfwk {
    private final String zza;
    private final zzfwj zzb;
    private zzfwj zzc;

    public /* synthetic */ zzfwk(String str, zzfwl zzfwlVar) {
        zzfwj zzfwjVar = new zzfwj();
        this.zzb = zzfwjVar;
        this.zzc = zzfwjVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzfwj zzfwjVar = this.zzb.zzb;
        String str = "";
        while (zzfwjVar != null) {
            Object obj = zzfwjVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzfwjVar = zzfwjVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzfwk zza(Object obj) {
        zzfwj zzfwjVar = new zzfwj();
        this.zzc.zzb = zzfwjVar;
        this.zzc = zzfwjVar;
        zzfwjVar.zza = obj;
        return this;
    }
}
