package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import k9.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final k9.c f2649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k9.v f2650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f2652d;

    public ax(Context context, k9.v vVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2652d = taskCompletionSource;
        this.f2651c = context.getPackageName();
        this.f2650b = vVar;
        k9.c cVar = new k9.c(context, vVar, "ExpressIntegrityService", ay.f2653a, new a0() { // from class: com.google.android.play.core.integrity.ap
            @Override // k9.a0
            public final Object a(IBinder iBinder) {
                int i = k9.m.f6116d;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return iInterfaceQueryLocalInterface instanceof k9.n ? (k9.n) iInterfaceQueryLocalInterface : new k9.l(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            }
        });
        this.f2649a = cVar;
        cVar.a().post(new aq(this, taskCompletionSource, context));
    }

    public static Bundle a(ax axVar, String str, long j4, long j10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", axVar.f2651c);
        bundle.putLong("cloud.prj", j4);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k9.k(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(jd.d.a(arrayList)));
        return bundle;
    }

    public static Bundle b(ax axVar, long j4) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", axVar.f2651c);
        bundle.putLong("cloud.prj", j4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k9.k(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(jd.d.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean g(ax axVar) {
        return axVar.f2652d.getTask().isSuccessful() && !((Boolean) axVar.f2652d.getTask().getResult()).booleanValue();
    }

    public final Task c(String str, long j4, long j10) {
        this.f2650b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k9.c cVar = this.f2649a;
        as asVar = new as(this, taskCompletionSource, str, j4, j10, taskCompletionSource);
        cVar.getClass();
        cVar.a().post(new k9.y(cVar, asVar.c(), taskCompletionSource, asVar));
        return taskCompletionSource.getTask();
    }

    public final Task d(long j4) {
        this.f2650b.b("warmUpIntegrityToken(%s)", Long.valueOf(j4));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k9.c cVar = this.f2649a;
        ar arVar = new ar(this, taskCompletionSource, j4, taskCompletionSource);
        cVar.getClass();
        cVar.a().post(new k9.y(cVar, arVar.c(), taskCompletionSource, arVar));
        return taskCompletionSource.getTask();
    }
}
