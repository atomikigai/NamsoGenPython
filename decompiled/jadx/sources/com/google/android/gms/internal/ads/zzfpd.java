package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfpd extends AsyncTask {
    private zzfpe zza;
    protected final zzfov zzd;

    public zzfpd(zzfov zzfovVar) {
        this.zzd = zzfovVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfpe zzfpeVar = this.zza;
        if (zzfpeVar != null) {
            zzfpeVar.zza(this);
        }
    }

    public final void zzb(zzfpe zzfpeVar) {
        this.zza = zzfpeVar;
    }
}
