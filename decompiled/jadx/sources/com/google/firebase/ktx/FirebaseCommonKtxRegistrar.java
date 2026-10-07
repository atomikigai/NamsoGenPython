package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import jd.d;
import r7.g;
import rc.x;
import t9.a;
import t9.c;
import vb.j;
import x9.b;
import x9.i;
import x9.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        b bVarL = g.l("fire-core-ktx", "unspecified");
        q qVar = new q(a.class, x.class);
        q[] qVarArr = new q[0];
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            d.f(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        i iVar = new i(new q(a.class, Executor.class), 1, 0);
        if (hashSet.contains(iVar.f10334a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(iVar);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, fb.a.f3891b, hashSet3);
        q qVar3 = new q(c.class, x.class);
        q[] qVarArr2 = new q[0];
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            d.f(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        i iVar2 = new i(new q(c.class, Executor.class), 1, 0);
        if (hashSet4.contains(iVar2.f10334a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet5.add(iVar2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, fb.a.f3892c, hashSet6);
        q qVar5 = new q(t9.b.class, x.class);
        q[] qVarArr3 = new q[0];
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            d.f(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        i iVar3 = new i(new q(t9.b.class, Executor.class), 1, 0);
        if (hashSet7.contains(iVar3.f10334a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet8.add(iVar3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, fb.a.f3893d, hashSet9);
        q qVar7 = new q(t9.d.class, x.class);
        q[] qVarArr4 = new q[0];
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(qVar7);
        for (q qVar8 : qVarArr4) {
            d.f(qVar8, "Null interface");
        }
        Collections.addAll(hashSet10, qVarArr4);
        i iVar4 = new i(new q(t9.d.class, Executor.class), 1, 0);
        if (hashSet10.contains(iVar4.f10334a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet11.add(iVar4);
        return j.S(bVarL, bVar, bVar2, bVar3, new b(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, fb.a.e, hashSet12));
    }
}
