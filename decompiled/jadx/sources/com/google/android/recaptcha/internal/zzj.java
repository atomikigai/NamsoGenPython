package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import rc.e0;
import rc.l1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzj {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Task zza(e0 e0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        ((l1) e0Var).I(false, true, new zzi(taskCompletionSource, e0Var));
        return taskCompletionSource.getTask();
    }
}
