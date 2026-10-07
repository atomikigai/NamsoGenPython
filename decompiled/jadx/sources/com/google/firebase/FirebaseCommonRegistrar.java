package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import jb.l;
import lb.m;
import n9.g;
import wa.c;
import wa.d;
import wa.e;
import wa.f;
import x9.a;
import x9.b;
import x9.i;
import x9.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        a aVarA = b.a(ib.b.class);
        aVarA.a(new i(2, 0, ib.a.class));
        aVarA.f10313f = new ga.a(21);
        arrayList.add(aVarA.b());
        q qVar = new q(t9.a.class, Executor.class);
        a aVar = new a(c.class, new Class[]{e.class, f.class});
        aVar.a(i.b(Context.class));
        aVar.a(i.b(g.class));
        aVar.a(new i(2, 0, d.class));
        aVar.a(new i(1, 1, ib.b.class));
        aVar.a(new i(qVar, 1, 0));
        aVar.f10313f = new l(qVar, 1);
        arrayList.add(aVar.b());
        arrayList.add(r7.g.l("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(r7.g.l("fire-core", "20.3.3"));
        arrayList.add(r7.g.l("device-name", a(Build.PRODUCT)));
        arrayList.add(r7.g.l("device-model", a(Build.DEVICE)));
        arrayList.add(r7.g.l("device-brand", a(Build.BRAND)));
        arrayList.add(r7.g.p("android-target-sdk", new m(3)));
        arrayList.add(r7.g.p("android-min-sdk", new m(4)));
        arrayList.add(r7.g.p("android-platform", new m(5)));
        arrayList.add(r7.g.p("android-installer", new m(6)));
        try {
            ub.b.f9062b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(r7.g.l("kotlin", str));
        }
        return arrayList;
    }
}
