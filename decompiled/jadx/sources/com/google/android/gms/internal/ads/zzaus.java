package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaus implements zzfrk {
    final /* synthetic */ zzfpk zza;

    public zzaus(zzauu zzauuVar, zzfpk zzfpkVar) {
        this.zza = zzfpkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
