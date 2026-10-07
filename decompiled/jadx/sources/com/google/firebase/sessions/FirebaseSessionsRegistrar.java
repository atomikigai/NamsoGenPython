package com.google.firebase.sessions;

import com.google.firebase.components.ComponentRegistrar;
import i5.e;
import java.util.List;
import jc.i;
import lb.l;
import lb.m;
import lb.n;
import n9.g;
import rc.x;
import t9.a;
import t9.b;
import vb.j;
import x9.c;
import x9.q;
import za.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-sessions";
    public static final n Companion = new n();
    private static final q firebaseApp = q.a(g.class);
    private static final q firebaseInstallationsApi = q.a(d.class);
    private static final q backgroundDispatcher = new q(a.class, x.class);
    private static final q blockingDispatcher = new q(b.class, x.class);
    private static final q transportFactory = q.a(e.class);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-0, reason: not valid java name */
    public static final l m4getComponents$lambda0(c cVar) {
        Object objF = cVar.f(firebaseApp);
        i.d(objF, "container.get(firebaseApp)");
        Object objF2 = cVar.f(firebaseInstallationsApi);
        i.d(objF2, "container.get(firebaseInstallationsApi)");
        Object objF3 = cVar.f(backgroundDispatcher);
        i.d(objF3, "container.get(backgroundDispatcher)");
        Object objF4 = cVar.f(blockingDispatcher);
        i.d(objF4, "container.get(blockingDispatcher)");
        ya.b bVarC = cVar.c(transportFactory);
        i.d(bVarC, "container.getProvider(transportFactory)");
        return new l((g) objF, (d) objF2, (x) objF3, (x) objF4, bVarC);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x9.b> getComponents() {
        x9.a aVarA = x9.b.a(l.class);
        aVarA.f10309a = LIBRARY_NAME;
        aVarA.a(new x9.i(firebaseApp, 1, 0));
        aVarA.a(new x9.i(firebaseInstallationsApi, 1, 0));
        aVarA.a(new x9.i(backgroundDispatcher, 1, 0));
        aVarA.a(new x9.i(blockingDispatcher, 1, 0));
        aVarA.a(new x9.i(transportFactory, 1, 1));
        aVarA.f10313f = new m(0);
        return j.S(aVarA.b(), r7.g.l(LIBRARY_NAME, "1.0.2"));
    }
}
