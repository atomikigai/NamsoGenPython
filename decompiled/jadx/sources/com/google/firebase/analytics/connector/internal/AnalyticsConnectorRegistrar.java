package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.zzef;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import n9.g;
import r9.b;
import r9.d;
import r9.e;
import x9.a;
import x9.c;
import x9.i;
import x9.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static b lambda$getComponents$0(c cVar) {
        g gVar = (g) cVar.a(g.class);
        Context context = (Context) cVar.a(Context.class);
        va.c cVar2 = (va.c) cVar.a(va.c.class);
        i0.i(gVar);
        i0.i(context);
        i0.i(cVar2);
        i0.i(context.getApplicationContext());
        if (r9.c.f8231c == null) {
            synchronized (r9.c.class) {
                try {
                    if (r9.c.f8231c == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f7360b)) {
                            ((k) cVar2).a(d.f8234a, e.f8235a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.j());
                        }
                        r9.c.f8231c = new r9.c(zzef.zzg(context, null, null, null, bundle).zzd());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return r9.c.f8231c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x9.b> getComponents() {
        a aVarA = x9.b.a(b.class);
        aVarA.a(i.b(g.class));
        aVarA.a(i.b(Context.class));
        aVarA.a(i.b(va.c.class));
        aVarA.f10313f = s9.a.f8455a;
        aVarA.c(2);
        return Arrays.asList(aVarA.b(), r7.g.l("fire-analytics", "21.3.0"));
    }
}
