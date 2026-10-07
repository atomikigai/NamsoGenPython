package z7;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11276d;
    public final Boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzcl f11278g;
    public final boolean h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f11279j;

    public n1(Context context, zzcl zzclVar, Long l2) {
        this.h = true;
        com.google.android.gms.common.internal.i0.i(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.i0.i(applicationContext);
        this.f11273a = applicationContext;
        this.i = l2;
        if (zzclVar != null) {
            this.f11278g = zzclVar;
            this.f11274b = zzclVar.zzf;
            this.f11275c = zzclVar.zze;
            this.f11276d = zzclVar.zzd;
            this.h = zzclVar.zzc;
            this.f11277f = zzclVar.zzb;
            this.f11279j = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
