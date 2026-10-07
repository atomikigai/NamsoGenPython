package com.google.firebase.database;

import a5.b;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import lb.m;
import n9.g;
import na.a;
import x9.c;
import x9.i;
import x9.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(c cVar) {
        o oVarG = cVar.g(w9.a.class);
        o oVarG2 = cVar.g(u9.a.class);
        a aVar = new a();
        new HashMap();
        new b(oVarG);
        new ib.c(oVarG2);
        return aVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x9.b> getComponents() {
        x9.a aVarA = x9.b.a(a.class);
        aVarA.f10309a = LIBRARY_NAME;
        aVarA.a(i.b(g.class));
        aVarA.a(new i(0, 2, w9.a.class));
        aVarA.a(new i(0, 2, u9.a.class));
        aVarA.f10313f = new m(7);
        return Arrays.asList(aVarA.b(), r7.g.l(LIBRARY_NAME, "20.2.2"));
    }
}
