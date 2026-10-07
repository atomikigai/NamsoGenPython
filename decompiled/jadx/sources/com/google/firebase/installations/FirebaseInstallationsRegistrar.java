package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import n9.g;
import t4.f;
import t9.a;
import t9.b;
import wa.e;
import x9.c;
import x9.i;
import x9.q;
import y9.k;
import za.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        return new za.c((g) cVar.a(g.class), cVar.d(e.class), (ExecutorService) cVar.f(new q(a.class, ExecutorService.class)), new k((Executor) cVar.f(new q(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x9.b> getComponents() {
        x9.a aVarA = x9.b.a(d.class);
        aVarA.f10309a = LIBRARY_NAME;
        aVarA.a(i.b(g.class));
        aVarA.a(i.a(e.class));
        aVarA.a(new i(new q(a.class, ExecutorService.class), 1, 0));
        aVarA.a(new i(new q(b.class, Executor.class), 1, 0));
        aVarA.f10313f = new s5.e(18);
        x9.b bVarB = aVarA.b();
        wa.d dVar = new wa.d();
        x9.a aVarA2 = x9.b.a(wa.d.class);
        aVarA2.e = 1;
        aVarA2.f10313f = new f(dVar);
        return Arrays.asList(bVarB, aVarA2.b(), r7.g.l(LIBRARY_NAME, "17.1.4"));
    }
}
