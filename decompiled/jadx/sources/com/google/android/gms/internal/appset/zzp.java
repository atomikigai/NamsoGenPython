package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g7.d;
import g7.f;
import u6.a;
import u6.b;
import u6.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzp extends l implements a {
    private static final h zza;
    private static final com.google.android.gms.common.api.a zzb;
    private static final i zzc;
    private final Context zzd;
    private final f zze;

    static {
        h hVar = new h();
        zza = hVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new i("AppSet.API", zznVar, hVar);
    }

    public zzp(Context context, f fVar) {
        super(context, null, zzc, e.f2049j, k.f2167c);
        this.zzd = context;
        this.zze = fVar;
    }

    @Override // u6.a
    public final Task<b> getAppSetIdInfo() {
        if (this.zze.d(this.zzd, 212800000) != 0) {
            return Tasks.forException(new j(new Status(17, null, null, null)));
        }
        c9.f fVarA = x.a();
        fVarA.e = new d[]{u6.e.f8868a};
        fVarA.f1818d = new t() { // from class: com.google.android.gms.internal.appset.zzm
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzg) ((zzd) obj).getService()).zzc(new c(null, null), new zzo(this.zza, (TaskCompletionSource) obj2));
            }
        };
        fVarA.f1816b = false;
        fVarA.f1817c = 27601;
        return doRead(fVarA.a());
    }
}
