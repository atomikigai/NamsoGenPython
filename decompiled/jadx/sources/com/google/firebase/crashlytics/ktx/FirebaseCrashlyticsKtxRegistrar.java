package com.google.firebase.crashlytics.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import jd.d;
import ma.a;
import r7.g;
import x9.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    public static final a Companion = new a();
    public static final String LIBRARY_NAME = "fire-cls-ktx";

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        return d.D(g.l(LIBRARY_NAME, "unspecified"));
    }
}
