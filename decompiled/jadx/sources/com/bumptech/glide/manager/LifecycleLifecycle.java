package com.bumptech.glide.manager;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements h, androidx.lifecycle.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f1910a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f1911b;

    public LifecycleLifecycle(t tVar) {
        this.f1911b = tVar;
        tVar.a(this);
    }

    @Override // com.bumptech.glide.manager.h
    public final void i(i iVar) {
        this.f1910a.add(iVar);
        androidx.lifecycle.m mVar = this.f1911b.f1093d;
        if (mVar == androidx.lifecycle.m.f1065a) {
            iVar.onDestroy();
        } else if (mVar.compareTo(androidx.lifecycle.m.f1068d) >= 0) {
            iVar.j();
        } else {
            iVar.e();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void k(i iVar) {
        this.f1910a.remove(iVar);
    }

    @a0(androidx.lifecycle.l.ON_DESTROY)
    public void onDestroy(androidx.lifecycle.r rVar) {
        ArrayList arrayListE = p4.n.e(this.f1910a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((i) obj).onDestroy();
        }
        rVar.l().f(this);
    }

    @a0(androidx.lifecycle.l.ON_START)
    public void onStart(androidx.lifecycle.r rVar) {
        ArrayList arrayListE = p4.n.e(this.f1910a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((i) obj).j();
        }
    }

    @a0(androidx.lifecycle.l.ON_STOP)
    public void onStop(androidx.lifecycle.r rVar) {
        ArrayList arrayListE = p4.n.e(this.f1910a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((i) obj).e();
        }
    }
}
