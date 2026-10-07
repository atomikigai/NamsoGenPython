package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import k9.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final k9.c f2618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k9.v f2619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2620c;

    public ad(Context context, k9.v vVar) {
        this.f2620c = context.getPackageName();
        this.f2619b = vVar;
        if (k9.e.a(context)) {
            this.f2618a = new k9.c(context, vVar, "IntegrityService", ae.f2621a, new a0() { // from class: com.google.android.play.core.integrity.aa
                @Override // k9.a0
                public final Object a(IBinder iBinder) {
                    int i = k9.r.f6117d;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                    return iInterfaceQueryLocalInterface instanceof k9.s ? (k9.s) iInterfaceQueryLocalInterface : new k9.q(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                }
            });
            return;
        }
        Object[] objArr = new Object[0];
        vVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", k9.v.c(vVar.f6118a, "Phonesky is not installed.", objArr));
        }
        this.f2618a = null;
    }

    public static Bundle a(ad adVar, byte[] bArr, Long l2, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", adVar.f2620c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 2);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l2 != null) {
            bundle.putLong("cloud.prj", l2.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k9.k(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(jd.d.a(arrayList)));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f2618a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            integrityTokenRequest.a();
            this.f2619b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            k9.c cVar = this.f2618a;
            ab abVar = new ab(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest);
            cVar.getClass();
            cVar.a().post(new k9.y(cVar, abVar.c(), taskCompletionSource, abVar));
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, e));
        }
    }
}
