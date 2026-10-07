package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a2.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import c3.j;
import java.util.concurrent.Executor;
import l5.i;
import l5.q;
import n3.e;
import r5.d;
import v5.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1957a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        q.b(context);
        l lVarA = i.a();
        lVarA.K(queryParameter);
        lVarA.f45d = a.b(iIntValue);
        if (queryParameter2 != null) {
            lVarA.f44c = Base64.decode(queryParameter2, 0);
        }
        j jVar = q.a().f6842d;
        ((Executor) jVar.e).execute(new d(jVar, lVarA.h(), i, new e(1)));
    }
}
