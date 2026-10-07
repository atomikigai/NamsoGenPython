package com.google.android.gms.internal.ads;

import androidx.webkit.Profile;
import com.google.android.gms.common.api.f;
import e6.t;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcaj {
    public static final zzges zza;
    public static final zzges zzb;
    public static final zzges zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzges zze;
    public static final zzges zzf;

    /* JADX WARN: Code duplicated, block: B:11:0x006b  */
    static {
        ThreadPoolExecutor threadPoolExecutor;
        zzbce zzbceVar = zzbcn.zzkU;
        t tVar = t.f3437d;
        if (tVar.f3440c.zzb(zzbceVar) == null || !((Boolean) tVar.f3440c.zzb(zzbceVar)).booleanValue()) {
            threadPoolExecutor = new ThreadPoolExecutor(2, f.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcaf(Profile.DEFAULT_PROFILE_NAME));
        } else {
            zzbce zzbceVar2 = zzbcn.zzkV;
            if (tVar.f3440c.zzb(zzbceVar2) != null) {
                zzbce zzbceVar3 = zzbcn.zzkW;
                if (tVar.f3440c.zzb(zzbceVar3) != null) {
                    threadPoolExecutor = new ThreadPoolExecutor(((Integer) tVar.f3440c.zzb(zzbceVar2)).intValue(), ((Integer) tVar.f3440c.zzb(zzbceVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcaf(Profile.DEFAULT_PROFILE_NAME));
                    threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) tVar.f3440c.zzb(zzbceVar3)).booleanValue());
                } else {
                    threadPoolExecutor = new ThreadPoolExecutor(2, f.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcaf(Profile.DEFAULT_PROFILE_NAME));
                }
            } else {
                threadPoolExecutor = new ThreadPoolExecutor(2, f.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcaf(Profile.DEFAULT_PROFILE_NAME));
            }
        }
        zza = new zzcah(threadPoolExecutor, null);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new zzcaf("Loader"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        zzb = new zzcah(threadPoolExecutor2, null);
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new zzcaf("Activeview"));
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        zzc = new zzcah(threadPoolExecutor3, null);
        zzd = new zzcae(3, new zzcaf("Schedule"));
        zze = new zzcah(new zzcag(), null);
        zzf = new zzcah(zzgey.zzb(), null);
    }
}
