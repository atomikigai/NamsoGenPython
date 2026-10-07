package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import jb.i;
import jd.d;
import s5.e;
import t9.c;
import x9.b;
import x9.m;
import x9.q;
import y9.a;
import y9.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f2719a = new m(new i(3));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f2720b = new m(new i(4));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f2721c = new m(new i(5));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f2722d = new m(new i(6));

    public static f a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new f(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) f2722d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        q qVar = new q(t9.a.class, ScheduledExecutorService.class);
        q[] qVarArr = {new q(t9.a.class, ExecutorService.class), new q(t9.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            d.f(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new e(13), hashSet3);
        q qVar3 = new q(t9.b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(t9.b.class, ExecutorService.class), new q(t9.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            d.f(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new e(14), hashSet6);
        q qVar5 = new q(c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(c.class, ExecutorService.class), new q(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            d.f(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new e(15), hashSet9);
        q qVar7 = new q(t9.d.class, Executor.class);
        q[] qVarArr4 = new q[0];
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(qVar7);
        for (q qVar8 : qVarArr4) {
            d.f(qVar8, "Null interface");
        }
        Collections.addAll(hashSet10, qVarArr4);
        return Arrays.asList(bVar, bVar2, bVar3, new b(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, new e(16), hashSet12));
    }
}
