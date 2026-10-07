package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import e6.t;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeth implements zzevz {
    private final zzges zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzeth(zzges zzgesVar, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgesVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final zzeti zzc() throws Exception {
        zzbce zzbceVar = zzbcn.zzfN;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzeti(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        boolean zBooleanValue = ((Boolean) tVar.f3440c.zza(zzbcn.zzfO)).booleanValue();
        Boolean boolValueOf = null;
        if (zBooleanValue && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new zzeti(boolValueOf);
            }
        }
        return new zzeti(null);
    }
}
