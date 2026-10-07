package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfpp {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfpp(Context context, Executor executor, Task task, boolean z4) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z4;
    }

    public static zzfpp zza(final Context context, Executor executor, boolean z4) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z4) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfpn
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzfrr.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfpo
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzfrr.zzc());
                }
            });
        }
        return new zzfpp(context, executor, taskCompletionSource.getTask(), z4);
    }

    public static void zzg(int i) {
        zzf = i;
    }

    private final Task zzh(final int i, long j4, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfpl
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(task.isSuccessful());
                }
            });
        }
        Context context = this.zzb;
        final zzarl zzarlVarZza = zzarp.zza();
        zzarlVarZza.zza(context.getPackageName());
        zzarlVarZza.zze(j4);
        zzarlVarZza.zzg(zzf);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzarlVarZza.zzf(stringWriter.toString());
            zzarlVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzarlVarZza.zzb(str2);
        }
        if (str != null) {
            zzarlVarZza.zzc(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfpm
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i10 = i;
                zzfrp zzfrpVarZza = ((zzfrr) task.getResult()).zza(((zzarp) zzarlVarZza.zzbn()).zzaV());
                zzfrpVarZza.zza(i10);
                zzfrpVarZza.zzc();
                return Boolean.TRUE;
            }
        });
    }

    public final Task zzb(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final Task zzc(int i, long j4, Exception exc) {
        return zzh(i, j4, exc, null, null, null);
    }

    public final Task zzd(int i, long j4) {
        return zzh(i, j4, null, null, null, null);
    }

    public final Task zze(int i, long j4, String str) {
        return zzh(i, j4, null, null, null, str);
    }

    public final Task zzf(int i, long j4, String str, Map map) {
        return zzh(i, j4, null, str, null, null);
    }
}
