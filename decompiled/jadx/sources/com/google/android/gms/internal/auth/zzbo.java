package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import c7.a;
import c7.b;
import c9.f;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import x6.c;
import x6.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbo extends l {
    public zzbo(Activity activity, d dVar) {
        super(activity, activity, c.f10301a, dVar == null ? d.f10302b : dVar, k.f2167c);
    }

    public final Task<String> getSpatulaHeader() {
        f fVarA = x.a();
        fVarA.f1818d = new t() { // from class: com.google.android.gms.internal.auth.zzbk
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(this.zza, (TaskCompletionSource) obj2));
            }
        };
        fVarA.f1817c = 1520;
        return doRead(fVarA.a());
    }

    public final Task<b> performProxyRequest(final a aVar) {
        f fVarA = x.a();
        fVarA.f1818d = new t() { // from class: com.google.android.gms.internal.auth.zzbl
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzbo zzboVar = this.zza;
                a aVar2 = aVar;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), aVar2);
            }
        };
        fVarA.f1817c = 1518;
        return doWrite(fVarA.a());
    }

    public zzbo(Context context, d dVar) {
        super(context, null, c.f10301a, dVar == null ? d.f10302b : dVar, k.f2167c);
    }
}
