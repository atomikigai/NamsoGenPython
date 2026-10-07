package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzd;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Handler.Callback {
    public static final Status A = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status B = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object C = new Object();
    public static h D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.common.internal.v f2102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i7.b f2103d;
    public final Context e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g7.e f2104f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aa.c f2105r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicInteger f2106s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicInteger f2107t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ConcurrentHashMap f2108u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b0 f2109v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r.f f2110w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r.f f2111x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final zau f2112y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f2113z;

    public h(Context context, Looper looper) {
        g7.e eVar = g7.e.e;
        this.f2100a = 10000L;
        this.f2101b = false;
        this.f2106s = new AtomicInteger(1);
        this.f2107t = new AtomicInteger(0);
        this.f2108u = new ConcurrentHashMap(5, 0.75f, 1);
        this.f2109v = null;
        this.f2110w = new r.f(0);
        this.f2111x = new r.f(0);
        this.f2113z = true;
        this.e = context;
        zau zauVar = new zau(looper, this);
        this.f2112y = zauVar;
        this.f2104f = eVar;
        this.f2105r = new aa.c(13);
        PackageManager packageManager = context.getPackageManager();
        if (n7.c.f7308g == null) {
            n7.c.f7308g = Boolean.valueOf(n7.c.h() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (n7.c.f7308g.booleanValue()) {
            this.f2113z = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (C) {
            try {
                h hVar = D;
                if (hVar != null) {
                    hVar.f2107t.incrementAndGet();
                    zau zauVar = hVar.f2112y;
                    zauVar.sendMessageAtFrontOfQueue(zauVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status e(a aVar, g7.b bVar) {
        return new Status(17, da.v.j("API: ", aVar.f2054b.f2052c, " is not available on this device. Connection failed with: ", String.valueOf(bVar)), bVar.f4230c, bVar);
    }

    public static h h(Context context) {
        h hVar;
        HandlerThread handlerThread;
        synchronized (C) {
            if (D == null) {
                synchronized (com.google.android.gms.common.internal.m.f2227a) {
                    try {
                        handlerThread = com.google.android.gms.common.internal.m.f2229c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            com.google.android.gms.common.internal.m.f2229c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = com.google.android.gms.common.internal.m.f2229c;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                int i = g7.e.f4238c;
                D = new h(applicationContext, looper);
            }
            hVar = D;
        }
        return hVar;
    }

    public final void b(b0 b0Var) {
        synchronized (C) {
            try {
                if (this.f2109v != b0Var) {
                    this.f2109v = b0Var;
                    this.f2110w.clear();
                }
                this.f2110w.addAll(b0Var.e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        if (this.f2101b) {
            return false;
        }
        com.google.android.gms.common.internal.u uVar = (com.google.android.gms.common.internal.u) com.google.android.gms.common.internal.t.c().f2263a;
        if (uVar != null && !uVar.f2265b) {
            return false;
        }
        int i = ((SparseIntArray) this.f2105r.f263b).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean d(g7.b bVar, int i) {
        g7.e eVar = this.f2104f;
        eVar.getClass();
        Context context = this.e;
        if (!p7.a.b(context)) {
            int i10 = bVar.f4229b;
            PendingIntent activity = bVar.f4230c;
            if (!((i10 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentB = eVar.b(context, null, i10);
                if (intentB != null) {
                    activity = PendingIntent.getActivity(context, 0, intentB, zzd.zza | 134217728);
                }
            }
            if (activity != null) {
                int i11 = GoogleApiActivity.f2037b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                eVar.i(context, i10, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
                return true;
            }
        }
        return false;
    }

    public final f0 f(com.google.android.gms.common.api.l lVar) {
        a apiKey = lVar.getApiKey();
        ConcurrentHashMap concurrentHashMap = this.f2108u;
        f0 f0Var = (f0) concurrentHashMap.get(apiKey);
        if (f0Var == null) {
            f0Var = new f0(this, lVar);
            concurrentHashMap.put(apiKey, f0Var);
        }
        if (f0Var.f2083b.requiresSignIn()) {
            this.f2111x.add(apiKey);
        }
        f0Var.k();
        return f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    public final void g(TaskCompletionSource taskCompletionSource, int i, com.google.android.gms.common.api.l lVar) {
        n0 n0Var;
        h hVar;
        if (i != 0) {
            a apiKey = lVar.getApiKey();
            if (c()) {
                com.google.android.gms.common.internal.u uVar = (com.google.android.gms.common.internal.u) com.google.android.gms.common.internal.t.c().f2263a;
                boolean z4 = true;
                if (uVar != null) {
                    if (uVar.f2265b) {
                        boolean z10 = uVar.f2266c;
                        f0 f0Var = (f0) this.f2108u.get(apiKey);
                        if (f0Var != null) {
                            Object obj = f0Var.f2083b;
                            if (obj instanceof com.google.android.gms.common.internal.f) {
                                com.google.android.gms.common.internal.f fVar = (com.google.android.gms.common.internal.f) obj;
                                if (!fVar.hasConnectionInfo() || fVar.isConnecting()) {
                                    z4 = z10;
                                } else {
                                    com.google.android.gms.common.internal.j jVarA = n0.a(f0Var, fVar, i);
                                    if (jVarA != null) {
                                        f0Var.f2092w++;
                                        z4 = jVarA.f2205c;
                                    }
                                }
                            }
                        } else {
                            z4 = z10;
                        }
                    }
                    n0Var = null;
                    hVar = this;
                }
                hVar = this;
                n0Var = new n0(hVar, i, apiKey, z4 ? System.currentTimeMillis() : 0L, z4 ? SystemClock.elapsedRealtime() : 0L);
            } else {
                n0Var = null;
                hVar = this;
            }
            if (n0Var != null) {
                Task task = taskCompletionSource.getTask();
                zau zauVar = hVar.f2112y;
                zauVar.getClass();
                task.addOnCompleteListener(new d0(zauVar, 0), n0Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0374  */
    /* JADX WARN: Code duplicated, block: B:153:0x037a  */
    /* JADX WARN: Code duplicated, block: B:155:0x039a  */
    /* JADX WARN: Code duplicated, block: B:157:0x03a6  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v12 com.google.android.gms.common.api.internal.f0, still in use, count: 2, list:
          (r4v12 com.google.android.gms.common.api.internal.f0) from 0x036c: IGET (r4v12 com.google.android.gms.common.api.internal.f0) A[WRAPPED] (LINE:877) com.google.android.gms.common.api.internal.f0.r int
          (r4v12 com.google.android.gms.common.api.internal.f0) from 0x0372: PHI (r4 I:??) = (r4v9 com.google.android.gms.common.api.internal.f0), (r4v12 com.google.android.gms.common.api.internal.f0) binds: [B:149:0x0371, B:201:0x0372] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r19) {
        /*
            Method dump skipped, instruction units count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.h.handleMessage(android.os.Message):boolean");
    }

    public final void i(g7.b bVar, int i) {
        if (d(bVar, i)) {
            return;
        }
        zau zauVar = this.f2112y;
        zauVar.sendMessage(zauVar.obtainMessage(5, i, 0, bVar));
    }
}
