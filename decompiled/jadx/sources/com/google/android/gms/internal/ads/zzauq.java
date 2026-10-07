package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzauq {
    public static final String zza(Context context, String str, boolean z4) {
        try {
            zzath zzathVarZza = zzati.zza();
            zzathVarZza.zzb(str);
            zzathVarZza.zza("1.671910402");
            zzathVarZza.zzc(context.getPackageName());
            zzathVarZza.zzd(System.currentTimeMillis() / 1000);
            try {
                zzathVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zzathVarZza.zze(-1L);
            }
            zzato zzatoVarZza = zzaua.zza(((zzati) zzathVarZza.zzbr()).zzaV(), null);
            zzatoVarZza.zzd(5);
            zzatoVarZza.zzc(2);
            return Base64.encodeToString(((zzatp) zzatoVarZza.zzbr()).zzaV(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
