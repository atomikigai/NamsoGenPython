package kb;

import android.content.SharedPreferences;
import android.util.Log;
import com.bumptech.glide.manager.q;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.zzft;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import z7.a1;
import z7.q0;
import z7.z;
import z7.z2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements y3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6154d;
    public Object e;

    public synchronized s3.c a() {
        try {
            if (((s3.c) this.e) == null) {
                this.e = s3.c.H((File) this.f6153c, this.f6151a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (s3.c) this.e;
    }

    @Override // y3.a
    public void b(u3.f fVar, q5.d dVar) {
        y3.b bVar;
        String strL = ((s5.j) this.f6152b).l(fVar);
        s5.j jVar = (s5.j) this.f6154d;
        synchronized (jVar) {
            bVar = (y3.b) ((HashMap) jVar.f8445b).get(strL);
            if (bVar == null) {
                v1.d dVar2 = (v1.d) jVar.f8446c;
                synchronized (((ArrayDeque) dVar2.f9128a)) {
                    bVar = (y3.b) ((ArrayDeque) dVar2.f9128a).poll();
                }
                if (bVar == null) {
                    bVar = new y3.b();
                }
                ((HashMap) jVar.f8445b).put(strL, bVar);
            }
            bVar.f10546b++;
        }
        bVar.f10545a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strL + " for for Key: " + fVar);
            }
            try {
                s3.c cVarA = a();
                if (cVarA.E(strL) == null) {
                    q qVarO = cVarA.o(strL);
                    if (qVarO == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strL));
                    }
                    try {
                        if (((u3.c) dVar.f8039a).p(dVar.f8040b, qVarO.b(), (u3.i) dVar.f8041c)) {
                            s3.c.c((s3.c) qVarO.f1935d, qVarO, true);
                            qVarO.f1932a = true;
                        }
                        if (!qVarO.f1932a) {
                            try {
                                qVarO.a();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!qVarO.f1932a) {
                            try {
                                qVarO.a();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            ((s5.j) this.f6154d).x(strL);
        } catch (Throwable th2) {
            ((s5.j) this.f6154d).x(strL);
            throw th2;
        }
    }

    public boolean c(zzft zzftVar, long j4) {
        z2 z2Var = (z2) this.e;
        i0.i(zzftVar);
        if (((ArrayList) this.f6154d) == null) {
            this.f6154d = new ArrayList();
        }
        if (((ArrayList) this.f6153c) == null) {
            this.f6153c = new ArrayList();
        }
        if (((ArrayList) this.f6154d).isEmpty() || ((((zzft) ((ArrayList) this.f6154d).get(0)).zzd() / 1000) / 60) / 60 == ((zzftVar.zzd() / 1000) / 60) / 60) {
            long jZzbz = this.f6151a + ((long) zzftVar.zzbz());
            z2Var.F();
            if (jZzbz < Math.max(0, ((Integer) z.f11462j.a(null)).intValue())) {
                this.f6151a = jZzbz;
                ((ArrayList) this.f6154d).add(zzftVar);
                ((ArrayList) this.f6153c).add(Long.valueOf(j4));
                int size = ((ArrayList) this.f6154d).size();
                z2Var.F();
                if (size < Math.max(1, ((Integer) z.f11464k.a(null)).intValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void d() {
        q0 q0Var = (q0) this.e;
        q0Var.c();
        ((a1) q0Var.f159a).f11012y.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = q0Var.g().edit();
        editorEdit.remove((String) this.f6153c);
        editorEdit.remove((String) this.f6154d);
        editorEdit.putLong((String) this.f6152b, jCurrentTimeMillis);
        editorEdit.apply();
    }

    @Override // y3.a
    public File i(u3.f fVar) {
        String strL = ((s5.j) this.f6152b).l(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strL + " for for Key: " + fVar);
        }
        try {
            a4.b bVarE = a().E(strL);
            if (bVarE != null) {
                return ((File[]) bVarE.f113b)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }
}
