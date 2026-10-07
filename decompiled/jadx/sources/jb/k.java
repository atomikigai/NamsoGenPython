package jb;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import da.v;
import h6.o0;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kb.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Random f5746j = new Random();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap f5747k = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f5750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n9.g f5751d;
    public final za.d e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o9.c f5752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ya.b f5753g;
    public final String h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5748a = new HashMap();
    public final HashMap i = new HashMap();

    public k(Context context, ScheduledExecutorService scheduledExecutorService, n9.g gVar, za.d dVar, o9.c cVar, ya.b bVar) {
        this.f5749b = context;
        this.f5750c = scheduledExecutorService;
        this.f5751d = gVar;
        this.e = dVar;
        this.f5752f = cVar;
        this.f5753g = bVar;
        gVar.a();
        this.h = gVar.f7361c.f7367b;
        AtomicReference atomicReference = j.f5745a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = j.f5745a;
        if (atomicReference2.get() == null) {
            j jVar = new j();
            while (!atomicReference2.compareAndSet(null, jVar)) {
                if (atomicReference2.get() != null) {
                }
            }
            com.google.android.gms.common.api.internal.c.b(application);
            com.google.android.gms.common.api.internal.c.e.a(jVar);
        }
        Tasks.call(scheduledExecutorService, new androidx.webkit.internal.a(this, 3));
    }

    public final synchronized b a(n9.g gVar, za.d dVar, o9.c cVar, Executor executor, kb.c cVar2, kb.c cVar3, kb.c cVar4, kb.h hVar, kb.i iVar, kb.k kVar) {
        if (!this.f5748a.containsKey("firebase")) {
            gVar.a();
            if (!gVar.f7360b.equals("[DEFAULT]")) {
                cVar = null;
            }
            o9.c cVar5 = cVar;
            Context context = this.f5749b;
            synchronized (this) {
                b bVar = new b(cVar5, executor, cVar2, cVar3, cVar4, hVar, iVar, kVar, new a2.l(gVar, dVar, hVar, cVar3, context, kVar, this.f5750c));
                cVar3.b();
                cVar4.b();
                cVar2.b();
                this.f5748a.put("firebase", bVar);
                f5747k.put("firebase", bVar);
            }
        }
        return (b) this.f5748a.get("firebase");
    }

    public final kb.c b(String str) {
        n nVar;
        kb.c cVar;
        String strK = v.k("frc_", this.h, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f5750c;
        Context context = this.f5749b;
        HashMap map = n.f6202c;
        synchronized (n.class) {
            try {
                HashMap map2 = n.f6202c;
                if (!map2.containsKey(strK)) {
                    map2.put(strK, new n(context, strK));
                }
                nVar = (n) map2.get(strK);
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map3 = kb.c.f6147d;
        synchronized (kb.c.class) {
            try {
                String str2 = nVar.f6204b;
                HashMap map4 = kb.c.f6147d;
                if (!map4.containsKey(str2)) {
                    map4.put(str2, new kb.c(scheduledExecutorService, nVar));
                }
                cVar = (kb.c) map4.get(str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public final b c() throws Throwable {
        synchronized (this) {
            try {
                try {
                    kb.c cVarB = b("fetch");
                    kb.c cVarB2 = b("activate");
                    kb.c cVarB3 = b("defaults");
                    kb.k kVar = new kb.k(this.f5749b.getSharedPreferences("frc_" + this.h + "_firebase_settings", 0));
                    kb.i iVar = new kb.i(this.f5750c, cVarB2, cVarB3);
                    n9.g gVar = this.f5751d;
                    ya.b bVar = this.f5753g;
                    gVar.a();
                    o0 o0Var = gVar.f7360b.equals("[DEFAULT]") ? new o0(bVar) : null;
                    if (o0Var != null) {
                        h hVar = new h(o0Var);
                        synchronized (iVar.f6176a) {
                            iVar.f6176a.add(hVar);
                        }
                    }
                    return a(this.f5751d, this.e, this.f5752f, this.f5750c, cVarB, cVarB2, cVarB3, d(cVarB, kVar), iVar, kVar);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final synchronized kb.h d(kb.c cVar, kb.k kVar) {
        za.d dVar;
        ya.b iVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        n9.g gVar;
        try {
            dVar = this.e;
            n9.g gVar2 = this.f5751d;
            gVar2.a();
            iVar = gVar2.f7360b.equals("[DEFAULT]") ? this.f5753g : new i(0);
            scheduledExecutorService = this.f5750c;
            random = f5746j;
            n9.g gVar3 = this.f5751d;
            gVar3.a();
            str = gVar3.f7361c.f7366a;
            gVar = this.f5751d;
            gVar.a();
        } catch (Throwable th) {
            throw th;
        }
        return new kb.h(dVar, iVar, scheduledExecutorService, random, cVar, new ConfigFetchHttpClient(this.f5749b, gVar.f7361c.f7367b, str, kVar.f6183a.getLong("fetch_timeout_in_seconds", 60L), kVar.f6183a.getLong("fetch_timeout_in_seconds", 60L)), kVar, this.i);
    }
}
