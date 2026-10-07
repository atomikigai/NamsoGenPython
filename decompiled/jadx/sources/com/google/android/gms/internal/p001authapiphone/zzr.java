package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import c9.f;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzr extends l {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new i("SmsCodeAutofill.API", zznVar, hVar);
    }

    public zzr(Activity activity) {
        super(activity, activity, zzc, e.f2049j, k.f2167c);
    }

    public final Task<Integer> checkPermissionState() {
        f fVarA = x.a();
        fVarA.e = new d[]{zzac.zza};
        fVarA.f1818d = new t() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(this.zza, (TaskCompletionSource) obj2));
            }
        };
        fVarA.f1817c = 1564;
        return doRead(fVarA.a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        i0.i(str);
        i0.a("The package name cannot be empty.", !str.isEmpty());
        f fVarA = x.a();
        fVarA.e = new d[]{zzac.zza};
        fVarA.f1818d = new t() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzr zzrVar = this.zza;
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(zzrVar, (TaskCompletionSource) obj2));
            }
        };
        fVarA.f1817c = 1565;
        return doRead(fVarA.a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        f fVarA = x.a();
        fVarA.e = new d[]{zzac.zza};
        fVarA.f1818d = new t() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(this.zza, (TaskCompletionSource) obj2));
            }
        };
        fVarA.f1817c = 1563;
        return doWrite(fVarA.a());
    }

    public zzr(Context context) {
        super(context, null, zzc, e.f2049j, k.f2167c);
    }
}
