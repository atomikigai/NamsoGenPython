package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements ServiceConnection, t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2243a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2244b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f2246d;
    public final p0 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f2247f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s0 f2248r;

    public q0(s0 s0Var, p0 p0Var) {
        this.f2248r = s0Var;
        this.e = p0Var;
    }

    public final void a(String str, Executor executor) throws Throwable {
        this.f2244b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            s0 s0Var = this.f2248r;
            m7.a aVar = s0Var.f2260g;
            Context context = s0Var.e;
            try {
                boolean zD = aVar.d(context, str, this.e.a(context), this, 4225, executor);
                this.f2245c = zD;
                if (zD) {
                    this.f2248r.f2259f.sendMessageDelayed(this.f2248r.f2259f.obtainMessage(1, this.e), this.f2248r.i);
                } else {
                    this.f2244b = 2;
                    try {
                        s0 s0Var2 = this.f2248r;
                        s0Var2.f2260g.c(s0Var2.e, this);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                StrictMode.setVmPolicy(vmPolicy);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f2248r.f2258d) {
            try {
                this.f2248r.f2259f.removeMessages(1, this.e);
                this.f2246d = iBinder;
                this.f2247f = componentName;
                Iterator it = this.f2243a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f2244b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f2248r.f2258d) {
            try {
                this.f2248r.f2259f.removeMessages(1, this.e);
                this.f2246d = null;
                this.f2247f = componentName;
                Iterator it = this.f2243a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f2244b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
