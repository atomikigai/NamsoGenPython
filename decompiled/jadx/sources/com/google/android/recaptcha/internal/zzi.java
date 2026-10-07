package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import ic.l;
import java.util.concurrent.CancellationException;
import jc.j;
import rc.e0;
import rc.l1;
import rc.s;
import rc.y0;
import ub.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzi extends j implements l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ e0 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(TaskCompletionSource taskCompletionSource, e0 e0Var) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = e0Var;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Object objA = ((l1) this.zzb).A();
            if (objA instanceof y0) {
                throw new IllegalStateException("This job has not completed yet");
            }
            s sVar = objA instanceof s ? (s) objA : null;
            Throwable th2 = sVar != null ? sVar.f8315a : null;
            if (th2 == null) {
                this.zza.setResult(this.zzb.g());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception runtimeExecutionException = th2 instanceof Exception ? (Exception) th2 : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(th2);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return k.f9073a;
    }
}
