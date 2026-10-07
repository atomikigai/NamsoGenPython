package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f2126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f2128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2129d;
    public final long e;

    public n0(h hVar, int i, a aVar, long j4, long j10) {
        this.f2126a = hVar;
        this.f2127b = i;
        this.f2128c = aVar;
        this.f2129d = j4;
        this.e = j10;
    }

    public static com.google.android.gms.common.internal.j a(f0 f0Var, com.google.android.gms.common.internal.f fVar, int i) {
        com.google.android.gms.common.internal.j telemetryConfiguration = fVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.f2204b) {
            return null;
        }
        int[] iArr = telemetryConfiguration.f2206d;
        int i10 = 0;
        if (iArr != null) {
            while (i10 < iArr.length) {
                if (iArr[i10] != i) {
                    i10++;
                }
            }
            return null;
        }
        int[] iArr2 = telemetryConfiguration.f2207f;
        if (iArr2 != null) {
            while (i10 < iArr2.length) {
                if (iArr2[i10] == i) {
                    return null;
                }
                i10++;
            }
        }
        if (f0Var.f2092w < telemetryConfiguration.e) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j4;
        long j10;
        h hVar = this.f2126a;
        if (hVar.c()) {
            com.google.android.gms.common.internal.u uVar = (com.google.android.gms.common.internal.u) com.google.android.gms.common.internal.t.c().f2263a;
            if (uVar == null || uVar.f2265b) {
                f0 f0Var = (f0) hVar.f2108u.get(this.f2128c);
                if (f0Var != null) {
                    Object obj = f0Var.f2083b;
                    if (obj instanceof com.google.android.gms.common.internal.f) {
                        com.google.android.gms.common.internal.f fVar = (com.google.android.gms.common.internal.f) obj;
                        long j11 = this.f2129d;
                        boolean z4 = j11 > 0;
                        int gCoreServiceId = fVar.getGCoreServiceId();
                        if (uVar != null) {
                            z4 &= uVar.f2266c;
                            int i15 = uVar.f2267d;
                            int i16 = uVar.e;
                            i = uVar.f2264a;
                            if (fVar.hasConnectionInfo() && !fVar.isConnecting()) {
                                com.google.android.gms.common.internal.j jVarA = a(f0Var, fVar, this.f2127b);
                                if (jVarA == null) {
                                    return;
                                }
                                boolean z10 = jVarA.f2205c && j11 > 0;
                                i16 = jVarA.e;
                                z4 = z10;
                            }
                            i11 = i15;
                            i10 = i16;
                        } else {
                            i = 0;
                            i10 = 100;
                            i11 = 5000;
                        }
                        int iElapsedRealtime = -1;
                        if (task.isSuccessful()) {
                            i14 = 0;
                            i13 = 0;
                        } else if (task.isCanceled()) {
                            i13 = -1;
                            i14 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof com.google.android.gms.common.api.j) {
                                Status status = ((com.google.android.gms.common.api.j) exception).getStatus();
                                i12 = status.f2045a;
                                g7.b bVar = status.f2048d;
                                if (bVar != null) {
                                    i13 = bVar.f4229b;
                                }
                                i14 = i12;
                            } else {
                                i12 = 101;
                            }
                            i13 = -1;
                            i14 = i12;
                        }
                        if (z4) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.e);
                            j4 = j11;
                            j10 = jCurrentTimeMillis;
                        } else {
                            j4 = 0;
                            j10 = 0;
                        }
                        o0 o0Var = new o0(new com.google.android.gms.common.internal.r(this.f2127b, i14, i13, j4, j10, null, null, gCoreServiceId, iElapsedRealtime), i, i11, i10);
                        zau zauVar = hVar.f2112y;
                        zauVar.sendMessage(zauVar.obtainMessage(18, o0Var));
                    }
                }
            }
        }
    }
}
