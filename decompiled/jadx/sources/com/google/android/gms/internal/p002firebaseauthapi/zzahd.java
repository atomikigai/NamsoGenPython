package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Base64;
import com.google.android.gms.common.internal.i0;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahd {
    public static long zza(String str) {
        i0.e(str);
        List listZzd = zzab.zzb(zzj.zzb('.')).zzd(str);
        if (listZzd.size() < 2) {
            throw new RuntimeException("Invalid idToken ".concat(String.valueOf(str)));
        }
        String str2 = (String) listZzd.get(1);
        try {
            zzahe zzaheVarZza = zzahe.zza(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return zzaheVarZza.zzb().longValue() - zzaheVarZza.zzc().longValue();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unable to decode token", e);
        }
    }
}
