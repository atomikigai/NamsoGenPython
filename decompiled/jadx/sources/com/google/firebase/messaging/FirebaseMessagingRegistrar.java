package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import i5.e;
import ib.b;
import java.util.Arrays;
import java.util.List;
import n9.g;
import wa.f;
import x9.c;
import x9.i;
import xa.a;
import za.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(c cVar) {
        g gVar = (g) cVar.a(g.class);
        if (cVar.a(a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.d(b.class), cVar.d(f.class), (d) cVar.a(d.class), (e) cVar.a(e.class), (va.c) cVar.a(va.c.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x9.b> getComponents() {
        x9.a aVarA = x9.b.a(FirebaseMessaging.class);
        aVarA.f10309a = LIBRARY_NAME;
        aVarA.a(i.b(g.class));
        aVarA.a(new i(0, 0, a.class));
        aVarA.a(i.a(b.class));
        aVarA.a(i.a(f.class));
        aVarA.a(new i(0, 0, e.class));
        aVarA.a(i.b(d.class));
        aVarA.a(i.b(va.c.class));
        aVarA.f10313f = new ga.a(9);
        aVarA.c(1);
        return Arrays.asList(aVarA.b(), r7.g.l(LIBRARY_NAME, "23.2.1"));
    }
}
