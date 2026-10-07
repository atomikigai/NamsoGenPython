package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzftq {
    public static m9.a zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzftp zzftpVar = new zzftp(task, null);
        task.addOnCompleteListener(zzgey.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfto
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzftp zzftpVar2 = zzftpVar;
                if (task2.isCanceled()) {
                    zzftpVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzftpVar2.zzc(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzftpVar2.zzd(exception);
            }
        });
        return zzftpVar;
    }
}
