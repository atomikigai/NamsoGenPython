package com.google.firebase.auth;

import bd.u;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import n9.g;
import t4.f;
import t9.d;
import u9.a;
import w9.c0;
import wa.e;
import x9.c;
import x9.i;
import x9.q;
import ya.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static FirebaseAuth lambda$getComponents$0(q qVar, q qVar2, q qVar3, q qVar4, q qVar5, c cVar) {
        g gVar = (g) cVar.a(g.class);
        b bVarD = cVar.d(a.class);
        b bVarD2 = cVar.d(e.class);
        return new c0(gVar, bVarD, bVarD2, (Executor) cVar.f(qVar2), (Executor) cVar.f(qVar3), (ScheduledExecutorService) cVar.f(qVar4), (Executor) cVar.f(qVar5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x9.b> getComponents() {
        q qVar = new q(t9.a.class, Executor.class);
        q qVar2 = new q(t9.b.class, Executor.class);
        q qVar3 = new q(t9.c.class, Executor.class);
        q qVar4 = new q(t9.c.class, ScheduledExecutorService.class);
        q qVar5 = new q(d.class, Executor.class);
        x9.a aVar = new x9.a(FirebaseAuth.class, new Class[]{w9.a.class});
        aVar.a(i.b(g.class));
        aVar.a(new i(1, 1, e.class));
        aVar.a(new i(qVar, 1, 0));
        aVar.a(new i(qVar2, 1, 0));
        aVar.a(new i(qVar3, 1, 0));
        aVar.a(new i(qVar4, 1, 0));
        aVar.a(new i(qVar5, 1, 0));
        aVar.a(i.a(a.class));
        aVar.f10313f = new u(qVar, qVar2, qVar3, qVar4, qVar5, 10);
        x9.b bVarB = aVar.b();
        wa.d dVar = new wa.d();
        x9.a aVarA = x9.b.a(wa.d.class);
        aVarA.e = 1;
        aVarA.f10313f = new f(dVar);
        return Arrays.asList(bVarB, aVarA.b(), r7.g.l("fire-auth", "22.1.2"));
    }
}
