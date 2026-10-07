package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import d6.p;
import h6.r0;
import java.util.concurrent.Callable;
import p7.c;
import r7.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzevo implements zzevz {
    private final zzges zza;
    private final Context zzb;
    private final i6.a zzc;
    private final String zzd;

    public zzevo(zzges zzgesVar, Context context, i6.a aVar, String str) {
        this.zza = zzgesVar;
        this.zzb = context;
        this.zzc = aVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final zzevp zzc() throws Exception {
        boolean zH = c.a(this.zzb).h();
        r0 r0Var = p.C.f2979c;
        boolean zD = r0.d(this.zzb);
        String str = this.zzc.f5213a;
        int iMyUid = Process.myUid();
        boolean z4 = iMyUid == 0 || iMyUid == 1000;
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        int i = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = this.zzb;
        return new zzevp(zH, zD, str, z4, i, f.d(context, ModuleDescriptor.MODULE_ID, false), f.a(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
