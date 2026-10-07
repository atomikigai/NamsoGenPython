package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import k1.a;
import q3.e;
import z7.a1;
import z7.i0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f2314c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f2314c == null) {
            this.f2314c = new e(this);
        }
        e eVar = this.f2314c;
        eVar.getClass();
        i0 i0Var = a1.m(context, null, null).f11007t;
        a1.f(i0Var);
        if (intent == null) {
            i0Var.f11193t.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        i0Var.f11198y.c(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                i0Var.f11193t.b("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        i0Var.f11198y.b("Starting wakeful intent.");
        ((AppMeasurementReceiver) eVar.f7990a).getClass();
        SparseArray sparseArray = a.f5911a;
        synchronized (sparseArray) {
            try {
                int i = a.f5912b;
                int i10 = i + 1;
                a.f5912b = i10;
                if (i10 <= 0) {
                    a.f5912b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
