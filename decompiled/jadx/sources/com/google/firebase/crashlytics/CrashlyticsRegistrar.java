package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import lb.l;
import mb.a;
import mb.c;
import mb.d;
import n9.g;
import s5.e;
import x9.b;
import x9.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2723a = 0;

    static {
        c cVar = c.f7093a;
        Map map = c.f7094b;
        d dVar = d.f7095a;
        if (!map.containsKey(dVar)) {
            map.put(dVar, new a(new zc.d(true)));
            return;
        }
        Log.d("SessionsDependencies", "Dependency " + dVar + " already added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        x9.a aVarA = b.a(z9.c.class);
        aVarA.f10309a = "fire-cls";
        aVarA.a(i.b(g.class));
        aVarA.a(i.b(za.d.class));
        aVarA.a(i.b(l.class));
        aVarA.a(new i(0, 2, aa.b.class));
        aVarA.a(new i(0, 2, r9.b.class));
        aVarA.f10313f = new e(this);
        aVarA.c(2);
        return Arrays.asList(aVarA.b(), r7.g.l("fire-cls", "18.4.3"));
    }
}
