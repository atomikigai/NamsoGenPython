package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import i5.e;
import j5.a;
import java.util.Arrays;
import java.util.List;
import l5.q;
import lb.m;
import r7.g;
import x9.b;
import x9.c;
import x9.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(c cVar) {
        q.b((Context) cVar.a(Context.class));
        return q.a().c(a.f5689f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        x9.a aVarA = b.a(e.class);
        aVarA.f10309a = LIBRARY_NAME;
        aVarA.a(i.b(Context.class));
        aVarA.f10313f = new m(9);
        return Arrays.asList(aVarA.b(), g.l(LIBRARY_NAME, "18.1.8"));
    }
}
