package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import lb.m;
import p9.a;
import r7.g;
import r9.b;
import x9.c;
import x9.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(c cVar) {
        return new a((Context) cVar.a(Context.class), cVar.d(b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x9.b> getComponents() {
        x9.a aVarA = x9.b.a(a.class);
        aVarA.f10309a = LIBRARY_NAME;
        aVarA.a(i.b(Context.class));
        aVarA.a(i.a(b.class));
        aVarA.f10313f = new m(8);
        return Arrays.asList(aVarA.b(), g.l(LIBRARY_NAME, "21.1.1"));
    }
}
