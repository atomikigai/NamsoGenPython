package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzam;
import com.google.android.recaptcha.internal.zzaw;
import r7.g;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    /* JADX INFO: renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m0getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j4, d dVar, int i, Object obj) {
        if ((i & 4) != 0) {
            j4 = 10000;
        }
        return recaptcha.m1getClientBWLJW6A(application, str, j4, dVar);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzam.zzd(application, str, 10000L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: getClient-BWLJW6A, reason: not valid java name */
    public final Object m1getClientBWLJW6A(Application application, String str, long j4, d dVar) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        if (dVar instanceof Recaptcha$getClient$1) {
            recaptcha$getClient$1 = (Recaptcha$getClient$1) dVar;
            int i = recaptcha$getClient$1.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                recaptcha$getClient$1.zzc = i - Integer.MIN_VALUE;
            } else {
                recaptcha$getClient$1 = new Recaptcha$getClient$1(this, dVar);
            }
        } else {
            recaptcha$getClient$1 = new Recaptcha$getClient$1(this, dVar);
        }
        Recaptcha$getClient$1 recaptcha$getClient$2 = recaptcha$getClient$1;
        Object objZzc = recaptcha$getClient$2.zza;
        a aVar = a.f11555a;
        int i10 = recaptcha$getClient$2.zzc;
        try {
            if (i10 == 0) {
                g.G(objZzc);
                zzam zzamVar = zzam.zza;
                recaptcha$getClient$2.zzc = 1;
                objZzc = zzam.zzc(application, str, j4, null, recaptcha$getClient$2);
                if (objZzc == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.G(objZzc);
            }
            return (zzaw) objZzc;
        } catch (Throwable th) {
            return g.m(th);
        }
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j4) {
        return zzam.zzd(application, str, j4);
    }
}
