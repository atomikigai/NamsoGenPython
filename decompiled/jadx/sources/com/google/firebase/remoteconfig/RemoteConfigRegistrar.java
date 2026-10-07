package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import jb.k;
import jb.l;
import n9.g;
import p9.a;
import r9.b;
import x9.c;
import x9.i;
import x9.q;
import za.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static k lambda$getComponents$0(q qVar, c cVar) {
        o9.c cVar2;
        Context context = (Context) cVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) cVar.f(qVar);
        g gVar = (g) cVar.a(g.class);
        d dVar = (d) cVar.a(d.class);
        a aVar = (a) cVar.a(a.class);
        synchronized (aVar) {
            try {
                if (!aVar.f7832a.containsKey("frc")) {
                    aVar.f7832a.put("frc", new o9.c(aVar.f7833b));
                }
                cVar2 = (o9.c) aVar.f7832a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new k(context, scheduledExecutorService, gVar, dVar, cVar2, cVar.d(b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x9.b> getComponents() {
        q qVar = new q(t9.b.class, ScheduledExecutorService.class);
        x9.a aVarA = x9.b.a(k.class);
        aVarA.f10309a = LIBRARY_NAME;
        aVarA.a(i.b(Context.class));
        aVarA.a(new i(qVar, 1, 0));
        aVarA.a(i.b(g.class));
        aVarA.a(i.b(d.class));
        aVarA.a(i.b(a.class));
        aVarA.a(i.a(b.class));
        aVarA.f10313f = new l(qVar, 0);
        aVarA.c(2);
        return Arrays.asList(aVarA.b(), r7.g.l(LIBRARY_NAME, "21.4.1"));
    }
}
